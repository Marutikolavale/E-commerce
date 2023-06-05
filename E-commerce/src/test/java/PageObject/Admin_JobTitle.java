package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_JobTitle {

	public Admin_JobTitle(WebElement driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath ="//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--secondary']") public WebElement JObTitleAddBtn;
}
