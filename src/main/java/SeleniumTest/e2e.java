package SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("Pune");
		driver.findElement(By.id("dest")).sendKeys("Sangli");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".labelCalendarContainer")).click();
		driver.findElement(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 fgdqFw']")).click();
		driver.findElement(By.id("search_button")).click();
		
		driver.findElement(By.xpath("(//div[@class='clearfix bus-item']//div[@class='button view-seats fr'])[1]")).click();
		
		driver.findElement(By.xpath("//li[@id='14365898']//div[@class='button view-seats fr']"));
		
		//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 fgdqFw']
	}

}
