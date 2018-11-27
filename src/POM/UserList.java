package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;
import Generic.Selec;

public class UserList extends BasePage 
{
	@FindBy(xpath="//div [@class='addUserButton beigeButton useNativeActive']")
	private WebElement addUsers;
	/*web elements for adding users*/
	@FindBy(id="userDataLightBox_firstNameField")
	private WebElement firstName;
	@FindBy(id="userDataLightBox_lastNameField")
	private WebElement lastName;
	@FindBy(id="userDataLightBox_emailField")
	private WebElement email;
	@FindBy(id="userDataLightBox_usernameField")
	private WebElement userName;
	@FindBy(id="userDataLightBox_passwordField")
	private WebElement password;
	@FindBy(id="userDataLightBox_passwordCopyField")
	private WebElement retypePassword;
	@FindBy(id="userDataLightBox_commitBtn")
	private WebElement createUserButton;
	/*web element of search box to identify existing users*/
	@FindBy (xpath="//input [@class='filterFieldInput inputFieldWithPlaceholder']")
	private WebElement search;
	@FindBy (xpath="//span [@class='highlightToken']")
	private WebElement searchElement;
	/*web element of time zone group of edit users*/
	/*@FindBy (xpath="(//td [@class='x-btn-center'])[3]")
	private WebElement timezone;
	@FindBy (xpath="(//em [@unselectable='on'])[6]")
	private WebElement overtimeTracking; */
	@FindBy (xpath="(//input [@type='checkbox'])[2]")
	private WebElement corporateSettings;
	
	
	public UserList(WebDriver driver) 
	{
		super (driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddUsers ()
	{
		this.elementVisibility(this.addUsers);
		this.addUsers.click();
	}
	
	/*enter details to add users*/
	public void setfirstName (String firstname)
	{
		this.firstName.sendKeys(firstname);
	}
	public void setlastName (String lastname)
	{
		this.lastName.sendKeys(lastname);
	}
	public void setemail (String email)
	{
		this.email.sendKeys(email);
	}
	public void setuserName (String username)
	{
		this.userName.sendKeys(username);
	}
	public void setPassword (String pwd)
	{
		this.password.sendKeys(pwd);
	}
	public void setretypepassword (String pwd)
	{
		this.retypePassword.sendKeys(pwd);
	}
	public void createUserButton ()
	{
		this.createUserButton.click();
	}
	public void searchUsers (String name)
	{
		this.search.sendKeys(name);
	}
	public void clickSeletedUsers()
	{
		this.elementVisibility(this.searchElement);
		this.searchElement.click();
	}
/*	public void selectTimeZone()
	{
		Selec.selectByIndex(this.timezone, 0);
	}
	public void selectOverTimeTracking ()
	{
		Selec.selectByIndex(this.overtimeTracking, 2);
	}*/
	public void clickCorporateSetting()
	{
		this.corporateSettings.click();
	}
}
