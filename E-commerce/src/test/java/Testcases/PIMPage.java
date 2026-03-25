package Testcases;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.python.modules.thread.thread;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.DashBordPOM;
import PageObject.LoginPagePOM;
import PageObject.PIMPOM;
import Utilities.ReadConfig;
import javassist.bytecode.stackmap.BasicBlock.Catch;

public class PIMPage extends Baseclass{
	ReadConfig Rc= new ReadConfig();

	@Test(enabled =true,priority=1,description = "Add_Employee1")
	public void  Add_Employee1() throws EncryptedDocumentException, IOException, InterruptedException
	{
		LoginPagePOM lp=new LoginPagePOM(driver);
		lp.LoginOperation();
		log.info("login Sucessfull");
		DashBordPOM db= new  DashBordPOM(driver);

		db.PIMclick();
		log.info("clickedPIM");
		PIMPOM pp= new PIMPOM(driver);
		
		int rc = Rc.GetRowCount(EXCEL_PATH,"UserInfromation");
		for(int i=1;i<=rc;i++)
		{	
			Thread.sleep(5000);
			pp.clickAddEmployee();
			log.info("clickAddEmployee");
			Thread.sleep(5000);
			//pp.Employee_Id1_clear();
			String Firstname = Rc.ReadExcelData(EXCEL_PATH,"UserInfromation",i,0);

			String Middlename = Rc.ReadExcelData(EXCEL_PATH,"UserInfromation",i,1);

			String lastname = Rc.ReadExcelData(EXCEL_PATH,"UserInfromation",i,2);

			pp.firstName(Firstname);
			pp.middleName(Middlename);
			pp.lastName(lastname);
			pp.SaveBtnclick();
			String actaul	=pp.veirfypopupmassges();						
			String expcted="Successfully";			
			Assert.assertTrue(actaul.contains("Successfully"),
					"Popup verification failed: " + actaul);
			Thread.sleep(2000);


		}

	}
	@Test(enabled =true,priority=1,description ="Search_Employee1")
	public void Search_Employee1() throws EncryptedDocumentException, InterruptedException, IOException
	{
		try {
		LoginPagePOM lp=new LoginPagePOM(driver);
		lp.LoginOperation();
		log.info("login Sucessfull");
		DashBordPOM db= new  DashBordPOM(driver);
		db.PIMclick();
		log.info("clickedPIM");
		PIMPOM pm = new PIMPOM(driver);
		int rc = Rc.GetRowCount(EXCEL_PATH,"UserInfromation");
		for(int i=1;i<=rc;i++)
		{
			PIMPOM pp= new PIMPOM(driver);
			pp.clickEmployeeList();
			String lastname = Rc.ReadExcelData(EXCEL_PATH,"UserInfromation",i,2);
			pp.employee_Name(lastname);
			pp.SearchBtnclick();
		//	pp.scrollToElement();
			String actual = pp.recordFound();		
		   String expected="Records Found";
		Assert.assertTrue(actual.contains(expected) );
		//https://youtu.be/Fmm2vOEj5wA?si=U6g3DSyL8h4460FF
		}
		}
		catch (Exception e) {
			  e.printStackTrace(); // console वर दिसेल
			  log.error("Login failed", e); // log4j2 file & console वर दिसेल
			    throw e; // TestNG ला failure म्हणून throw करा
		}
	}
}

