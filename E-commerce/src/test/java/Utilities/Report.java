//package com.orangehrm.utils;
package Utilities;

import java.io.File;
import java.time.LocalDate;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import net.bytebuddy.asm.Advice.This;

public class Report {
	static String REPORT_FOLDER_PATH;
	static String SCREENSHOT_FOLDER_PATH;
	static String SCREENSHOT_FILE_PATH;
	public static ExtentTest test;
	public static ExtentReports extent;
	public static String TC_ID = null;

	public static void createReport() {
		String reportPath = REPORT_FOLDER_PATH + "/report.html";
		ExtentSparkReporter sp = new ExtentSparkReporter(reportPath);
		sp.config().setDocumentTitle("Orange HRM");
		sp.config().setReportName("Test Result");

		extent = new ExtentReports();
		extent.attachReporter(sp);
		extent.setSystemInfo("Env", "UAT");
		extent.setSystemInfo("User", "Bhagwan");
		extent.setSystemInfo("URL", GlobalIdentifiers.getProperty("url"));
		extent.setSystemInfo("Browser", GlobalIdentifiers.getProperty("browser"));
	}

	public static void createResult(String status) {
		try {
			Media media = MediaEntityBuilder.createScreenCaptureFromPath(SCREENSHOT_FILE_PATH).build();

			if (status.trim().toLowerCase().equals("pass")) {
				test.log(Status.PASS, media);
			} else if (status.trim().toLowerCase().equals("fail")) {
				test.log(Status.FAIL, media);
			} else {
				test.log(Status.SKIP, media);
			}
		} catch (Exception e) {
			test.log(Status.WARNING, "Screenshot could not be attached");
		}

	}

	public static void log(String details) {
		test.info(details);
	}
	public static void logsForAPI(String title, String details) {
		test.info(title+":<br>"+details);
	}

	public static void log(String details, String imagePath) {
		Media media = MediaEntityBuilder.createScreenCaptureFromPath(imagePath).build();
		test.info(details, media);
	}

	public static void createTest(String testCaseName) {
		test = extent.createTest(testCaseName);
	}

	public static void createTest(String testCaseName, String SCN_ID) {
		test = extent.createTest(testCaseName);
		TC_ID = SCN_ID;
	}

	public static void createReportFolderPath() {
		String reportPath = GlobalIdentifiers.getProjectBasePath() + "/report";
		LocalDate currentDate = LocalDate.now();

		File file = new File(reportPath);
		if (!file.exists()) {
			file.mkdir();
		}
		int year = currentDate.getYear();
		reportPath = reportPath + "/" + year;
		file = new File(reportPath);
		if (!file.exists()) {
			file.mkdir();
		}
		int month = currentDate.getMonthValue();
		reportPath = reportPath + "/" + month;
		file = new File(reportPath);
		if (!file.exists()) {
			file.mkdir();
		}
		int date = currentDate.getDayOfMonth();
		reportPath = reportPath + "/" + date;
		file = new File(reportPath);
		if (!file.exists()) {
			file.mkdir();
		}

		reportPath = reportPath + "/" + "Report_" + new Date().getHours() + "_" + new Date().getMinutes() + "_"
				+ new Date().getSeconds();
		file = new File(reportPath);
		if (!file.exists()) {
			file.mkdir();
		}

		REPORT_FOLDER_PATH = file.getAbsolutePath();

	}

	public static void createScreenshotFolderPath() {
		String reportPath = REPORT_FOLDER_PATH + "/Screenshot";
		File file = new File(reportPath);
		try {
			if (!TC_ID.isEmpty()) {
				reportPath = reportPath + "/" + TC_ID;
				file = new File(reportPath);
				if (!file.exists()) {
					file.mkdir();
				}
			}
			if (!file.exists()) {
				file.mkdir();
			}
		} catch (Exception e) {
		}

		SCREENSHOT_FOLDER_PATH = file.getAbsolutePath();
	}

	public static void getScreenShot(String screenshotName) {
		createScreenshotFolderPath();
		String screenshotFolderPath = SCREENSHOT_FOLDER_PATH + "/" + screenshotName + ".png";
		SCREENSHOT_FILE_PATH = screenshotFolderPath;
		try {
			TakesScreenshot ts = (TakesScreenshot) GlobalIdentifiers.getDriver();
			File srcFile = ts.getScreenshotAs(OutputType.FILE);

			File desFile = new File(screenshotFolderPath);

			FileUtils.copyFile(srcFile, desFile);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getScreenShot() {
		createScreenshotFolderPath();
		Date date = new Date();
		String screenshotName = date.getHours() + "_" + date.getMinutes() + "_" + date.getSeconds() + ".png";
		String screenshotFolderPath = SCREENSHOT_FOLDER_PATH + "/" + screenshotName;
		SCREENSHOT_FILE_PATH = screenshotFolderPath;

		try {
			TakesScreenshot ts = (TakesScreenshot) GlobalIdentifiers.getDriver();
			File srcFile = ts.getScreenshotAs(OutputType.FILE);

			File desFile = new File(screenshotFolderPath);

			FileUtils.copyFile(srcFile, desFile);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void createLogsFolder() {
		String reportPath = GlobalIdentifiers.getProjectBasePath() + "/report";

		File file = new File(reportPath);
		if (!file.exists()) {
			file.mkdir();
		}

		reportPath = reportPath + "logs";
		file = new File(reportPath);
		if (!file.exists()) {
			file.mkdir();
		}
	}

}
