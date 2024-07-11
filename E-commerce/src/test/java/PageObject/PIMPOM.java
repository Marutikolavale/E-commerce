package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

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
	@FindBy(xpath ="//input[@class='oxd-input oxd-input--active' and @placeholder='Search']") public WebElement Employee_Id1;
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
	@FindBy(xpath ="(//input[@placeholder='Type for hints...'])[1]") public  WebElement Employee_Name;
	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[1]") public  WebElement Employment_Status;
	@FindBy(xpath ="//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']") public WebElement RecordFound;
	@FindBy(xpath ="(//input[@class='oxd-input oxd-input--active'])[2]") public WebElement Employee_Id;
	@FindBy(xpath ="(//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']/child :: input)[2]") public WebElement Supervisor_Name;
	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[2]") public WebElement Include;
	@FindBy(xpath =("//label[text()='Job Title']/../following-sibling::div/div/div/div"))public List <WebElement> Job_Titledropdwon;
	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[3]") public WebElement Job_Title;
	@FindBy(xpath ="(//label[text()='Sub Unit']/../following-sibling::div/div/div/div)[1]") public  List <WebElement> Sub_Unit_dropdwonvalues;
	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[4]") public WebElement sub_UnitElement;
	@FindBy(xpath ="(//label[text()='Include']/../following-sibling::div/div/div/div)[1]") public List <WebElement> includedrop; 
	@FindBy(xpath ="(//label[text()='Employment Status']/../following-sibling::div/div/div/div)[1]") public List <WebElement> Employment_Statusdrop;
	@FindBy(xpath ="//button[@type='submit']") public WebElement SearchBtn;
	@FindBy(xpath ="//button[@type='reset']") public WebElement resetBtn;
	@FindBy(xpath ="//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--secondary']") public WebElement AddBtn;
	@FindBy(xpath ="//div[@id='oxd-toaster_1']") public WebElement messagePopUp;
	public  void Select_Job_Titlevalues(String value1) throws InterruptedException

	{
		for(WebElement a:Job_Titledropdwon)
		{
			if(a.equals(value1))
			{
				System.out.println(value1);
				//Thread.sleep(2000);
				//a.click();
			}
		}
	}
	@Test
	public  void Select_SubUnit_values(String value2) throws InterruptedException
	{
		for(WebElement a:Sub_Unit_dropdwonvalues)
		{
			if(a.equals(value2))
			{
				System.out.println(value2);
				Thread.sleep(2000);

				a.click();
			}
		}
	}
	public  void select_Includevalues(String value3) throws InterruptedException
	{
		for(WebElement a:Sub_Unit_dropdwonvalues)
		{
			if(a.equals(value3))
			{
				System.out.println(value3);
				Thread.sleep(2000);
				a.click();
			}
		}
	}
	public  void Select_Employment_Statusvalues(String value4) throws InterruptedException

	{
		for(WebElement b:Employment_Statusdrop)
		{
			if(b.equals(value4))
			{
				Thread.sleep(2000);
				b.click();
			}
		}
	}
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