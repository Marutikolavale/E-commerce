package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Testcases.Baseclass;

public class ExtentReport  implements ITestListener,IAutoConstant {
	public WebDriver driver;
	ExtentSparkReporter  html;
	ExtentReports rop;
	ExtentTest test;
	ExtentReport extentReport;
	ReadConfig readConfig ;
	public void config() throws IOException
	{	
		ReadConfig R = new ReadConfig();
		String values=R.readPropertyFile(PROP_PATH,"Browser");
		String Timestamp =new SimpleDateFormat(" yyyy.MM.dd.HH.mm.ss ").format(new Date());
		String ReportName="E-commerces Testcases Report" + Timestamp +".html";
		html =new ExtentSparkReporter(System.getProperty("user.dir") +File.separator+ "Reports"+File.separator+ ReportName);
		rop = new ExtentReports();
		rop.attachReporter(html);
		html.config().setDocumentTitle("Grpical Test Report");
		html.config().setReportName("Orangehrm App TestCase Report");
		html.config().setTheme(Theme.DARK);
		rop.setSystemInfo("Operting System","Window 11");
		rop.setSystemInfo("Browser",values);
		rop.setSystemInfo("System","Local Machine");
		rop.setSystemInfo("Enveriment","QA");
	}

	public void onTestStart(ITestResult result) {
	}

	public void onTestSuccess(ITestResult result) {
		test =rop.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Name of Pass test case is : " +result.getName(),ExtentColor.GREEN));
		test.pass(result.getThrowable());
	}

	public void onTestFailure(ITestResult result) {
		test =rop.createTest(result.getName());//create Entry in HTML reports
		test.log(Status.FAIL, MarkupHelper.createLabel("Name of Fail test case is : " +result.getName(),ExtentColor.RED));
		test.pass(result.getThrowable().getMessage());
		String screenShotPath = System.getProperty("user.dir") + File.separator+ "ScreenShot"+ File.separator+ result.getName() + ".png";
		
		File screenShotFile = new File(screenShotPath);
		
		if(screenShotFile.exists())
		{
			test.fail("Captured Screenshot is below:" + test.addScreenCaptureFromPath(screenShotPath));
			
		}
	}
		/*
		 * String ScreenShotPath = System.getProperty("user.dir")+File.separator+
		 * "ScreenShot"+File.separator +result.getName()+".png"; File Sh = new
		 * File(ScreenShotPath);
		 * 
		 * if(Sh.exists()) { //test.fail("capctured screenShot is below"
		 * +test.addScreenCaptureFromPath(ScreenShotPath));
		 * test.fail("Captured Screenshot:").addScreenCaptureFromPath(ScreenShotPath);
		 * //test.addScreenCaptureFromPath(ScreenShotPath); }
		 */

	public void onTestSkipped(ITestResult result) {
		test =rop.createTest(result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Name of Skipped test case is : " +result.getName(),ExtentColor.YELLOW));
		test.skip(result.getThrowable());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}
	public void onStart(ITestContext context) {
		try {
			config();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onFinish(ITestContext context) {
		rop.flush();
	}

	// ✅ Screenshot Method
	/*
	 * public String captureScreenshot(WebDriver driver, String testName) { String
	 * fileName = testName + ".png"; String screenshotDir =
	 * System.getProperty("user.dir") + "/ScreenShot"; String fullPath =
	 * screenshotDir + "/" + fileName; File src = ((TakesScreenshot)
	 * driver).getScreenshotAs(OutputType.FILE); try { FileUtils.copyFile(src, new
	 * File(fullPath)); } catch (IOException e) { e.printStackTrace(); }
	 * 
	 * return fullPath; }
	 */

	//	@BeforeSuite
	//	public void setupReport() {
	//	  config();
	//	}
}