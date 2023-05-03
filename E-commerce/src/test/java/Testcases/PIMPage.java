package Testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.*;

import PageObject.DashBord;
import PageObject.LoginPagePOM;
import PageObject.PIMPOM;
import Utilities.ReadConfig;

public class PIMPage  extends Baseclass{
	ReadConfig Rc= new ReadConfig();
	@Test
	public void  Add_Employee1() throws EncryptedDocumentException, IOException, InterruptedException
	{
		LoginPagePOM  lp= new LoginPagePOM(driver);
		String Username1 = Rc.readExcelData(EXCEL_PATH,"Validcreads",1,0);
		String Password1 = Rc.readExcelData(EXCEL_PATH,"Validcreads",1,1);
		lp.Loginoperation(Username1,Password1);

		DashBord db= new  DashBord(driver);
		db.PIMclick();

		int rc = Rc.getRowCount(EXCEL_PATH,"UserImfromations");
		for(int i=1;i<=rc;i++)
		{
			PIMPOM pp= new PIMPOM(driver);
			pp.clickAddEmployee();

			Thread.sleep(2000);
			String Firstname = Rc.readExcelData(EXCEL_PATH,"UserImfromations",i,0);
			String Middlename = Rc.readExcelData(EXCEL_PATH,"UserImfromations",i,1);
			String lastname = Rc.readExcelData(EXCEL_PATH,"UserImfromations",i,2);
			// Employee_id = Rc.readExcelData(EXCEL_PATH,"UserImfromations",i,3);
			pp.FirstName.clear();
			pp.FirstName.sendKeys(Firstname);
			Thread.sleep(2000);
			pp.MiddleName.clear();
			pp.MiddleName.sendKeys(Middlename);
			Thread.sleep(2000);
			pp.LastName.clear();
			pp.LastName.sendKeys(lastname);
			Thread.sleep(2000);
			//pp.Employee_Id.clear();
			//pp.Employee_Id.sendKeys(Employee_id);
			Thread.sleep(2000);
			pp.SaveBtn.click();
			Thread.sleep(5000);

		}
	}
}
