package Testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import PageObject.LoginPagePOM;

public class BuzzPage extends Baseclass {
	

	@Test
	public void Shearpost() throws EncryptedDocumentException, InterruptedException, IOException
	{
		
		LoginPagePOM lp = new LoginPagePOM(driver);
		lp.LoginOperation();
		
	}
}
