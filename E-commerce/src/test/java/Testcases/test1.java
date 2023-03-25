package Testcases;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class test1 extends Baseclass{

	public void demo() throws IOException
	{
		String a="maruti";
		String b="kolavale";
		Logger log= LogManager.getLogger("sss");
		if (a==b) {
			Assert.assertFalse(false);
			captureScreenShot(driver,"demo");
		}
		else {
			Assert.assertTrue(true);
		}

	}
}
