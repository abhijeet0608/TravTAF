package SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		
		System.out.println(driver.getTitle());
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,400)");
		
		System.out.println(driver.findElement(By.cssSelector("[class=\"text-center\"]")).getText());
		
		driver.findElement(By.id("alertButton")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		System.out.println("Alert Accepted");
		
		
		driver.findElement(By.id("alertButton")).click();
		
		
		System.out.println(alert.getText());
	
		alert.dismiss();
		
		System.out.println("Alert Dismissed");
		
		driver.findElement(By.id("confirmButton")).click();
		
		System.out.println(alert.getText());
		
		alert.dismiss();
		
	    System.out.println(driver.findElement(By.id("confirmResult")).getText());
	    
	    driver.findElement(By.id("promtButton")).click();
	    
	    alert.sendKeys("Abhijeet");
	    
	    alert.accept();
	    
	    System.out.println(driver.findElement(By.id("promptResult")).getText());
		
	    
		
	}

}
