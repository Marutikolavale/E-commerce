package DSA;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.apache.poi.hssf.record.MulRKRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import jnr.ffi.Struct.int16_t;

public class dddd {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.get("http://www.deadlinkcity.com/");
		int responsecode = 200;
		int count = 0;
		int count1=0;
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println("tototal linke size = " + linklist.size());

		
		for (WebElement Element : linklist) {
		String link	=Element.getAttribute("href");
		
		URL url=new URL(link);
		HttpURLConnection connection= (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("HEAD");
		connection.connect();
		responsecode=connection.getResponseCode();
		if(responsecode>=400)
		{
			System.out.println(url+"link is broken");
			count++;
		}
		else {
			System.out.println(url+"link is  not broken");
			count1++;
		}
		
		}
	}
}