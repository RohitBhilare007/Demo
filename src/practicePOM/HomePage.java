package practicePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	public WebDriver driver;
	
	public Actions act;
	
	@FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]/b")
	WebElement admin;
	
	
	act = new Actions(driver);
	
	public HomePage(WebDriver driver)
	
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		
	
		
	}

	public void sendadmin()
	{
		act.moveToElement(admin).perform();
	}
	

}
