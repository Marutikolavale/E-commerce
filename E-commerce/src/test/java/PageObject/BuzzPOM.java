package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuzzPOM {
	
	public BuzzPOM(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//
	@FindBy(xpath ="//button[@type='submit']") public WebElement postButton;
	@FindBy(xpath ="//button[text()=' Share Photos']") public  WebElement sharePhoto;
	@FindBy(xpath = "") public WebElement a ;

}
