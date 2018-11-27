package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class Enter_Time_Track extends BasePage
{
	@FindBy(xpath="//a [@class='content users']")
	private WebElement users;
	@FindBy(xpath="//a [@class='content reports']")
	private WebElement repor;
	@FindBy(xpath="//a [@class='userProfileLink username']")
	private WebElement loggedinUser;
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public Enter_Time_Track(WebDriver driver) 
	{
		super (driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickUsers ()
	{
		this.elementVisibility (this.users);
		this.users.click();
	}
	public void clickReports()
	{
		this.elementVisibility(this.repor);
		this.repor.click();
	}
	public void clickLoggedinUser()
	{
		this.loggedinUser.click();
	}
	public void clickLogout()
	{
		this.logout.click();
	}
	
}


