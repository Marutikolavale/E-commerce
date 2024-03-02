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
	@FindBy(xpath="//input[@placeholder='Type for hints...']") public WebElement employeeReport;
	@FindBy(xpath ="//button[@class='oxd-button oxd-button--medium oxd-button--ghost' ]") public WebElement reportReset;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") public WebElement ReprotSearch;
	@FindBy(xpath="//a[text()='Optional Fields']") public WebElement  Optional_Fields;
	@FindBy(xpath="//a[text()='Custom Fields']") public WebElement  Custom_Fields;
	@FindBy(xpath="//a[text()='Data Import']") public WebElement  Data_Import;
	@FindBy(xpath="//a[text()='Reporting Methods']") public WebElement  Reporting_Methods;
	@FindBy(xpath="//a[text()='Termination Reasons']") public WebElement  Termination_Reasons;
	@FindBy(xpath="//button[@type='button' and @class='oxd-icon-button oxd-main-menu-button']")  public WebElement employeeList_Add;

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