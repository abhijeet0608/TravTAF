package SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {
	
	static String RadioBtn;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		/*
		System.out.println(driver.findElement(By.cssSelector("input[value='radio1']")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("input[value='radio1']")).isEnabled());
		System.out.println(driver.findElement(By.cssSelector("input[value='radio1']")).isSelected());
		
		driver.findElement(By.cssSelector("input[value='radio1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[value='radio1']")).isSelected());
		
		RadioBtn = driver.findElement(By.cssSelector("label[for='radio1']")).getText();
		
		
		List<WebElement> opts =driver.findElements(By.cssSelector(".radioButton"));
		
		for(WebElement opt:opts )
		{
			opts.get(2).click();
		}
		*/
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		dropdown.click();
		
		Select select = new Select(dropdown);
		
		System.out.println(select.isMultiple());
		
		select.selectByValue("option1");
		select.selectByVisibleText("Option2");
		select.selectByIndex(3);
				
		
				
				
		
		
		
		List<WebElement> opts =driver.findElements(By.cssSelector("input[type='checkbox']"));
		
		
		for(WebElement opt:opts)
		{
			opt.click();
		}
		  
		
		driver.findElement(By.id("name")).sendKeys("Abhijeet");
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().accept();
		
		
		

}
}