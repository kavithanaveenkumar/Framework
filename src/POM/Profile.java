package POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class Profile extends BasePage 
{
	@FindBy(id="userProfilePopup_startingNewWeekRadio_keepAllOption")
	private WebElement radiobutton;
	
	public Profile(WebDriver driver) 
	{
		super (driver);
		PageFactory.initElements(driver, this);
	}
	
	public void selectRadioButton()
	{
		this.radiobutton.click();
	}
	public void closeButton(WebDriver driver)
	{
		Alert a = driver.switchTo().alert();
		a.accept();
	}
}
