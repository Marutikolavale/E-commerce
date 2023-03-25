package Testcases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import PageObject.DashBord;
import PageObject.LoginPagePOM;
import PageObject.adminPMO;

public class Loginpage extends Baseclass{

	@Test(priority =1)
	public void loginoperation() throws IOException
	{
		Loginpage l= new Loginpage();
		LoginPagePOM  lp= new LoginPagePOM(driver);
		lp.Loginoperation();
		log.info("user login sucessfull");
	}
	@Test(priority =2)
	public void clickDashBord()
	{
		DashBord db= new DashBord(driver);
		db.adminclick();
		log.info(" click on Admin");
		adminPMO ad=new adminPMO(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ad.clickCorporateBranding();
		log.info("click job button");

	}
}
