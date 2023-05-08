package Testcases;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import Utilities.IAutoConstant;
import Utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass implements IAutoConstant{

	public static WebDriver driver;
	public static Logger log=LogManager.getLogger("E-commers");

	@BeforeMethod
	public void SetUp() throws IOException 
	{
		ReadConfig R= new ReadConfig();
		String BrowserValue = R.ReadPropertyFile(PROP_PATH,"Browser");
		String Url = R.ReadPropertyFile(PROP_PATH,"url");
		if(BrowserValue.equalsIgnoreCase("chrome"))
		{
			ChromeOptions op= new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(op);
		}
		else if(BrowserValue.equalsIgnoreCase("Edge"))
		{ 
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(BrowserValue.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Enter correct Choice");
		}
		//Implicit wait of 30 Second
		
		driver.manage().window().maximize();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		log.info("url opened");
	}

	public void tearDown()
	{
		driver.quit();
		log.info("closed browser");
	}
	// Taking Screenshot
	public void captureScreenShot(WebDriver driver ,String TestName) throws IOException
	{
		// step 1: convert webDriver in to TakeScrrenshot interface

		TakesScreenshot ScreenShot=((TakesScreenshot)driver);

		// step 2:call getScreenshota method to create image file
		File Scr=ScreenShot.getScreenshotAs(OutputType.FILE);

		// step 3 :copy  Img file to destination
		File Dest= new File(System.getProperty("user.dir")+"\\ScreenShot\\"+TestName+".png");

		// Step 4: perform operation  using FileUtils methods
		FileUtils.copyFile(Scr, Dest);
	}

}


