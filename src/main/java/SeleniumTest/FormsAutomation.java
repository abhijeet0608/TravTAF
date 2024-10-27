package SeleniumTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FormsAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/forms");		
		driver.findElement(By.xpath("//div[@class='element-list collapse show']//ul//li")).click();
		
		WebElement fn = driver.findElement(By.id("firstName"));
		
		
		
		
		Actions action = new Actions(driver);
		action.moveToElement(fn).click().sendKeys("Abhijeet");
		
		WebElement ln = driver.findElement(By.id("lastName"));
		WebElement email_id = driver.findElement(By.id("userEmail"));
		WebElement gender = driver.findElement(By.id("gender-radio-1"));
		gender.click();
		System.out.println(gender.isDisplayed());
		System.out.println(gender.isEnabled());
		System.out.println(gender.isSelected());
		
		WebElement userNumber = driver.findElement(By.id("userNumber"));
		userNumber.sendKeys("9766107297");
		
		WebElement Calender = driver.findElement(By.id("dateOfBirthInput"));
		Calender.click();
		
		WebElement dateSelection = driver.findElement(By.className("react-datepicker__day react-datepicker__day--018 react-datepicker__day--selected react-datepicker__day--today react-datepicker__day--weekend"));
		dateSelection.click();
		
		WebElement subjects = driver.findElement(By.className("subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3"));
		subjects.click();
		subjects.sendKeys("English");
		
		
		List<WebElement> opts = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		
		
		for(WebElement opt:opts)
		{
			
			opt.click();
			System.out.println(opt.isSelected());
			String Actual =opt.getText();
			
			
			if(Actual == "sports")
			{
					System.out.println("dropdown of sports is selected" );
					
			}
			break;
		}
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
