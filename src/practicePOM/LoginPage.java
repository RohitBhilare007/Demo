package practicePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement passward;
	
	@FindBy(xpath="//input[@name='Submit']")
	WebElement submit;
	
	
	public LoginPage(WebDriver driver)
	
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	
	public void sendusername()
	{
		username.sendKeys("Admin");
	}
	
	public void sendpassword()
	{
		passward.sendKeys("admin123");
	}
	
	public void sendclickbutton() 
	{
		submit.click();    	
	}
	
	

}
