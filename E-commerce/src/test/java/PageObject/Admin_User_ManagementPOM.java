package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testcases.Baseclass;

public class Admin_User_ManagementPOM  extends Baseclass {

	public Admin_User_ManagementPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="(//input[@class='oxd-input oxd-input--active'])[2]") public  WebElement User_ManagementUsername;
	@FindBy(xpath="(//input[@placeholder='Type for hints...'])[1]") public WebElement  User_Management_Employee_Name;
	@FindBy(xpath ="//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--ghost']") public WebElement User_Management_ResetBtn;
	@FindBy(xpath ="//button[@type='submit' and @class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") public WebElement User_Management_SearchBtn;

	@FindBy(xpath ="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") public WebElement User_ManagementADDBtn;

	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[1]") public WebElement  User_Management_UserRole;

	@FindBy(xpath ="//label[text()='User Role']/../following-sibling::div//div/span") public List <WebElement> UserRole;
	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[1]") public WebElement UserRoleclick;

	@FindBy(xpath ="//label[text()='Status']/../following-sibling::div//div/span")public List <WebElement> User_Management_Status;
	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[2]") public WebElement Status;
	@FindBy(xpath = "//div [@class='oxd-table-body']/child:: div") public List <WebElement> RecordsFoundADMIN_User_Management ;
	
	
	public void SetUserRoll(String Userrole)
	{
		for(WebElement a: UserRole)
		{
			if(a.getText().equals(Userrole))
			{
				a.click();
			}
		}
	}
	public void Statusclick(String Statusset) throws InterruptedException
	{
		for(WebElement c:User_Management_Status)
		{
			if(c.getText().equals(Statusset))
			{
				Thread.sleep(2000);
				c.click();
			}
		}
	}
}
