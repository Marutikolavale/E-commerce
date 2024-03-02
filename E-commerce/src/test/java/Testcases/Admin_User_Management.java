package Testcases;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import PageObject.AdminPOM;
import PageObject.Admin_User_ManagementPOM;
import PageObject.DashBordPOM;
import PageObject.LoginPagePOM;

public class Admin_User_Management  extends Baseclass{

	@Test
	public void System_Users() throws EncryptedDocumentException, InterruptedException, IOException
	{
		LoginPagePOM lp= new LoginPagePOM(driver); 
		lp.LoginOperation();
		DashBordPOM dp= new DashBordPOM(driver);
		dp.adminclick();
		AdminPOM ap= new AdminPOM(driver);
		//ap.clickusers();
		Admin_User_ManagementPOM am = new Admin_User_ManagementPOM(driver);
		Thread.sleep(2000);
		am.User_ManagementUsername.sendKeys("Maruti");
		am.User_Management_UserRole.click();
		am.SetUserRoll("ESS");
		Thread.sleep(2000);
		am.User_Management_Employee_Name.sendKeys("kolavale");
		Thread.sleep(2000);
		am.Status.click();
		am.Statusclick("Disabled");
		//am.User_Management_SearchBtn.click();
		am.User_Management_ResetBtn.click();
	}

}
