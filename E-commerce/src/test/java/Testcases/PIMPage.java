package Testcases;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

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
			
			String Middlename = Rc.ReadExcelData(EXCEL_PATH,"UserInfromation",i,1);
			
			String lastname = Rc.ReadExcelData(EXCEL_PATH,"UserInfromation",i,2);
			
			pp.FirstName.clear();
			pp.FirstName.sendKeys(Firstname);
			pp.MiddleName.clear();
			pp.MiddleName.sendKeys(Middlename);
			pp.LastName.clear();
			pp.LastName.sendKeys(lastname);
			pp.SaveBtn.click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(
			        By.xpath("//div[@id='oxd-toaster_1']")));

			String actaul=msg.getText();
			String expcted="Success";
			Assert.assertTrue(actaul.contains("Successfully"), 
			        "Popup verification failed: " + actaul);
			
			
			
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
		int rc = Rc.GetRowCount(EXCEL_PATH,"UserInfromation");
		for(int i=1;i<=rc;i++)
		{
			PIMPOM pp= new PIMPOM(driver);
			pp.clickEmployeeList();
			String lastname = Rc.ReadExcelData(EXCEL_PATH,"UserInfromation",i,2);
		}
		
		pm.SearchBtn.click();
	 String actual=	pm.RecordFound.get(0).getText();
	   String expected="Records Found";
	
		Assert.assertTrue(actual.contains(expected) );
		Thread.sleep(10000);
		
		
		//https://youtu.be/Fmm2vOEj5wA?si=U6g3DSyL8h4460FF
		
	}
}

