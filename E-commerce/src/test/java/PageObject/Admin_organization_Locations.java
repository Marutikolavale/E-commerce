package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Admin_organization_Locations {

	public Admin_organization_Locations(WebElement driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath ="") public WebElement dElement;
}
