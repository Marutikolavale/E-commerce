package Testcases;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.DashBordPOM;
import PageObject.LoginPagePOM;
import Utilities.ReadConfig;

public class Loginpage extends Baseclass {
	ReadConfig Rc = new ReadConfig();

@Test(enabled =true,priority=1,description = "LoginOperation test is pass")
	public void LoginOperation() throws IOException, InterruptedException {
		log.info("login operation test start");
		LoginPagePOM lp = new LoginPagePOM(driver);
		Loginpage l = new Loginpage();
		lp.LoginOperation();	
		
	}

	@Test(enabled = true, priority = 2,description ="Invaild_Login")
	public void Invaild_Login() throws EncryptedDocumentException, IOException, InterruptedException {
		try {
			
		
		log.info("check Diff way Enter Password login  Operantion");
		LoginPagePOM lp = new LoginPagePOM(driver);
		DashBordPOM db=new DashBordPOM(driver);
		Loginpage l = new Loginpage();
		int rc = Rc.GetRowCount(EXCEL_PATH, "Invalidcreads");
		for (int i = 1; i <= rc; i++) {
			String invalidUser = Rc.ReadExcelData(EXCEL_PATH, "Invalidcreads", i, 0);
			String invalidPass = Rc.ReadExcelData(EXCEL_PATH, "Invalidcreads", i, 1);
			// Perform invalid login
			Thread.sleep(1000);
			lp.multipelLogin(invalidUser, invalidPass);
			lp.username.clear();
			lp.passwored.clear();
				
		}
		} catch (Exception e) {
			  e.printStackTrace(); // console वर दिसेल
			  log.error("Login failed", e); // log4j2 file & console वर दिसेल
			    throw e; // TestNG ला failure म्हणून throw करा
		}
		/*
		 * // Assertion – if dashboard logo is displayed, test should fail boolean
		 * isDashboardVisible = db.Dashboard_logo.isDisplayed();
		 * 
		 * // This assertion will trigger onTestFailure() if false
		 * Assert.assertFalse(isDashboardVisible,
		 * "Dashboard logo should NOT be visible for invalid login!");
		 */
	}
}