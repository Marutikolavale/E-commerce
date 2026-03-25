package Testcases;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import PageObject.AdminPOM;


import PageObject.DashBordPOM;
import PageObject.LoginPagePOM;

public class AdminPage extends Baseclass{

	@Test
	public void System_Users() throws EncryptedDocumentException, InterruptedException, IOException	{
		LoginPagePOM lp= new LoginPagePOM(driver); 
		lp.LoginOperation();
		log.info("login Sucessfull");
		DashBordPOM dp= new DashBordPOM(driver);
		dp.adminclick();
		log.info("admain page");
		AdminPOM ap= new AdminPOM(driver);
		//ap.clickusers();
		
		
	}

}
