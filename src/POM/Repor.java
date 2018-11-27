package POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Generic.BasePage;
import Generic.Selec;

public class Repor extends BasePage
{
	@FindBy(xpath="(//td[@class='content-cell'])[1]")
	private WebElement teamPerformance;
	@FindBy(id="ext-gen20")
	private WebElement newReport;
	
	public Repor(WebDriver driver) 
	{
		super (driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickTeamPerformance ()
	{
		this.teamPerformance.click();
	}
	
	public void clickNewReport()
	{
		this.newReport.click();
	}
	public void closeNewReport (WebDriver driver)
	{
		Actions a= new Actions(driver);
		Robot r= null;
		try {
			r = new Robot();
		} 
		catch (AWTException e) {
			e.printStackTrace();
		}
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
	}
	
}

