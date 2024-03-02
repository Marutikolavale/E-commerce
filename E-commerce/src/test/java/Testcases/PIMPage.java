package Testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.formula.functions.PPMT;
import org.openqa.selenium.chrome.AddHasCasting;
import org.testng.annotations.*;

import PageObject.DashBordPOM;
import PageObject.LoginPagePOM;
import PageObject.PIMPOM;
import Utilities.ReadConfig;

public class PIMPage extends Baseclass{
	ReadConfig Rc= new ReadConfig();
	@Test
	public void  Add_Employee1() throws EncryptedDocumentException, IOException, InterruptedException
	{
		LoginPagePOM lp=new LoginPagePOM(driver);
		lp.LoginOperation();
		log.info("login Sucessfull");
		DashBordPOM db= new  DashBordPOM(driver);
		db.PIMclick();
		log.info("clickedPIM");
		int rc = Rc.GetRowCount(EXCEL_PATH,"UserImfromations");
		for(int i=1;i<=rc;i++)
		{
			PIMPOM pp= new PIMPOM(driver);
			pp.clickAddEmployee();

			Thread.sleep(2000);
			String Firstname = Rc.ReadExcelData(EXCEL_PATH,"UserImfromations",i,0);
			String Middlename = Rc.ReadExcelData(EXCEL_PATH,"UserImfromations",i,1);
			String lastname = Rc.ReadExcelData(EXCEL_PATH,"UserImfromations",i,2);
			String Employee_id = String.valueOf(Rc.ReadExcelData(EXCEL_PATH,"UserImfromations",i,3));
			pp.FirstName.clear();
			pp.FirstName.sendKeys(Firstname);
			pp.MiddleName.clear();
			pp.MiddleName.sendKeys(Middlename);
			pp.LastName.clear();
			pp.LastName.sendKeys(lastname);
			pp.Employee_Id.clear();
			Thread.sleep(2000);
			pp.Employee_Id.sendKeys(Employee_id);
			Thread.sleep(2000);
			pp.SaveBtn.click();
			Thread.sleep(2000);
		}
	}
}
