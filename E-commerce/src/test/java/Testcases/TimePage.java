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
	LoginPagePOM lP= new LoginPagePOM(driver);
	DashBordPOM db = new DashBordPOM(driver);
	db.Time.click();
	
	lP.LoginOperation();
	}
}
