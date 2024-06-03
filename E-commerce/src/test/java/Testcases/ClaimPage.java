package Testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import PageObject.ClaimPOM;
import PageObject.DashBordPOM;
import PageObject.LoginPagePOM;

public class ClaimPage extends Baseclass{
	//	ClaimPOM c= new ClaimPOM(driver);
	@Test
	public void  AddClaim() throws EncryptedDocumentException, InterruptedException, IOException
	{
		ClaimPOM c= new ClaimPOM(driver);
		LoginPagePOM lp = new LoginPagePOM(driver);
		DashBordPOM db = new DashBordPOM(driver);
		lp.LoginOperation();
		db.Claim.click();
		ClaimPage p = new ClaimPage();
		c.Submit_Claim.click();
		Thread.sleep(3000);
		c.Event.click();
		c.Select_EventList("Accommodation");
		/*Thread.sleep(3000);
		c.Currency.click();
		Thread.sleep(3000);
		c.select_Currency("Malawi Kwacha");
		c.SaveBTN.click();*/


	}



}
