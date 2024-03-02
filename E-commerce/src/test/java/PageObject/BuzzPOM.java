package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BuzzPOM {

	
	public BuzzPOM(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//
}
