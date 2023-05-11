package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyinfoPOM {

	public MyinfoPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//input[@name='firstName']") public WebElement firstname;
	@FindBy(xpath ="//img[@class='employee-image']") public WebElement addphotclick;
	@FindBy(xpath ="//i[@class='oxd-icon bi-plus']")public WebElement clickaddbtn;
	@FindBy(xpath ="//button[@type='submit']") public WebElement savebtn;
	public  void add_infor()
	{
		firstname.sendKeys("maruti");
	}
	public void add_photoclick() throws AWTException {

		addphotclick.click();
		clickaddbtn.click();
		
	}

}
