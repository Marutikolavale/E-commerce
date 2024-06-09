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

public class class3 extends Baseclass{

	ReadConfig Rc= new ReadConfig();
	// add photo for jpg format
	@Test(enabled = true)
	public void add_photo() throws EncryptedDocumentException, IOException, AWTException, InterruptedException
	{
		LoginPagePOM Pl= new LoginPagePOM(driver);
		Pl.LoginOperation();
		DashBordPOM dh= new DashBordPOM(driver);
		log.info("user login sucessfull");
		dh.MyInfoclick();
		MyinfoPOM mi= new MyinfoPOM(driver);
		mi.add_photoclick();
		Robot r= new Robot();
		r.delay(2000);
		// copy file to clipbord
		StringSelection ss= new StringSelection(System.getProperty("user.dir")+"//upload data//2.png");
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
		LoginPagePOM Pl= new LoginPagePOM(driver);

		DashBordPOM dh= new DashBordPOM(driver);
		Pl.LoginOperation();
		log.info("user login sucessfull");
		dh.MyInfoclick();
		MyinfoPOM mi= new MyinfoPOM(driver);
		mi.add_photoclick();

		Robot r= new Robot();
		r.delay(2000);
		// copy file to Clipbord
		StringSelection ss= new StringSelection(System.getProperty("user.dir")+"//upload data//a.doc");
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
		LoginPagePOM Pl= new LoginPagePOM(driver);

		DashBordPOM dh= new DashBordPOM(driver);
		Pl.LoginOperation();
		log.info("user login sucessfull");
		dh.MyInfoclick();
		MyinfoPOM mi= new MyinfoPOM(driver);
		mi.add_photoclick();
		Robot r= new Robot();
		r.delay(2000);
		// copy file to clipbord
		StringSelection ss= new StringSelection(System.getProperty("user.dir")+"//upload data//Pan.jpg");
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
		LoginPagePOM Pl= new LoginPagePOM(driver);

		DashBordPOM dh= new DashBordPOM(driver);
		Pl.LoginOperation();
		log.info("user login sucessfull");
		dh.MyInfoclick();
		MyinfoPOM mi= new MyinfoPOM(driver);
		mi.add_photoclick();
		Robot r= new Robot();
		r.delay(2000);
		// copy file to clipbord
		StringSelection ss= new StringSelection(System.getProperty("user.dir")+"//upload data//S.png");
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
	{	LoginPagePOM Pl= new LoginPagePOM(driver);

	DashBordPOM dh= new DashBordPOM(driver);
	Pl.LoginOperation();
	log.info("user login sucessfull");
	dh.MyInfoclick();
	MyinfoPOM mi= new MyinfoPOM(driver);
	mi.add_photoclick();
	Robot r= new Robot();
	r.delay(2000);
	// copy file to Clipborad
	StringSelection ss= new StringSelection(System.getProperty("user.dir")+"//upload data//Pan.jpg");
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
