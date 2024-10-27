package SeleniumTest;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class FormFilling {
	static String currentAddress = "A/P - Pundi, Tal - Tasgaon, Dist - Sangli, Zip Code - 416312";
	static String parmenantAddress = "A/P - Pundi, Tal - Tasgaon, Dist - Sangli, Zip Code - 416312";


	public static void main(String[] args) {
		
		
		String actualText = "Text Box";
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/elements");

		driver.findElement(By.id("item-0")).click();
		
		JavascriptExecutor js = 	(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		
		WebElement UN = driver.findElement(By.id("userName"));
		UN.clear();
		System.out.println(UN.isDisplayed());
		System.out.println(UN.isEnabled());
		System.out.println(UN.isSelected());
		
		UN.sendKeys("Abhijeet");
				
		System.out.println(UN.isDisplayed());
		System.out.println(UN.isEnabled());
		System.out.println(UN.isSelected());
		
		WebElement USEID= driver.findElement(By.id("userEmail"));
		USEID.sendKeys("abhijeetgavali7297@gmail.com");
		
	
		
		WebElement cAddress = driver.findElement(By.id("currentAddress"));
		cAddress.sendKeys(currentAddress);
		
		WebElement pAddress = driver.findElement(By.id("permanentAddress"));
		pAddress.sendKeys(parmenantAddress);
		
		js.executeScript("window.scrollBy(0,300)");
		
		String expectedText = driver.findElement(By.cssSelector(".text-center")).getText();
		
	System.out.println(expectedText.equalsIgnoreCase(actualText));
	
	   
	    
		
		WebElement submit = driver.findElement(By.cssSelector("[class=\"mt-2 justify-content-end row\"] div button"));
		
		submit.click();
		
		
		driver.close();
		
		
		
		
	}


	
	

}
