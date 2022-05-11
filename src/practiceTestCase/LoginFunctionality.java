package practiceTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import practicePOM.LoginPage;

public class LoginFunctionality<LoginPage1> {

	WebDriver driver;
	
	@BeforeMethod
	
	@Test
	
	public void LoginFunctionality()
	{
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\My Pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	 driver= new ChromeDriver();
	 
		driver.manage().window().maximize();
	 
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	
	LoginPage LP =new LoginPage(driver);
	
	LP.sendusername();
	
	LP.sendpassword();
	
	LP.sendclickbutton();
	
	
	
	
	
		
		
	}
}
