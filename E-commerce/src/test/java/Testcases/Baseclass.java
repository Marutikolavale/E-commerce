package Testcases;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import PageObject.LoginPagePOM;
import Utilities.IAutoConstant;
import Utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Baseclass implements IAutoConstant{


	public WebDriver driver;
	public Logger log=LogManager.getLogger("E-commers");
	ReadConfig Rc= new ReadConfig();
	SoftAssert sa= new  SoftAssert();


	@BeforeMethod
	public void SetUp() throws IOException 
	{

		ReadConfig R= new ReadConfig(); 
		String BrowserValue =R.ReadPropertyFile(PROP_PATH,"Browser");
		String Url =R.ReadPropertyFile(PROP_PATH,"url");

		if(BrowserValue.equalsIgnoreCase("chrome"))
		{
			ChromeOptions op= new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
			//WebDriverManager.chromedriver().setup();
			//driver = new ChromeDriver(op);*/
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver= new ChromeDriver(op);
		}
		else if(BrowserValue.equalsIgnoreCase("Edge"))
		{ 
			//WebDriverManager.edgedriver().setup();
			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else if(BrowserValue.equalsIgnoreCase("Firefox"))
		{
			//WebDriverManager.firefoxdriver().setup()
			System.setProperty("webdriver.gecko.driver","C:\\Users\\mbkol\\git\\E-commerce\\E-commerce\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		else
		{
			System.out.println("Enter correct Browser");
		}
		//Implicitly wait of 30 Second
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		log.info("url opened");
	}
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		driver.quit();
		log.info("closed browser");
	}
	// Take Screenshot method
	public void captureScreenShot(WebDriver driver ,String TestName) throws IOException
	{
		// step 1: convert webDriver in to TakeScrrenshot interface

		TakesScreenshot ScreenShot =((TakesScreenshot)driver);

		// step 2:call getScreenshota method to create image file
		File  Scr =ScreenShot.getScreenshotAs(OutputType.FILE);

		// step 3 :copy  Img file to destination
		File Dest= new File(System.getProperty("user.dir")+"\\ScreenShot\\"+TestName+".png");

		// Step 4: perform operation  using FileUtils methods
		FileUtils.copyFile(Scr, Dest);

		//   *other way get full page screen shot*   //

		//Screenshot myScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
		//ImageIO.write(myScreenshot.getImage(),"PNG",new File(System.getProperty("user.dir")+"\\ScreenShot\\"+TestName+".png"));
	}

}
