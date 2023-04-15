package Testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import PageObject.LoginPagePOM;
import Utilities.ReadConfig;

public class Loginpage extends Baseclass {

	ReadConfig Rc= new ReadConfig();
	@Test(priority =1)
	public void loginoperation() throws IOException
	{
		LoginPagePOM  lp= new LoginPagePOM(driver);
		Loginpage l= new Loginpage();
		String Username1 = Rc.readExcelData(EXCEL_PATH,"Validcreads",1,0);
		String Password1 = Rc.readExcelData(EXCEL_PATH,"Validcreads",1,1);
		lp.Loginoperation(Username1,Password1);
		log.info("user login sucessfull");
	}
	@Test(priority =2)
	public void faillogin() throws EncryptedDocumentException, IOException
	{
		
		LoginPagePOM  lp= new LoginPagePOM(driver);
		Loginpage l= new Loginpage();
		String failUsername = Rc.readExcelData(EXCEL_PATH,"Validcreads",2,0);
		String failPassword = Rc.readExcelData(EXCEL_PATH,"Validcreads",2,1);
		lp.Loginoperation(failUsername,failPassword);
		l.captureScreenShot(driver,"faillogin");
		log.info("Login is fail");
	}
	@Test(priority =3)
	public void invaild_login() throws EncryptedDocumentException, IOException, InterruptedException
	{
		LoginPagePOM  lp= new LoginPagePOM(driver);
		Loginpage l= new Loginpage();
		int rc = Rc.getRowCount(EXCEL_PATH,"Invalidcreads");
		for(int i=0;i<=rc;i++)
		{
			String invalidUsername = Rc.readExcelData(EXCEL_PATH,"Invalidcreads",i,0);
			String invalidPasswrod = Rc.readExcelData(EXCEL_PATH,"Invalidcreads",i,1);
			//Perform invalid login
			lp.actiTimeInvalidLogin(invalidUsername, invalidPasswrod);
			Thread.sleep(2000);
			l.captureScreenShot(driver,"invaild_login");
			log.info("check differt way enget password login opertion");
		}
	}
}
