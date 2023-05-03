package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPOM {

	public PIMPOM(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText ="Configuration ") public WebElement Configuration;
	@FindBy(linkText ="Employee List") public WebElement EmployeeList;
	@FindBy(linkText ="Add Employee") public WebElement AddEmployee;
	@FindBy(linkText ="Reports") public WebElement Reports;

	// Add Employee imfromation
	@FindBy(xpath ="//input[@name='firstName']") public WebElement FirstName;
	@FindBy(xpath ="//input[@name='middleName']") public WebElement MiddleName;
	@FindBy(xpath ="//input[@name='lastName']") public WebElement LastName;
	@FindBy(xpath ="//input[@class='oxd-input oxd-input--active' and @placeholder='Search']") public WebElement Employee_Id;
	@FindBy(xpath ="//button[@type='submit']") public WebElement  SaveBtn;
	

	////div[@class='oxd-input-group oxd-input-field-bottom-space']//d
	public void  clickConfiguration()
	{
		Configuration.click();
	}

	public void  clickEmployeeList()
	{
		EmployeeList.click();
	}

	public void  clickAddEmployee()
	{
		AddEmployee.click();
	}

	public void  clickReports()
	{
		Reports.click();
	}
}