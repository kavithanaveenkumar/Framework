package Scripts;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.ReadExcel;
import POM.Enter_Time_Track;
import POM.Login_ActiTime;
/*program to click Users tab in 'Enter Time Track' page */
public class Click_Users extends BaseTest
{
	@Test(groups= {"users"})
	public void Login ()
	{
		/*logging in */
		Login_ActiTime ob1 = new Login_ActiTime(driver);
		ob1.setUsername(ReadExcel.getdata(excelPath, "Sheet1", 0, 1));
		ob1.setPassword(ReadExcel.getdata(excelPath, "Sheet1", 1, 1));
		ob1.clickLogin();
		
		/*click 'users' tab */
		Enter_Time_Track ob2 = new Enter_Time_Track(driver);
		ob2.clickUsers();
	}
}
