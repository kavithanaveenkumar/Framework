package Generic;

import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage 
{
	WebDriver driver;
	
	public BasePage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void elementVisibility (WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log(element.getText()+" element is visible");
		}
		catch (Exception e)
		{
			Reporter.log(element.getText()+" element is not visible");
			Assert.fail();
		}
	}
}
