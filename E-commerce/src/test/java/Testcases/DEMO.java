package Testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import PageObject.AdminPOM;
import PageObject.DashBordPOM;
import PageObject.DirectoryPOM;
import PageObject.LoginPagePOM;
import Utilities.ReadConfig;

public class DEMO  extends Baseclass{
	ReadConfig Rc= new ReadConfig();
	@Test
	public void testa() throws EncryptedDocumentException, IOException, InterruptedException
	{
		DashBordPOM db= new DashBordPOM(driver);
		LoginPagePOM lp= new LoginPagePOM(driver);
		String user = Rc.ReadExcelData(EXCEL_PATH,"Validcreads",1,0);
		String pass = Rc.ReadExcelData(EXCEL_PATH,"Validcreads",1,1);
		lp.Loginoperation(user,pass);
		db.adminclick();
		AdminPOM ad= new AdminPOM(driver);
		Thread.sleep(2000);
		System.out.println("llllll");
		ad.User_ManagementUsername.sendKeys("Maruti");
		//ad.SSS.click();
		//ad.aaa.click();
		
		Thread.sleep(2000);
	}


}
