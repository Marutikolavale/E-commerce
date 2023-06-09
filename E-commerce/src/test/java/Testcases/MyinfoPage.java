package Testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObject.DashBordPOM;
import PageObject.LoginPagePOM;
import PageObject.MyinfoPOM;
public class MyinfoPage extends Baseclass {
	@Test
	public void addMyinfoPage() throws EncryptedDocumentException, InterruptedException, IOException
	{
		Actions a= new Actions(driver);
		LoginPagePOM lp= new LoginPagePOM(driver);
		DashBordPOM db= new DashBordPOM(driver);
		MyinfoPOM mi= new MyinfoPOM(driver);
		lp.LoginOperation();
		db.MyInfo.click();
		int rc = Rc.GetRowCount(EXCEL_PATH,"UserImfromations");
		for(int i=1;i<=rc;i++)
		{
			Thread.sleep(10000);
			String Firstname = Rc.ReadExcelData(EXCEL_PATH,"My_info",i,0);
			String Middlename = Rc.ReadExcelData(EXCEL_PATH,"My_info",i,1);
			String lastname = Rc.ReadExcelData(EXCEL_PATH,"My_info",i,2);
			String	Nickname=Rc.ReadExcelData(EXCEL_PATH,"My_info",i,3);
			String	Employee_id=Rc.ReadExcelData(EXCEL_PATH,"My_info",i,4);
			String Other_id=Rc.ReadExcelData(EXCEL_PATH,"My_info",i,5);
			String Drivers_license_number=Rc.ReadExcelData(EXCEL_PATH,"My_info",i,6);
			String SSN_number=Rc.ReadExcelData(EXCEL_PATH,"My_info",i,7);
			String SIN_number	=Rc.ReadExcelData(EXCEL_PATH,"My_info",i,8);
			//String Employee_id = Rc.ReadExcelData(EXCEL_PATH,"UserImfromations",i,3);
			a.moveToElement(mi.FirstName).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();;
			mi.FirstName.sendKeys(Firstname);
			a.moveToElement(mi.Middle_Name).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();;
			mi.Middle_Name.sendKeys(Middlename);
			a.moveToElement(mi.Last_Name).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();;
			mi.Last_Name.sendKeys(lastname);
			mi.Nick_Name.sendKeys(Nickname);
			mi.Employee_Id.sendKeys(Employee_id);
			mi.Other_Id.sendKeys(Other_id);
			mi.Drivers_License_Number.sendKeys(Drivers_license_number);
			//mi.License_Expiry_Date.sendKeys(null);
			mi.SSN_Number.sendKeys(SSN_number);
			mi.SIN_Number.sendKeys(SIN_number);
			mi.Military_Service.sendKeys("");
		}

	}
}

