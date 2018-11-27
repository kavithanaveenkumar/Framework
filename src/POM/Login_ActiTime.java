package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class Login_ActiTime extends BasePage
{
	@FindBy(id="username")
	private WebElement username;
	@FindBy(name="pwd") 
	private WebElement password;
	@FindBy(id="loginButton")
	private WebElement login;
	
	public Login_ActiTime(WebDriver driver) 
	{
		super (driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername (String un)
	{
		this.username.sendKeys(un);
	}
	public void setPassword (String pwd)
	{
		this.password.sendKeys(pwd);
	}
	public void clickLogin ()
	{
		this.login.click();
	}
}
