package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PerformancePOM {

	public PerformancePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//
	@FindBy(linkText ="Configure ") public WebElement Configure ;
	@FindBy(linkText ="Manage Reviews  ") public WebElement Manage_Reviews  ;
	@FindBy(linkText ="My Trackers") public WebElement My_Trackers ;
	@FindBy(linkText ="Employee Trackers ") public WebElement Employee_Trackers ;

	public void clickConfigure()
	{
		Configure.click();
	}
	public void clickManage_Reviews()
	{
		Manage_Reviews.click();
	}
	public void clickMy_Trackers()
	{
		My_Trackers.click();
	}
	public void clickEmployee_Trackers()
	{
		Employee_Trackers.click();
	}
}
