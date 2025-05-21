package Testcases;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import Utilities.IAutoConstant;
import Utilities.ReadConfig;

public class d {
	public class Baseclass implements IAutoConstant {

		public WebDriver driver;
		public Logger log = LogManager.getLogger("E-commerce");
		ReadConfig Rc = new ReadConfig();
		SoftAssert sa = new SoftAssert();
	    @Parameters("BrowserValue")
		@BeforeMethod
		public void SetUp() throws IOException {

			ReadConfig R = new ReadConfig();
			String BrowserValue = R.ReadPropertyFile(PROP_PATH, "Browser");
			String Url = R.ReadPropertyFile(PROP_PATH, "url");

			if (BrowserValue.equalsIgnoreCase("chrome")) {
				ChromeOptions op = new ChromeOptions();
				op.addArguments("--remote-allow-origins=*");

				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver(op);
			} 
			else if (BrowserValue.equalsIgnoreCase("Edge")) {

				System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
				driver = new EdgeDriver();
			} 
			else if (BrowserValue.equalsIgnoreCase("Firefox")) {

				System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");

				driver = new FirefoxDriver();

			} else {
				System.out.println("Enter correct Browser");
			}
			// Implicitly wait of 30 Second
			driver.get(Url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			log.info("url opened");
		}
	}
}

