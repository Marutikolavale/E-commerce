package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Admin_Organization_Structure
{

	public Admin_Organization_Structure(WebElement driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath ="//span[@class='oxd-switch-input oxd-switch-input--active --label-left']") public WebElement EditBtn;
	@FindBy(xpath ="//button[@class='oxd-button oxd-button--medium oxd-button--secondary org-structure-add']") public WebElement addBtn;
}
