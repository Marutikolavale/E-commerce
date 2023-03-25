package Basictestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {
 public static WebDriver driver;
 @Test
	public void l()
	{
	WebDriverManager.chromedriver().setup();
	driver= new  ChromeDriver();
	driver.get("google.com");
	}
}
