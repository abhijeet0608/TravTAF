package SeleniumTest;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/checkbox");
		
		JavascriptExecutor js = 	(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		
		driver.findElement(By.cssSelector("[class=\"rct-checkbox\"] svg")).click();
		
		driver.findElement(By.cssSelector("button[title=\"Toggle\"]")).click();
		
		System.out.println(driver.findElement(By.cssSelector("button[title=\"Toggle\"]")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("button[title=\"Toggle\"]")).isEnabled());
		System.out.println(driver.findElement(By.cssSelector("button[title=\"Toggle\"]")).isSelected());
		
		
		
		List<WebElement> options = driver.findElements(By.cssSelector("class=\"rct-icon rct-icon-check\""));
		
		System.out.println(options.size());
		
	for(WebElement option:options)
	{
		String Text = option.getText();
		
		System.out.println(Text);
		
		
		
	}
	
		
		
	}

}
