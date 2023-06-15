package Testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P {
	
	 public void f()
	 {
WebDriver driver =  new ChromeDriver();

	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript(null, null)
	 }
}
