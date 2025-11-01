 package Testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import javax.imageio.ImageIO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;

import PageObject.LoginPagePOM;
import Utilities.IAutoConstant;
import Utilities.ReadConfig;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Baseclass implements IAutoConstant {

	public WebDriver driver;
	public Logger log = LogManager.getLogger("E-commerce");
	ReadConfig Rc = new ReadConfig();
	SoftAssert sa = new SoftAssert();
  // @Parameters("Browser")
	@BeforeMethod
	public void SetUp() throws IOException {
	   
		ReadConfig R = new ReadConfig();
		String BrowserValue = R.ReadPropertyFile(PROP_PATH, "Browser");
		String Url = R.ReadPropertyFile(PROP_PATH, "url");

		if (BrowserValue.equalsIgnoreCase("chrome")) {
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");

			//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver(op);
		} 
		else if (BrowserValue.equalsIgnoreCase("Edge")) {

			//System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		} 
		else if(BrowserValue.equalsIgnoreCase("Firefox")) {

			//System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();

		}
		else
		{
			System.out.println("Enter correct Browser");
		}
		// Implicitly wait of 30 Second
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		log.info("url opened");
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		driver.quit();
		log.info("closed browser");
	}

	// Take Screenshot method
	public void captureScreenShot(WebDriver driver, String TestName) throws IOException {
		// step 1: convert webDriver in to TakeScrrenshot interface
		//String path = getreportfilename();

		//TakesScreenshot ScreenShot = ((TakesScreenshot) driver);

		// step 2:call getScreenshota method to create image file
		//File Scr = ScreenShot.getScreenshotAs(OutputType.FILE);

		// step 3 :copy Imp file to destination
		//File Dest = new File(System.getProperty("user.dir")+"//ScreenShot//"+".PNG");
		// Step 4: perform operation using FileUtils method
		//FileUtils.copyFile(Scr,Dest);

		// *other way get full page screen shot* //

		// Screenshot
		
		Screenshot myScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		  ImageIO.write(((Screenshot) myScreenshot).getImage(),"PNG",new
		  File(System.getProperty("user.dir")+"\\ScreenShot\\"+TestName+".png"));
	}
/*@Test
	public static String getreportfilename() {
		String Basepathet = System.getProperty("user.dir") +"/Reports";
		Calendar cal = Calendar.getInstance();
		File Dir = new File(Basepathet);
		Dir.mkdir();
		int year = cal.get(Calendar.YEAR);
		Dir = new File(Basepathet + "/" + year);
		Dir.mkdir();
		int month = cal.get(Calendar.MONTH);
		Dir = new File(Basepathet + "/" + year + "/" + (month + 1));
		Dir.mkdir();
		int day = cal.get(Calendar.DATE);
		Dir = new File(Basepathet + "/" + year + "/" + (month + 1) + "/" + day);
		Dir.mkdir();
		Dir = new File(Basepathet + "/" + year + "/" + (month + 1) + "/" + day + "/" + System.getProperty("user.name"));
		Dir.mkdir();
		Date sDate = new Date();
		Dir = new File(Basepathet + "/" + year + "/" + (month + 1) + "/" + day + "/" + System.getProperty("user.name")
		+ "/Testrun_" + sDate.getHours() + "_" + sDate.getMinutes() + "_" + sDate.getSeconds());
		Dir.mkdir();
		String ReportPath = Dir.getAbsolutePath();
		return ReportPath;
	}*/
	@Test(enabled =true,priority=1)
	public void LoginOperation() throws IOException, InterruptedException
	{	
		log.info("loginoperation test start");
		LoginPagePOM  lp= new LoginPagePOM(driver);
		Loginpage l= new Loginpage();
		lp.LoginOperation();

		l.captureScreenShot(driver,"LoginOperation");
		if(lp.dashboard_logo.isDisplayed())
		{
			Thread.sleep(1000);
			log.info("LoginOperation test case is pass");
			l.captureScreenShot(driver,"LoginOperation");
		}
		else
		{
			log.info("LoginOperation test case is Fail");
		}
	}

}
