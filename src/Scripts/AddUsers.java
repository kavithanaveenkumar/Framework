package Scripts;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.ReadExcel;
import POM.Enter_Time_Track;
import POM.Login_ActiTime;
import POM.UserList;
/*program to add users*/
public class AddUsers extends BaseTest
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
		
		/*click 'add users' button*/
		UserList ob3 = new UserList(driver);
		ob3.clickAddUsers();
		ob3.setfirstName("kavitha");
		ob3.setlastName("naveen");
		ob3.setemail("kavithanaveen@gmail.com");
		ob3.setuserName("kavitha");
		ob3.setPassword("qspiders");
		ob3.setretypepassword("qspiders");
		ob3.createUserButton();
	}
}
