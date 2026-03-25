package Testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.ibm.icu.text.SimpleDateFormat;

import Utilities.IAutoConstant;
import Utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import javassist.bytecode.stackmap.TypeData.ClassName;

public class Baseclass implements IAutoConstant {

	public WebDriver driver;
//	public Logger log = LogManager.getLogger("E-commerce");
	//public Logger log = LogManager.getLogger(this.getClass());
	public Logger log = LogManager.getLogger(ClassName.class);
	
	
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(Url);	
		log.info("url opened");
	}
	@AfterMethod
	public void tearDown() throws InterruptedException {
		driver.quit();
		log.info("closed browser");
	}

	/*
	 * // Take Screenshot method public String captureScreenShot(WebDriver driver,
	 * String TestName) throws IOException { String timestamp = new
	 * SimpleDateFormat("_yyyy.MM.dd.hh.mm.ss").format(new Date()); // step 1:
	 * convert webDriver in to TakeScrrenshot interface // String path = //
	 * getreportfilename();
	 * 
	 * TakesScreenshot ScreenShot = ((TakesScreenshot)driver);
	 * 
	 * // step 2:call getScreenshota method to create image file // File Scr =
	 * ScreenShot.getScreenshotAs(OutputType.FILE);
	 * 
	 * // step 3 :copy Imp file to destination // String TargetFilepath =
	 * (System.getProperty("user.dir")+File.separator +"ScreenShot"+ File.separator
	 * + TestName + timestamp+".PNG"); File path= new File(TargetFilepath);
	 * Scr.renameTo(path); // Step 4:perform operation using FileUtils method
	 * //FileUtils.copyFile(Scr,Dest); return TargetFilepath; }
	 */
	//user method to capture screen shot
	public String captureScreenShot(WebDriver driver, String testName) throws IOException {

	    if (driver == null) {
	        throw new RuntimeException("Driver is NULL! Screenshot not possible");
	    }

	    // timestamp
	    String timestamp = new SimpleDateFormat("_yyyy.MM.dd.HH.mm.ss").format(new Date());

	    // convert to screenshot
	    TakesScreenshot screenshot = (TakesScreenshot) driver;
	    File src = screenshot.getScreenshotAs(OutputType.FILE);

	    // folder create
	    String folderPath = System.getProperty("user.dir") + File.separator + "Screenshots"+File.separator+testName + ".png";
	    File folder = new File(folderPath);
	    if (!folder.exists()) {
	        folder.mkdirs();
	    }

		return folderPath;
	}
		/*// *other way get full page screen shot* //

		// Screenshot
		
		 * Screenshot myScreenshot = new
		 * AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
		 * .takeScreenshot(driver); ImageIO.write(((Screenshot)
		 * myScreenshot).getImage(), "PNG", new File(System.getProperty("user.dir") +
		 * File.separator+ "ScreenShot" +File.separator +TestName + ".png"));*/

	 
WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

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

		 

