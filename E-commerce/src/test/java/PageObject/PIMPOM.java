package PageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DSA.window_fail;

public class PIMPOM {
	WebDriver driver;
	JavascriptExecutor js= (JavascriptExecutor)driver;
	public PIMPOM(WebDriver driver)
	{     this.driver = driver; 
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText ="Configuration ") private WebElement Configuration;
	@FindBy(linkText ="Employee List") private WebElement EmployeeList;
	@FindBy(linkText ="Add Employee") private WebElement AddEmployee;
	@FindBy(linkText ="Reports") public WebElement Reports;
	// Add Employee imfromation
	@FindBy(xpath ="//input[@name='firstName']") private WebElement FirstName;
	@FindBy(xpath ="//input[@name='middleName']") private WebElement MiddleName;
	@FindBy(xpath ="//input[@name='lastName']") private WebElement LastName;
	@FindBy(xpath ="//input[@class='oxd-input oxd-input--active' and @placeholder='Search']") public WebElement Employee_Id1;
	@FindBy(xpath ="//button[@type='submit']") private WebElement  SaveBtn;
	@FindBy(xpath ="//input[@placeholder='Type for hints...']") private WebElement employeeReport;
	@FindBy(xpath ="//button[@class='oxd-button oxd-button--medium oxd-button--ghost' ]") public WebElement reportReset;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") public WebElement ReprotSearch;
	@FindBy(xpath="//a[text()='Optional Fields']") private WebElement  Optional_Fields;
	@FindBy(xpath="//a[text()='Custom Fields']") private WebElement  Custom_Fields;
	@FindBy(xpath="//a[text()='Data Import']") private WebElement  Data_Import;
	@FindBy(xpath="//a[text()='Reporting Methods']") private WebElement  Reporting_Methods;
	@FindBy(xpath="//a[text()='Termination Reasons']") private WebElement  Termination_Reasons;
	@FindBy(xpath="//button[@type='button' and @class='oxd-icon-button oxd-main-menu-button']")  private WebElement employeeList_Add;
	@FindBy(xpath ="(//input[@placeholder='Type for hints...'])[1]") private  WebElement Employee_Name;
	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[1]") private  WebElement Employment_Status;
	@FindBy(xpath ="//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']") private WebElement RecordFound;

	@FindBy(xpath ="(//input[@class='oxd-input oxd-input--active'])[2]") private WebElement Employee_Id;
	@FindBy(xpath ="(//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']/child :: input)[2]") public WebElement Supervisor_Name;
	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[2]") private WebElement Include;
	@FindBy(xpath =("//label[text()='Job Title']/../following-sibling::div/div/div/div"))private List <WebElement> Job_Titledropdwon;
	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[3]") private WebElement Job_Title;
	@FindBy(xpath ="(//label[text()='Sub Unit']/../following-sibling::div/div/div/div)[1]") private  List <WebElement> Sub_Unit_dropdwonvalues;
	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[4]") private WebElement sub_UnitElement;
	@FindBy(xpath ="(//label[text()='Include']/../following-sibling::div/div/div/div)[1]") private List <WebElement> includedrop; 
	@FindBy(xpath ="(//label[text()='Employment Status']/../following-sibling::div/div/div/div)[1]") private List <WebElement> Employment_Statusdrop;
	@FindBy(xpath ="//button[@type='submit']") private WebElement SearchBtn;
	@FindBy(xpath ="//button[@type='reset']") private WebElement resetBtn;
	@FindBy(xpath ="//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--secondary']") private WebElement AddBtn;
	@FindBy(xpath ="//div[@id='oxd-toaster_1']") private WebElement messagePopUp;
	@FindBy(xpath ="//h6[text()='Personal Details']") private WebElement Personal_Details;


	//




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
	//
	public void firstName(String firstName) throws InterruptedException
	{
		FirstName.clear();
		FirstName.sendKeys(firstName);
	}
	public void middleName(String middleName) throws InterruptedException
	{
		MiddleName.clear();
		MiddleName.sendKeys(middleName);

	}

	public void lastName(String lastName) throws InterruptedException
	{
		LastName.clear();

		LastName.sendKeys(lastName);
	}
	
	public void SaveBtnclick()
	{
		SaveBtn.click();
	}
	
	public void Employee_Id1_clear()
	{
		Employee_Id1.click();
		Employee_Id1.clear();
	}
	public String veirfypopupmassges() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    
	    WebElement toast=  wait.until(ExpectedConditions.visibilityOfElementLocated(
	        By.xpath("//div[contains(@class,'oxd-toast')]")
	        
	    ));
	    String message  =toast.getText();
		return message;
	}
	
	 public void employee_Name(String employee_Name)
	 {
		 Employee_Name.sendKeys(employee_Name);
	 }
	 
	  public void SearchBtnclick()
	  {
		  SearchBtn.click();
	  }
	  public String recordFound()
	  {
		  String actual=RecordFound.getText();
		  return actual;
	  }

	  public void scrollToElement() {
		   
		    js.executeScript("window.scrollBy(0,500)");
		}
}