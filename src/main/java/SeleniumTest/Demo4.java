package SeleniumTest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		
		System.out.println(driver.getTitle());
		
		JavascriptExecutor js = 	(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		
		String mainWindow = driver.getWindowHandle();
		
		driver.findElement(By.id("messageWindowButton")).click();
		
		
		Set<String> allwindow =driver.getWindowHandles();
		Iterator<String> itr = allwindow.iterator();
		
		
		while(itr.hasNext())
		{
			String childwindow = itr.next();
			
			if(!mainWindow.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
//				WebElement windowText = driver.findElement(By.xpath("//html//body"));
//				System.out.println(windowText.getText());
				driver.close();
			}
			}
			
			
		driver.switchTo().window(mainWindow);
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
