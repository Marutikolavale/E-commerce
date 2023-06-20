package Testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import PageObject.AdminPOM;
import PageObject.Admin_User_ManagementPOM;
import PageObject.DashBordPOM;
import PageObject.JobPagePOM;
import PageObject.LoginPagePOM;
import Utilities.ReadConfig;

public class DEMO extends Baseclass{
	ReadConfig Rc= new ReadConfig();

	@Test(enabled = true)
	public void testa() throws EncryptedDocumentException, IOException, InterruptedException
	{
		LoginPagePOM Pl= new LoginPagePOM(driver);

		Pl.LoginOperation();
		DashBordPOM db= new DashBordPOM(driver);
		db.adminclick();
		AdminPOM ad= new AdminPOM(driver);
		Thread.sleep(2000);
		Admin_User_ManagementPOM p= new Admin_User_ManagementPOM(driver);
		p.User_ManagementUsername.sendKeys("Maruti");
		p.UserRoleclick.click();
		Thread.sleep(2000);
		p.SetUserRoll("Admin");
		//p.User_Management_Employee_Name.sendKeys("kolavale");
		p.Status.click();
		Thread.sleep(5000);
		System.out.println("llllll");
		p.Statusclick("disabled");
		System.out.println("llllll");
		Thread.sleep(10000);
		p.User_Management_SearchBtn.click();
		Thread.sleep(2000);
	}
	@Test(enabled = true)
	public void test1() throws EncryptedDocumentException, IOException, InterruptedException
	{
		LoginPagePOM Pl= new LoginPagePOM(driver);
		DashBordPOM db= new DashBordPOM(driver);
		Pl.LoginOperation();
		db.adminclick();
		AdminPOM ad= new AdminPOM(driver);
		Thread.sleep(2000);
		ad.clickJob();
		JobPagePOM jP= new  JobPagePOM(driver);
		Thread.sleep(10000);
		System.out.println("maruti");
		jP.SelectJob("Job Categories");
		Thread.sleep(10000);
		System.out.println("maruti");
	}

}
