package Testcases;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObject.LoginPagePOM;
import Utilities.ReadConfig;
import groovyjarjarantlr4.v4.codegen.model.LL1AltBlock;

public class Loginpage extends Baseclass {
	ReadConfig Rc= new ReadConfig();

	@Test(enabled =true)
	public void LoginOperation() throws IOException, InterruptedException
	{	
		log.info("loginoperation test start");
		LoginPagePOM  lp= new LoginPagePOM(driver);
		Loginpage l= new Loginpage();
		String user = Rc.ReadExcelData(EXCEL_PATH,"Validcreads",1,0);
		String pass = Rc.ReadExcelData(EXCEL_PATH,"Validcreads",1,1);
		lp.Loginoperation(user,pass);
		if(lp.logo.isDisplayed())
		{
			log.info("LoginOperation test case is pass");
		}
		else
		{
			l.captureScreenShot(driver,"LoginOperation");
			log.info("LoginOperation test case is Fail");
		}
	}
	@Test(enabled =true)
	public void FailLogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		log.info("FailLogin test case");
		LoginPagePOM  lp= new LoginPagePOM(driver);
		Loginpage l= new Loginpage();
		String failUsername = Rc.ReadExcelData(EXCEL_PATH,"Invalidcreads",1,0);
		String failPassword = Rc.ReadExcelData(EXCEL_PATH,"Invalidcreads",1,1);
		Thread.sleep(2000);
		lp.Loginoperation(failUsername,failPassword);

		if(lp.logo.isDisplayed())
		{
			l.captureScreenShot(driver,"FailLogin");
			log.info("FailLogin test case is Fail");
		}
		else
		{
			log.info("FailLogin test case is pass");
		}
	}
	@Test(enabled =true)
	public void Invaild_Login() throws EncryptedDocumentException, IOException, InterruptedException
	{
		log.info("check Diff way Enter Password login  Operantion");
		LoginPagePOM  lp= new LoginPagePOM(driver);
		Loginpage l= new Loginpage();
		Thread.sleep(2000);
		int rc = Rc.GetRowCount(EXCEL_PATH,"Invalidcreads");
		for(int i=1;i<=rc;i++)
		{
			String invalidUser= Rc.ReadExcelData(EXCEL_PATH,"Invalidcreads",i,0);
			String invalidPass = Rc.ReadExcelData(EXCEL_PATH,"Invalidcreads",i,1);
			//Perform invalid login
			Thread.sleep(2000);
			lp.actiTimeInvalidLogin(invalidUser, invalidPass);
			lp.username.clear();
			lp.passwored.clear();
			if(lp.logo.isDisplayed())
			{
				l.captureScreenShot(driver,"invaild_login");
				log.info("Invaild_Login test case is Fail");
			}
			else
			{
				log.info("Invaild_Login test case is pass");
			}
		}

	}
}