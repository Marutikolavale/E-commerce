package Testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import PageObject.DashBordPOM;
import PageObject.LoginPagePOM;
import PageObject.PIMPOM;
import PageObject.PIM_Employee_List_POM;
import Utilities.ReadConfig;

public class PIMPage_Employee_List extends Baseclass {
	ReadConfig Rc= new ReadConfig();
	@Test
	public void addq() throws EncryptedDocumentException, IOException, InterruptedException
	{
		PIM_Employee_List_POM pe= new PIM_Employee_List_POM(driver);
		PIMPage_Employee_List pl= new PIMPage_Employee_List();
		log.info("loginoperation test start");
		LoginPagePOM  lp= new LoginPagePOM(driver);
	
		lp.LoginOperation();		
		Thread.sleep(10000);
		if(lp.loginLogo.isDisplayed())
		{
			log.info("LoginOperation test case is pass");
		}
		else
		{
		pl.captureScreenShot(driver,"LoginOperation");
			log.info("LoginOperation test case is Fail");
		}

		DashBordPOM db= new  DashBordPOM(driver);
		db.PIM.click();
		PIMPOM pp= new PIMPOM(driver);
		Thread.sleep(5000);
		pp.EmployeeList.click();
		
		/*pe.Employee_Name.sendKeys("Maruti");
		Thread.sleep(2000);
		pe.Employee_Id.sendKeys("1235");
		Thread.sleep(2000);
		pe.Employment_Status.click();
		Thread.sleep(2000);
		pe.Select_Employment_Statusvalues("uenkxj");
		pe.Include.click();
		Thread.sleep(2000);
		pe.select_Includevalues("Current Employees Only");
		pe.Supervisor_Name.sendKeys("Vitthal");
		Thread.sleep(2000);*/
		pe.Job_Title.click();
		Thread.sleep(2000);
		pe.Select_Job_Titlevalues("VP - Sales & Marketing");
		System.out.println(";;ll;;;;lll");
		pe.sub_UnitElement.click();
		Thread.sleep(2000);
		pe.Select_SubUnit_values("Administration");

	}
}
