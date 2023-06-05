package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_job_Work_Shifts {

	public Admin_job_Work_Shifts(WebElement driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath ="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") public WebElement admin_job_Work_ShiftsAddBtnElement;
}
