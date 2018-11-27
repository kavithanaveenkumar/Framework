package Scripts;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.ReadExcel;
import POM.Login_ActiTime;

public class LoginScript extends BaseTest
{
	@Test(groups= {"login"})
	public void Login ()
	{
		Login_ActiTime ob1 = new Login_ActiTime(driver);
		ob1.setUsername(ReadExcel.getdata(excelPath, "Sheet1", 0, 1));
		ob1.setPassword(ReadExcel.getdata(excelPath, "Sheet1", 1, 1));
		ob1.clickLogin();
	}
	
}
