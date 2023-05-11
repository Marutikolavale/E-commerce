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
		LoginPagePOM  lp= new LoginPagePOM(driver);
		Loginpage l= new Loginpage();
		String Username1 = Rc.ReadExcelData(EXCEL_PATH,"Validcreads",1,0);
		String Password1 = Rc.ReadExcelData(EXCEL_PATH,"Validcreads",1,1);
		lp.Loginoperation(Username1,Password1);
		log.info("user login sucessfull");
		dh.MyInfoclick();
	}
	@Test(enabled = true)
	public  void adimninfromation() throws InterruptedException
	{
		MyinfoPOM mi= new MyinfoPOM(driver);
		Thread.sleep(2000);
		mi.add_infor();
	}
}
