package Basictestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {
	SoftAssert softassert= new SoftAssert();
	public static WebDriver driver;
	@Test
	public void l()
	{
		WebDriverManager.firefoxdriver().setup();;
		driver= new  FirefoxDriver();
		driver.get("https://www.facebook.com");
		softassert.assertEquals(false, true);

		softassert.assertAll();
	}
}
