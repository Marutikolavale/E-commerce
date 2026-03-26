package Utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;

public class MyTestListener implements ITestListener {
	private final Logger log = LogManager.getLogger(MyTestListener.class);
	
	public void onTestStart(ITestResult result) {
		String testCaseName=result.getName();
		log.info("********************************************");
		log.info("********************************************");
		log.info("*****Test Case Start:"+testCaseName+"****");
		log.info("********************************************");
		log.info("********************************************");
		Report.createTest(testCaseName);
	}

	public void onTestSuccess(ITestResult result) {
		log.info("********************************************");
		log.info("********************************************");
		log.info("*****Test Case Pass:"+result.getName()+"****");
		log.info("********************************************");
		log.info("********************************************");
		Report.getScreenShot();
		//Report.test.log(Status.PASS,"Test Case Pass:"+result.getName());
		Report.createResult("pass");
		Report.extent.flush();
	}

	public void onTestSkipped(ITestResult result) {
		log.info("********************************************");
		log.info("********************************************");
		log.info("*****Test Case Skip:"+result.getName()+"****");
		log.info("********************************************");
		log.info("********************************************");
		System.out.println("Test Case Skip:"+result.getName());
		Report.test.log(Status.SKIP,"Test Case Skip:"+result.getName());
		Report.extent.flush();
	}

	public void onTestFailure(ITestResult result) {
		log.info("********************************************");
		log.info("********************************************");
		log.info("*****Test Case Failed:"+result.getName()+"****");
		log.info("********************************************");
		log.info("********************************************");
		Report.getScreenShot();
		//Report.test.log(Status.FAIL,"Test Case Failed:"+result.getName());
		Report.createResult("fail");
		Report.extent.flush();
	}
	

}
