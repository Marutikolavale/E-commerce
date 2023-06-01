package Testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import PageObject.DashBordPOM;
import PageObject.LoginPagePOM;
import PageObject.MyinfoPOM;
import Utilities.ReadConfig;

public class class2 extends Baseclass {
	ReadConfig Rc= new ReadConfig();
	@Test(enabled = true)
	public  void  login_imformation_disply() throws EncryptedDocumentException, IOException, InterruptedException
	{
		DashBordPOM dh= new DashBordPOM(driver);
		LoginPagePOM lp= new LoginPagePOM(driver);
		lp.LoginOperation();
		log.info("user login sucessfull");
		dh.MyInfoclick();
	}
	/*@Test(enabled = true)
	public  void adimninfromation() throws InterruptedException
	{
		MyinfoPOM mi= new MyinfoPOM(driver);
		Thread.sleep(2000);
		mi.add_infor();
	}*/
}
