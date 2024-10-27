package SeleniumTest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alertsWindows");
		
		
		System.out.println(driver.getTitle());
		
		JavascriptExecutor js = 	(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		
		
		driver.findElement(By.xpath("(//div[@class=\"element-list collapse show\"])//ul//li[1]")).click();
		
		js.executeScript("window.scrollBy(0,300)");
		
		
		String mainWindow =driver.getWindowHandle();
		System.out.println(mainWindow);
		
		driver.findElement(By.id("tabButton")).click();
		
		
	
		
		Set<String> allwindows =driver.getWindowHandles();
		Iterator<String> itr=allwindows.iterator();
		
		
		
	   while(itr.hasNext())
	   {
		  String childwindow= itr.next();
		  
		  if(!mainWindow.equalsIgnoreCase(childwindow))
		  {
			  driver.switchTo().window(childwindow);
			  
			  WebElement Text = driver.findElement(By.id("sampleHeading"));
			  System.out.println(Text.getText());
			  driver.close();
		  }
		  
		
			  
	   }
	   
	   driver.switchTo().window(mainWindow);
		driver.close();
		
		
		
		
		
	}

}
