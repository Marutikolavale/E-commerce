package Testcases;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import org.testng.asserts.SoftAssert;

import Utilities.IAutoConstant;
import Utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass implements IAutoConstant {

	public WebDriver driver;
	public Logger log = LogManager.getLogger("E-commerce");
	ReadConfig Rc = new ReadConfig();
	SoftAssert sa = new SoftAssert();

	//@Parameters("Browser")//
	@BeforeMethod
	public void SetUp() throws IOException {
		ReadConfig R = new ReadConfig();
		
		String BrowserValue = R.readPropertyFile(PROP_PATH, "Browser");
		String Url = R.readPropertyFile(PROP_PATH, "url");

		switch (BrowserValue.toLowerCase()) {
		case "chrome":
			// System.setProperty("webdriver.Chrome.driver","./Drivers/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Enter correct Browser");
			break;
		}

		// Implicitly wait of 30 Second
		//driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(Url);
		log.info("url opened");
	}
	@AfterMethod
	public void tearDown() throws InterruptedException {
		driver.quit();
		log.info("closed browser");
	}

	// Take Screenshot method
	public String captureScreenShot(WebDriver driver, String TestName) throws IOException {
		String timestamp = new SimpleDateFormat("_yyyy.MM.dd.hh.mm.ss").format(new Date());
		  // step 1: convert webDriver in to TakeScrrenshot interface // String path =
		//  getreportfilename();
		  
		  TakesScreenshot ScreenShot = ((TakesScreenshot)driver);
		  
		  // step 2:call getScreenshota method to create image file //
		  File Scr = ScreenShot.getScreenshotAs(OutputType.FILE);
		  
		  // step 3 :copy Imp file to destination //
		String  TargetFilepath = (System.getProperty("user.dir")+File.separator +"ScreenShot"+ File.separator + TestName + timestamp+".PNG");
		File path= new File(TargetFilepath);
		Scr.renameTo(path);
		// Step 4:perform operation using FileUtils method 
		   //FileUtils.copyFile(Scr,Dest);
		   return TargetFilepath;
		  
		
		   
	}
		 
		/*// *other way get full page screen shot* //

		// Screenshot
		
		 * Screenshot myScreenshot = new
		 * AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
		 * .takeScreenshot(driver); ImageIO.write(((Screenshot)
		 * myScreenshot).getImage(), "PNG", new File(System.getProperty("user.dir") +
		 * File.separator+ "ScreenShot" +File.separator +TestName + ".png"));
		 
		
	}

	/*
	 * @Test public static String getreportfilename() { String Basepathet
	 * =System.getProperty("user.dir") +"/Reports"; Calendar
	 * cal=Calendar.getInstance(); File Dir = new File(Basepathet); Dir.mkdir(); int
	 * year = cal.get(Calendar.YEAR); Dir = new File(Basepathet + "/" + year);
	 * Dir.mkdir(); int month = cal.get(Calendar.MONTH); Dir = new File(Basepathet
	 * +"/" + year + "/" + (month + 1)); Dir.mkdir(); int day
	 * =cal.get(Calendar.DATE); Dir = new File(Basepathet + "/" + year + "/" +
	 * (month + 1) + "/" + day); Dir.mkdir(); Dir = new File(Basepathet + "/" + year
	 * + "/"+ (month + 1) + "/" + day + "/" + System.getProperty("user.name"));
	 * Dir.mkdir(); Date sDate = new Date(day, day, day); Dir = new File(Basepathet
	 * + "/" + year + "/" + (month + 1) + "/" + day + "/" +
	 * System.getProperty("user.name") + "/Testrun_" + sDate.getHours() + "_" +
	 * sDate.getMinutes() + "_" + sDate.getSeconds()); Dir.mkdir(); String
	 * ReportPath = Dir.getAbsolutePath(); return ReportPath; }
	 */

		/*
		 * public static String getReportFileName(){ String basePath =
		 * System.getProperty("user.dir") + File.separator + "Reports"; LocalDateTime
		 * now = LocalDateTime.now(); String reportPath = basePath + File.separator +
		 * now.getYear() + File.separator + now.getMonthValue() + File.separator +
		 * now.getMonth() + File.separator + System.getProperty("user.name") +
		 * File.separator + "Testrun_"
		 * +now.format(DateTimeFormatter.ofPattern("HH_mm_ss")); new
		 * File(reportPath).mkdirs(); return reportPath; }
		 */
}
		 

