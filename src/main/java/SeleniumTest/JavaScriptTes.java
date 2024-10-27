package SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class JavaScriptTes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();	
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,500)");
		//js.executeScript("document.querySelector('.tableFixHead').scrollTop=\"500\");");	 
	List<WebElement> values = driver.findElements(By.xpath("//div[@class=\"tableFixHead\"]//td[4]"));
	int size = values.size();
	int sum=0;
	for(WebElement value :values)
	{
	   sum = sum + Integer.parseInt(value.getText());	
	   }
	System.out.println(sum);
	
	int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
	
	if(sum==total)
	{
		System.out.println("Test is passed");
	}
	driver.close();
	
}

}
