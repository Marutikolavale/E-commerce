package Testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import PageObject.DashBord;
import PageObject.LoginPagePOM;
import PageObject.Myinfo;
import Utilities.ReadConfig;

public class class3  extends Baseclass{

	ReadConfig Rc= new ReadConfig();
	// add photo for jpg format
	@Test(priority = 1,enabled =  false)
	public void add_photo() throws EncryptedDocumentException, IOException, AWTException, InterruptedException
	{
		DashBord dh= new DashBord(driver);
		LoginPagePOM  lp= new LoginPagePOM(driver);
		Loginpage l= new Loginpage();
		String Username1 = Rc.readExcelData(EXCEL_PATH,"Validcreads",1,0);
		String Password1 = Rc.readExcelData(EXCEL_PATH,"Validcreads",1,1);
		lp.Loginoperation(Username1,Password1);
		log.info("user login sucessfull");
		dh.MyInfoclick();
		Myinfo mi= new Myinfo(driver);
		mi.add_photoclick();
		Robot r= new Robot();
		r.delay(2000);
		// copy file to clipbord
		StringSelection ss= new StringSelection("\\Users\\mbkol\\OneDrive\\Desktop\\Testing\\Maruti\\Photo -11.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		// cont + v action perfrom 

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);

		log.info("add photo sucess full");
		Thread.sleep(2000);
		mi.savebtn.click();

	}
	// add pic in PNG  format
	@Test(priority = 2,enabled =  false)
	public void add_photo1() throws EncryptedDocumentException, IOException, AWTException, InterruptedException
	{
		DashBord dh= new DashBord(driver);
		LoginPagePOM  lp= new LoginPagePOM(driver);
		Loginpage l= new Loginpage();
		String Username1 = Rc.readExcelData(EXCEL_PATH,"Validcreads",1,0);
		String Password1 = Rc.readExcelData(EXCEL_PATH,"Validcreads",1,1);
		lp.Loginoperation(Username1,Password1);
		log.info("user login sucessfull");
		dh.MyInfoclick();
		Myinfo mi= new Myinfo(driver);
		mi.add_photoclick();

		Robot r= new Robot();
		r.delay(2000);
		// copy file to clipbord
		StringSelection ss= new StringSelection("\\Users\\mbkol\\OneDrive\\Desktop\\upload data\\Screenshot_20221222_111736.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		// cont + v action perfrom 

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);

		log.info("add photo sucess full");
		Thread.sleep(2000);
		mi.savebtn.click();
	}
	@Test(priority = 3,enabled = false)
	public void add_photo2() throws EncryptedDocumentException, IOException, AWTException, InterruptedException
	{
		DashBord dh= new DashBord(driver);
		LoginPagePOM  lp= new LoginPagePOM(driver);
		Loginpage l= new Loginpage();
		String Username1 = Rc.readExcelData(EXCEL_PATH,"Validcreads",1,0);
		String Password1 = Rc.readExcelData(EXCEL_PATH,"Validcreads",1,1);
		lp.Loginoperation(Username1,Password1);
		log.info("user login sucessfull");
		dh.MyInfoclick();
		Myinfo mi= new Myinfo(driver);
		mi.add_photoclick();
		Robot r= new Robot();
		r.delay(2000);
		// copy file to clipbord
		StringSelection ss= new StringSelection("\\Users\\mbkol\\OneDrive\\Desktop\\upload data\\2.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		// cont + v action perfrom 

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);

		log.info("add photo sucess full");
		Thread.sleep(2000);
		mi.savebtn.click();

	}
	// puload Doc error massge  is display
	@Test(priority = 4,enabled = false)
	public void add_photo4() throws EncryptedDocumentException, IOException, AWTException, InterruptedException
	{
		DashBord dh= new DashBord(driver);
		LoginPagePOM  lp= new LoginPagePOM(driver);
		Loginpage l= new Loginpage();
		String Username1 = Rc.readExcelData(EXCEL_PATH,"Validcreads",1,0);
		String Password1 = Rc.readExcelData(EXCEL_PATH,"Validcreads",1,1);
		lp.Loginoperation(Username1,Password1);
		log.info("user login sucessfull");
		dh.MyInfoclick();
		Myinfo mi= new Myinfo(driver);
		mi.add_photoclick();
		Robot r= new Robot();
		r.delay(2000);
		// copy file to clipbord
		StringSelection ss= new StringSelection("\\Users\\mbkol\\OneDrive\\Desktop\\upload data\\a.doc");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		// cont + v action perfrom 

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);

		log.info("add photo sucess full");
		Thread.sleep(2000);
		mi.savebtn.click();
	}
	@Test(priority = 5,enabled = true)
	public void add_photo5() throws EncryptedDocumentException, IOException, AWTException, InterruptedException
	{
		DashBord dh= new DashBord(driver);
		LoginPagePOM  lp= new LoginPagePOM(driver);
		Loginpage l= new Loginpage();
		String Username1 = Rc.readExcelData(EXCEL_PATH,"Validcreads",1,0);
		String Password1 = Rc.readExcelData(EXCEL_PATH,"Validcreads",1,1);
		lp.Loginoperation(Username1,Password1);
		log.info("user login sucessfull");
		dh.MyInfoclick();
		Myinfo mi= new Myinfo(driver);
		mi.add_photoclick();
		Robot r= new Robot();
		r.delay(2000);
		// copy file to clipbord
		StringSelection ss= new StringSelection("\\Users\\mbkol\\OneDrive\\Desktop\\upload data\\pan.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		// cont + v action perfrom 

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);

		log.info("add photo sucess full");
		Thread.sleep(2000);
		mi.savebtn.click();

	}

}
