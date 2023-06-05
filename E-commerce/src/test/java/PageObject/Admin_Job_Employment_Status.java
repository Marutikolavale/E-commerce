package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Job_Employment_Status {

	public Admin_Job_Employment_Status(WebElement driver)
	{
		PageFactory.initElements(driver,this); 
	}
	@FindBy(xpath ="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") public WebElement Admin_job_Employment_StatusAddBtnElement;

}
