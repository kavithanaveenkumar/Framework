package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract class BaseTest implements AutoConstant
{
	public WebDriver driver;
	
	static
	{
		System.setProperty(chomeKey, chromeValue);
		System.setProperty(geckoKey, geckoValue);
	}
	@Parameters({"browser"})
	@BeforeMethod(alwaysRun=true)
	public void beforeMethod(String browser)
	{
		if (browser.equals("chrome"))
			driver = new ChromeDriver();
		else
			driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
	}
	@AfterMethod(alwaysRun=true)
	public void afterMethod(ITestResult res)
	{
		int status = res.getStatus();
		String name = res.getMethod().getMethodName(); 
		if (status == 2)
			GetScreenShot.getPhoto(driver, name);
		driver.close();
	}
}
