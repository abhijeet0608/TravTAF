package SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/frames");
		
		System.out.println(driver.getTitle());
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,600)");
		
		System.out.println(driver.findElement(By.cssSelector("[class=\"text-center\"]")).getText());
		
		
		driver.switchTo().frame("frame1");
		
		System.out.println("Switched");
		
//		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
//		
//		driver.switchTo().parentFrame();
//		
//		
//		
//		driver.switchTo().frame("frame2");
//		
//		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
//		
//		
//		
//		driver.switchTo().defaultContent();
//		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
