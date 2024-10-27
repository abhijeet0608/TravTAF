package SeleniumTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

class WebDriver_Commands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		// Invoking of Browsers by using get and navigate method and try forward backward and refresh
				
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.manage().window().minimize();
				Thread.sleep(2000);
				driver.manage().window().fullscreen();
				Thread.sleep(2000);
	Point point = new Point(0, 0);
	point.moveBy(180, 100);
				
				driver.get("https://www.google.co.in/");
				Thread.sleep(2000);
		        driver.navigate().to("https://rahulshettyacademy.com/");
				Thread.sleep(2000);
		        driver.navigate().back();
		        Thread.sleep(2000);
		        driver.navigate().forward();
		        Thread.sleep(2000);
		        driver.navigate().refresh();
		        Thread.sleep(2000);
		        
	String Title = driver.getTitle();
	System.out.println(Title);
	             driver.quit();
		
	
				


    
}
}