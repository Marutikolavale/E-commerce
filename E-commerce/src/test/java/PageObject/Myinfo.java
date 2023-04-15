package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myinfo {

	 public Myinfo(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath ="//input[@name='firstName']") public WebElement firstname;
	 @FindBy(xpath ="//img[@class='employee-image']") public WebElement addphotclick;
	 
	   public  void add_infor()
	   {
		   firstname.sendKeys("maruti");
	   }
	    public void add_photoclick() {
		
	    	addphotclick.click();
	    }
}
