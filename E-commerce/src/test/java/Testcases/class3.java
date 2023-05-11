package Testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import PageObject.DashBordPOM;
import PageObject.LoginPagePOM;
import PageObject.MyinfoPOM;
import Utilities.ReadConfig;

public class class3  extends Baseclass{

	ReadConfig Rc= new ReadConfig();
	// add photo for jpg format
	@Test(enabled = true)
	public void add_photo() throws EncryptedDocumentException, IOException, AWTException, InterruptedException
	{
		DashBordPOM dh= new DashBordPOM(driver);
		LoginPagePOM  lp= new LoginPagePOM(driver);
		Loginpage l= new Loginpage();
		String Username1 = Rc.ReadExcelData(EXCEL_PATH,"Validcreads",1,0);
		String Password1 = Rc.ReadExcelData(EXCEL_PATH,"Validcreads",1,1);
		lp.Loginoperation(Username1,Password1);
		log.info("user login sucessfull");
		dh.MyInfoclick();
		MyinfoPOM mi= new MyinfoPOM(driver);
		mi.add_photoclick();
		Robot r= new Robot();
		r.delay(2000);
		// copy file to clipbord
		StringSelection ss= new StringSelection("\\Users\\mbkol\\OneDrive\\Desktop\\Testing\\Maruti\\Photo -11.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		// control + v action perform 

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);

		log.info("add photo sucess full");
		Thread.sleep(2000);
		mi.savebtn.click();

	}
	// add Pic in PNG  format
	@Test(enabled = true)
	public void add_photo1() throws EncryptedDocumentException, IOException, AWTException, InterruptedException
	{
		DashBordPOM dh= new DashBordPOM(driver);
		LoginPagePOM  lp= new LoginPagePOM(driver);
		Loginpage l= new Loginpage();
		String Username1 = Rc.ReadExcelData(EXCEL_PATH,"Validcreads",1,0);
		String Password1 = Rc.ReadExcelData(EXCEL_PATH,"Validcreads",1,1);
		lp.Loginoperation(Username1,Password1);
		log.info("user login sucessfull");
		dh.MyInfoclick();
		MyinfoPOM mi= new MyinfoPOM(driver);
		mi.add_photoclick();

		Robot r= new Robot();
		r.delay(2000);
		// copy file to clipbord
		StringSelection ss= new StringSelection("\\Users\\mbkol\\OneDrive\\Desktop\\upload data\\Screenshot_20221222_111736.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		// control + v action perform 

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);

		log.info("add photo sucess full");
		Thread.sleep(2000);
		mi.savebtn.click();
	}
	@Test(enabled = true)
	public void add_photo2() throws EncryptedDocumentException, IOException, AWTException, InterruptedException
	{
		DashBordPOM dh= new DashBordPOM(driver);
		LoginPagePOM  lp= new LoginPagePOM(driver);
		Loginpage l= new Loginpage();
		String Username1 = Rc.ReadExcelData(EXCEL_PATH,"Validcreads",1,0);
		String Password1 = Rc.ReadExcelData(EXCEL_PATH,"Validcreads",1,1);
		lp.Loginoperation(Username1,Password1);
		log.info("user login sucessfull");
		dh.MyInfoclick();
		MyinfoPOM mi= new MyinfoPOM(driver);
		mi.add_photoclick();
		Robot r= new Robot();
		r.delay(2000);
		// copy file to clipbord
		StringSelection ss= new StringSelection("\\Users\\mbkol\\OneDrive\\Desktop\\upload data\\2.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		// control + v action perform 

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);

		log.info("add photo sucess full");
		Thread.sleep(2000);
		mi.savebtn.click();

	}
	// puload Doc error massage  is display
	@Test(enabled = true)
	public void add_photo4() throws EncryptedDocumentException, IOException, AWTException, InterruptedException
	{
		DashBordPOM dh= new DashBordPOM(driver);
		LoginPagePOM  lp= new LoginPagePOM(driver);
		Loginpage l= new Loginpage();
		String Username1 = Rc.ReadExcelData(EXCEL_PATH,"Validcreads",1,0);
		String Password1 = Rc.ReadExcelData(EXCEL_PATH,"Validcreads",1,1);
		lp.Loginoperation(Username1,Password1);
		log.info("user login sucessfull");
		dh.MyInfoclick();
		MyinfoPOM mi= new MyinfoPOM(driver);
		mi.add_photoclick();
		Robot r= new Robot();
		r.delay(2000);
		// copy file to clipbord
		StringSelection ss= new StringSelection("\\Users\\mbkol\\OneDrive\\Desktop\\upload data\\a.doc");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		// control + v action perform 

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);

		log.info("add photo sucess full");
		Thread.sleep(2000);
		mi.savebtn.click();
	}
	@Test(enabled = true)
	public void add_photo5() throws EncryptedDocumentException, IOException, AWTException, InterruptedException
	{
		DashBordPOM dh= new DashBordPOM(driver);
		LoginPagePOM  lp= new LoginPagePOM(driver);
		Loginpage l= new Loginpage();
		String Username1 = Rc.ReadExcelData(EXCEL_PATH,"Validcreads",1,0);
		String Password1 = Rc.ReadExcelData(EXCEL_PATH,"Validcreads",1,1);
		lp.Loginoperation(Username1,Password1);
		log.info("user login sucessfull");
		dh.MyInfoclick();
		MyinfoPOM mi= new MyinfoPOM(driver);
		mi.add_photoclick();
		Robot r= new Robot();
		r.delay(2000);
		// copy file to Clipborad
		StringSelection ss= new StringSelection("\\Users\\mbkol\\OneDrive\\Desktop\\upload data\\pan.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		// control + v action Perform 

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
