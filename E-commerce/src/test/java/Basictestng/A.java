package Basictestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {
 public static WebDriver driver;
 public void l()
	{
	WebDriverManager.firefoxdriver().setup();;
	driver= new  FirefoxDriver();
	driver.get("https://www.facebook.com");
	}
}
