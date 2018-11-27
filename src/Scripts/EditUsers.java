package Scripts;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.ReadExcel;
import POM.Enter_Time_Track;
import POM.Login_ActiTime;
import POM.UserList;
/*program to modify existing users details*/
public class EditUsers extends BaseTest
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
		/*search existing users*/
		UserList ob3 = new UserList(driver);
		ob3.searchUsers("Maurice");
		ob3.clickSeletedUsers();
		//ob3.selectTimeZone();
		//ob3.selectOverTimeTracking();
		ob3.clickCorporateSetting();
	}
}
