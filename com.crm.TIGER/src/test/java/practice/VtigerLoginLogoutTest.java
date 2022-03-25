package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VtigerLoginLogoutTest {
	WebDriver driver=null;
	@Test
	public void paramertes() throws Throwable
	{
		
		  String BROWSER=System.getProperty("browser"); String
		  URl=System.getProperty("url"); String
		 USERNAME=System.getProperty("username"); String
		 PASSWORD=System.getProperty("password");
		 
		
	if  ( BROWSER.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
			}
		else if (BROWSER.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else {
			throw new Exception("browser is not compatible");
		}
		
		
		
		driver.manage().window().maximize();
		driver.get(URl);
		
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		
		Actions act = new Actions(driver);
	WebElement administrator =	driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	act.moveToElement(administrator).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		
	}
}
