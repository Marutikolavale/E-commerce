package Testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import PageObject.DashBord;
import PageObject.LoginPagePOM;
import PageObject.Myinfo;
import Utilities.ReadConfig;

public class class2 extends Baseclass {
	ReadConfig Rc= new ReadConfig();
	@Test(enabled = true)
	public  void  login_imformation_disply() throws EncryptedDocumentException, IOException, InterruptedException
	{
		DashBord dh= new DashBord(driver);
		LoginPagePOM  lp= new LoginPagePOM(driver);
		Loginpage l= new Loginpage();
		String Username1 = Rc.ReadExcelData(EXCEL_PATH,"Validcreads",1,0);
		String Password1 = Rc.ReadExcelData(EXCEL_PATH,"Validcreads",1,1);
		lp.Loginoperation(Username1,Password1);
		log.info("user login sucessfull");
		dh.MyInfoclick();
	}
	@Test(enabled = true)
	public  void adimninfromation()
	{
		Myinfo mi= new Myinfo(driver);
		mi.add_infor();
	}
}
