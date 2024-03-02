package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Organization_General_Information {



	public Admin_Organization_General_Information(WebElement driver)
	{
		PageFactory.initElements(driver,this);

	}

	@FindBy(xpath ="//span[@class='oxd-switch-input oxd-switch-input--active --label-left']") public WebElement Admin_Organization_General_Information_Edit;
	@FindBy(xpath ="(//input[@class='oxd-input oxd-input--active'])[2]")  public WebElement Organization_Name;
	@FindBy(xpath ="(//input[@class='oxd-input oxd-input--active'])[3]") public WebElement Registration_Number;











}
