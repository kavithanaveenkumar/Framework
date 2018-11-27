package Scripts;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.GetScreenShot;
import Generic.ReadExcel;
import POM.Enter_Time_Track;
import POM.Login_ActiTime;
import POM.Profile;
/*program to view logged in user's profile*/
public class UserProfile extends BaseTest 
{
	@Test(groups= {"users"})
	public void userprofileScript ()
	{
		/*logging in */
		Login_ActiTime ob1 = new Login_ActiTime(driver);
		ob1.setUsername(ReadExcel.getdata(excelPath, "Sheet1", 0, 1));
		ob1.setPassword(ReadExcel.getdata(excelPath, "Sheet1", 1, 1));
		ob1.clickLogin();
		/*click loggedin user*/
		Enter_Time_Track ob2 = new Enter_Time_Track(driver);
		ob2.clickLoggedinUser();
		/*to update profile details*/
		Profile ob3 = new Profile(driver);
		ob3.selectRadioButton();
		ob3.closeButton(driver);
		/*logging out*/
		ob2.clickLogout();
	}
}
