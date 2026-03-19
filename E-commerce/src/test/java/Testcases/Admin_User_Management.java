package Testcases;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import PageObject.AdminPOM;


import PageObject.DashBordPOM;
import PageObject.LoginPagePOM;

public class Admin_User_Management  extends Baseclass{

	@Test
	public void System_Users() throws EncryptedDocumentException, InterruptedException, IOException	{
		LoginPagePOM lp= new LoginPagePOM(driver); 
		lp.LoginOperation();
		DashBordPOM dp= new DashBordPOM(driver);
		dp.adminclick();
		AdminPOM ap= new AdminPOM(driver);
		//ap.clickusers();
		
		
	}

}
