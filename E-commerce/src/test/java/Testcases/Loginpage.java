package Testcases;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import PageObject.LoginPagePOM;
import Utilities.ReadConfig;

public class Loginpage extends Baseclass {
	ReadConfig Rc= new ReadConfig();

	@Test(enabled =true,priority=1)
	public void LoginOperation() throws IOException, InterruptedException
	{	
		log.info("loginoperation test start");
		LoginPagePOM  lp= new LoginPagePOM(driver);
		Loginpage l= new Loginpage();
		lp.LoginOperation();
		System.out.println("Login page");
	
		if(lp.loginLogo.isDisplayed())
		{
			log.info("LoginOperation test case is pass");
		}
		else
		{
			//l.captureScreenShot(driver,"LoginOperation");
			log.info("LoginOperation test case is Fail");
		}
	}
	@Test(enabled =true,priority=2)
	public void Invaild_Login() throws EncryptedDocumentException, IOException, InterruptedException
	{
		log.info("check Diff way Enter Password login  Operantion");
		LoginPagePOM  lp= new LoginPagePOM(driver);
		Loginpage l= new Loginpage();
		int rc = Rc.GetRowCount(EXCEL_PATH,"Invalidcreads");
		for(int i=1;i<=rc;i++)
		{
			String invalidUser= Rc.ReadExcelData(EXCEL_PATH,"Invalidcreads",i,0);
			String invalidPass = Rc.ReadExcelData(EXCEL_PATH,"Invalidcreads",i,1);
			//Perform invalid login
			Thread.sleep(1000);
			lp.multipelLogin(invalidUser,invalidPass);
			lp.username.clear();
			lp.passwored.clear();
			Thread.sleep(1000);
			/*sa.assertFalse(lp.Error_message.isDisplayed()," test cae are Fail");
			l.captureScreenShot(driver,"FailLogin");*/
			if(lp.Error_message.isDisplayed())
			{
				log.info("Invaild_Login test case is pass");
			}
			else
			{
				//l.captureScreenShot(driver,"FailLogin");
				log.info("FailLogin test case is Fail");
				
			}
		}
	}
}