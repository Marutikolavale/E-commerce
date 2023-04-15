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