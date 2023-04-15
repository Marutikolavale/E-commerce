package Utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

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

public class ExtentReport implements  ITestListener{

	ExtentSparkReporter  html;
	ExtentReports rop;
	ExtentTest test;
	
	public void config()
	{	
		String Timestamp =new SimpleDateFormat(" yyyy . mm . dd . hh . mm . ss ").format(new Date());
		String ReportName="E-commersTestReport"+ Timestamp+ ".html";
		html =new ExtentSparkReporter(System.getProperty("user.dir") + "//Reports//"+ ReportName);
		rop = new ExtentReports();
		rop.attachReporter(html);
		html.config().setDocumentTitle("Grpical Test Report");
		html.config().setReportName("This is E-commersReport");
		html.config().setTheme(Theme.DARK);
		rop.setSystemInfo("os","window 11");
		rop.setSystemInfo("Browser","chrome");
		rop.setSystemInfo("system","local machine");
	}
	
	public void onTestStart(ITestResult result) {
	}
	
	public void onTestSuccess(ITestResult result) {
		test =rop.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("name of Succes test case is : " +result.getName(),ExtentColor.GREEN));
	}
	
	public void onTestFailure(ITestResult result) {
		test =rop.createTest(result.getName());//create Entry in HTML reports
		test.log(Status.FAIL, MarkupHelper.createLabel("name of fail test case is : " +result.getName(),ExtentColor.RED));
		
		String screenShotPath= System.getProperty("user.dir") + "\\ScreenShot\\" + result.getName()+".png";
		File screenShotFile= new File(screenShotPath);
		if(screenShotFile.exists())
		{
			test.fail( "capctured screenShot is below"+ test.addScreenCaptureFromPath(screenShotPath));
		}
	}
	
	public void onTestSkipped(ITestResult result) {
		test =rop.createTest(result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("name of Skipped test case is : " +result.getName(),ExtentColor.YELLOW));
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}
	
	public void onTestFailedWithTimeout(ITestResult result) {

	}
	
	public void onStart(ITestContext context) {
		config();
	}
	
	public void onFinish(ITestContext context) {
		rop.flush();
	}
}
