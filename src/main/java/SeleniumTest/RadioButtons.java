package SeleniumTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/radio-button");
		
		JavascriptExecutor js = 	(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		
		driver.findElement(By.cssSelector("class=\"custom-control custom-radio custom-control-inline")).click();
		
		
		List<WebElement> rbs=driver.findElements(By.cssSelector("[name=\"like\"]"));
		
		
		for(WebElement rb :rbs)
		{
			String Text = rb.getText();
			System.out.println(Text);
		}
		
		
		
	}

}
