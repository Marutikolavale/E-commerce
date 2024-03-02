package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_PayGrades {


	public Admin_PayGrades(WebElement driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath ="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") public WebElement  job_Pay_GradsAddBtnElement;


}
