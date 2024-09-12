package DSA;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class d {
	@Test
	public void captureScreenShot() throws IOException {
		// step 1: convert webDriver in to TakeScrrenshot interface
		//String path = getreportfilename();

		TakesScreenshot driver =new ChromeDriver();;
		TakesScreenshot ScreenShot = ((TakesScreenshot) driver);

		// step 2:call getScreenshota method to create image file
		File Scr = ScreenShot.getScreenshotAs(OutputType.FILE);

		// step 3 :copy Imp file to destination
		File Dest = new File(System.getProperty("user.dir")+"//ScreenShot//" + ".jpag");
		// Step 4: perform operation using FileUtils method
		FileUtils.copyFile(Scr,Dest);

}
}
