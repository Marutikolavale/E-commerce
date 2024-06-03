package Testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObject.DashBordPOM;
import PageObject.LoginPagePOM;
import PageObject.MyinfoPOM;

public class MyinfoPage extends Baseclass {
	@Test
	public void addMyinfoPage() throws EncryptedDocumentException, InterruptedException, IOException {
		Actions a = new Actions(driver);
		LoginPagePOM lp = new LoginPagePOM(driver);
		DashBordPOM db = new DashBordPOM(driver);
		MyinfoPOM mi = new MyinfoPOM(driver);
		lp.LoginOperation();
		db.MyInfo.click();
		int rc = Rc.GetRowCount(EXCEL_PATH, "My_info");
		for (int i = 1; i <= rc; i++) {
			Thread.sleep(5000);
			String Firstname = String.valueOf(Rc.ReadExcelData(EXCEL_PATH, "My_info", i, 0));
			String Middlename = String.valueOf(Rc.ReadExcelData(EXCEL_PATH, "My_info", i, 1));
			String lastname = String.valueOf(Rc.ReadExcelData(EXCEL_PATH, "My_info", i, 2));
			String Nickname = String.valueOf(Rc.ReadExcelData(EXCEL_PATH, "My_info", i, 3));
			Thread.sleep(2000);
			String Employee_id = String.valueOf(Rc.ReadExcelData(EXCEL_PATH, "My_info", i, 4));
			String Other_id=String.valueOf(Rc.ReadExcelData(EXCEL_PATH,"My_info",i,5));
			String Drivers_license_number=String.valueOf(Rc.ReadExcelData(EXCEL_PATH,"My_info",i,6));
			String	SSN_number=String.valueOf(Rc.ReadExcelData(EXCEL_PATH,"My_info",i,7));
			String SIN_number =String.valueOf(Rc.ReadExcelData(EXCEL_PATH,"My_info",i,8));
			//String data=mi.PrintNationality();
			//Rc.writeExcelData(EXCEL_PATH,"My_info",i,10, data);
			String Nationality=Rc.ReadExcelData(EXCEL_PATH,"My_info",i,10);
			String Gander =Rc.ReadExcelData(EXCEL_PATH,"My_info",i,13);
			String Military_Service=Rc.ReadExcelData(EXCEL_PATH,"My_info",i,14);
			String BloodTypeList= Rc.ReadExcelData(EXCEL_PATH,"My_info",i,15);
			a.moveToElement(mi.FirstName).doubleClick().sendKeys(Keys.BACK_SPACE).sendKeys(Firstname).perform();
			a.moveToElement(mi.Middle_Name).doubleClick().sendKeys(Keys.BACK_SPACE).sendKeys(Middlename).perform();
			a.moveToElement(mi.Last_Name).doubleClick().sendKeys(Keys.BACK_SPACE).sendKeys(lastname).perform();
			a.moveToElement(mi.Nick_Name).doubleClick().sendKeys(Keys.BACK_SPACE).sendKeys(Nickname).perform();
			a.moveToElement(mi.Employee_Id).doubleClick().sendKeys(Keys.BACK_SPACE).sendKeys(Employee_id).perform();;
			a.moveToElement(mi.Other_Id).doubleClick().sendKeys(Keys.BACK_SPACE).sendKeys(Other_id).perform();;
			a.moveToElement(mi.Drivers_License_Number).doubleClick().sendKeys(Keys.BACK_SPACE).sendKeys(Drivers_license_number).perform();;
			a.moveToElement(mi.SSN_Number).doubleClick().sendKeys(Keys.BACK_SPACE).sendKeys(SSN_number).perform();		
			a.moveToElement(mi.SIN_Number).doubleClick().sendKeys(Keys.BACK_SPACE).sendKeys(SIN_number).perform();

			mi.Blood_Type.click();
			mi.select_Blood_Type(BloodTypeList);

			a.moveToElement(mi.Military_Service).doubleClick().sendKeys(Keys.BACK_SPACE).sendKeys(Military_Service).perform();
			//Thread.sleep(2000);
			mi.Select_Nationality(Nationality);
			Thread.sleep(2000);
			mi.SmokerChekBox.click();
			mi.savebtn.click();
		}

	}
}
