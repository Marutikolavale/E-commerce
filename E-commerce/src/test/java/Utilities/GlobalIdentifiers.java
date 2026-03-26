package Utilities;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import net.bytebuddy.asm.Advice.This;

public class GlobalIdentifiers {
	private static String PROJECT_BASE_PATH = System.getProperty("user.dir");
	private static WebDriver driver;
	private static String property;
	
	
	public static String getProjectBasePath() {
		return PROJECT_BASE_PATH;
	}
	
	public static void setDriver(WebDriver browser) {
		driver= browser;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setProperty(String propertyName) {
		property=propertyName;
	}
	
	public static String getProperty(String key) {

		String FilePath = GlobalIdentifiers.getProjectBasePath() + "\\src\\main\\resources\\config.properties";
		Properties pro = null;

		File filePath = new File(FilePath);
		try {
			FileInputStream file = new FileInputStream(filePath);
			pro = new Properties();
			pro.load(file);
		} catch (Exception e) {
			System.out.println("File Not found: " + FilePath);
			throw new Error("File Not found: " + FilePath + "\n" + e.getMessage());
		}
		
		return pro.getProperty(key);
	}
		
}
