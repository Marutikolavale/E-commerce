package Testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import PageObject.DashBordPOM;
import PageObject.LoginPagePOM;

public class TimePage extends Baseclass{

	@Test
	public void e() throws EncryptedDocumentException, InterruptedException, IOException
	{
		DashBordPOM db = new DashBordPOM(driver);
		LoginPagePOM lP = new LoginPagePOM(driver);
		TimePage tp= new TimePage();
		lP.LoginOperation();
		log.info("login Sucessfull");
		db.Time.click();
	String path=	TimePage.getReportFileName();
	System.out.println(path);
		

	}
}
