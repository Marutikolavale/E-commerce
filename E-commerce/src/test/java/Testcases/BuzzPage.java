package Testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.google.common.base.CaseFormat;

import PageObject.BuzzPOM;
import PageObject.DashBordPOM;
import PageObject.LoginPagePOM;

public class BuzzPage extends Baseclass {

	//@Test
	public void Shearpost() throws EncryptedDocumentException, InterruptedException, IOException {

		LoginPagePOM lp = new LoginPagePOM(driver);
		lp.LoginOperation();
		
		DashBordPOM db = new DashBordPOM(driver);
		db.Buzzclick();

		BuzzPOM b = new BuzzPOM(driver);
		b.textbox.click();
		b.textbox.sendKeys("Hello World");
		
		b.postButton.click();
		
	}

	@Test
	public void View_Most_Liked_Post() throws EncryptedDocumentException, InterruptedException, IOException {
		LoginPagePOM lP = new LoginPagePOM(driver);
		lP.LoginOperation();
		log.info("login operation done");
		DashBordPOM db = new DashBordPOM(driver);
		db.Buzzclick();
		log.info("Buzz page is open");
		BuzzPOM b = new BuzzPOM(driver);
		b.mostLikedPostBtn.click();
		log.info(" test  case pass");
	}

}
