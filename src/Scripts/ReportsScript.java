package Scripts;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.ReadExcel;
import POM.Enter_Time_Track;
import POM.Login_ActiTime;
import POM.Repor;

public class ReportsScript extends BaseTest 
{
	@Test(groups= {"reports"})
	public void script ()
	{
		/*logging in */
		Login_ActiTime ob1 = new Login_ActiTime(driver);
		ob1.setUsername(ReadExcel.getdata(excelPath, "Sheet1", 0, 1));
		ob1.setPassword(ReadExcel.getdata(excelPath, "Sheet1", 1, 1));
		ob1.clickLogin();
		/*clicking reports tab*/
		Enter_Time_Track ob2 = new Enter_Time_Track(driver);
		ob2.clickReports();
		/*team performance*/
		Repor ob3 = new Repor(driver);
		ob3.clickTeamPerformance();
		ob3.clickNewReport();
		ob3.closeNewReport(driver);
	}
}
