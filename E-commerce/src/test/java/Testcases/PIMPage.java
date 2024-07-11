package Testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.python.modules.thread.thread;
import org.testng.annotations.*;

import PageObject.DashBordPOM;
import PageObject.LoginPagePOM;
import PageObject.PIMPOM;
import Utilities.ReadConfig;

public class PIMPage extends Baseclass{
	ReadConfig Rc= new ReadConfig();
	@Test(enabled =true)
	public void  Add_Employee1() throws EncryptedDocumentException, IOException, InterruptedException
	{
		LoginPagePOM lp=new LoginPagePOM(driver);
		lp.LoginOperation();
		log.info("login Sucessfull");
		DashBordPOM db= new  DashBordPOM(driver);
		Thread.sleep(5000);
		db.PIMclick();
		log.info("clickedPIM");

		int rc = Rc.GetRowCount(EXCEL_PATH,"UserInfromation");
		for(int i=1;i<=rc;i++)
		{
			PIMPOM pp= new PIMPOM(driver);
			pp.clickAddEmployee();

			Thread.sleep(2000);
			String Firstname = Rc.ReadExcelData(EXCEL_PATH,"UserInfromation",i,0);
			System.out.println(Firstname);
			String Middlename = Rc.ReadExcelData(EXCEL_PATH,"UserInfromation",i,1);
			System.out.println(Middlename);
			String lastname = Rc.ReadExcelData(EXCEL_PATH,"UserInfromation",i,2);
			System.out.println(lastname);
			String Employee_id = String.valueOf(Rc.ReadExcelData(EXCEL_PATH,"UserInfromation",i,3));
			System.out.println(Employee_id);
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
	@Test(enabled=true)
	public void Search_Employee1() throws EncryptedDocumentException, InterruptedException, IOException
	{
		LoginPagePOM lp=new LoginPagePOM(driver);
		lp.LoginOperation();
		log.info("login Sucessfull");
		DashBordPOM db= new  DashBordPOM(driver);
		Thread.sleep(5000);
		db.PIMclick();
		log.info("clickedPIM");
		PIMPOM pm = new PIMPOM(driver);
		pm.EmployeeList.click();
		pm.Employee_Name.sendKeys("Sandeep");
		pm.SearchBtn.click();
		Thread.sleep(10000);
		
	}
}

