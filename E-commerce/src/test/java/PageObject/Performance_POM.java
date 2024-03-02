package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Performance_POM {



	public Performance_POM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



	@FindBy(xpath = "//span[text()='Configure ']") public WebElement Configure ;
	@FindBy(xpath = "//span[text()='Manage Reviews ']") public WebElement Manage_Reviews;
	@FindBy(xpath = "//a[text()='My Trackers']") public WebElement My_Trackers;
	@FindBy(xpath = "//li[@class='--active oxd-topbar-body-nav-tab']") public WebElement More;
	@FindBy(xpath = "//span[text()='Configure ']//following-sibling::ul/li") public List <WebElement> ConfigureList;
	@FindBy(xpath = "//span[text()='Manage Reviews ']//following-sibling::ul/li") public List <WebElement> Manage_Reviewslist;

}
