package PageObject;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testcases.Baseclass;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class MyinfoPOM extends Baseclass {
	JavascriptExecutor js;
	public MyinfoPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;

	}

	@FindBy(xpath ="//input[@name='firstName']") public WebElement FirstName;
	@FindBy(xpath ="//input[@placeholder='Middle Name']") public WebElement Middle_Name;
	@FindBy(xpath ="//input[@placeholder='Last Name']") public WebElement Last_Name;
	@FindBy(xpath ="(//input[@class='oxd-input oxd-input--active'])[2]") public WebElement Nick_Name;
	@FindBy(xpath ="//*[contains(text(),'Employee Id')]/parent::div/following-sibling::div/input") public WebElement Employee_Id;
	@FindBy(xpath ="//*[contains(text(),'Other Id')]/parent::div/following-sibling::div/input") public WebElement Other_Id;
	@FindBy(xpath ="(//*[contains(@class,'oxd-label')]/parent::div/following-sibling::div/input)[4]") public WebElement Drivers_License_Number;
	@FindBy(xpath ="//*[contains(text(),'SSN Number')]/parent::div/following-sibling::div/input") public WebElement SSN_Number;

	@FindBy(xpath ="//*[contains(text(),'SIN Number')]/parent::div/following-sibling::div/input") public WebElement SIN_Number;

	@FindBy(xpath ="(//input[@class='oxd-input oxd-input--active'])[10]") public WebElement Military_Service;
	@FindBy(xpath ="//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']") public WebElement SmokerChekBox;

	@FindBy(xpath ="(//input[@placeholder='yyyy-mm-dd'])[1]") public WebElement License_Expiry_Date;

	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[1]") public WebElement Nationality;
	@FindBy(xpath ="(//label[@class='oxd-label'])[8]/../ following-sibling :: div//div[@class='oxd-select-text-input']")public List <WebElement> Nationalitylist;
	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[2]") public WebElement Marital_Status;
	@FindBy(xpath ="//*[text()='Blood Type']/../following-sibling::div/div") public WebElement Blood_Type; 
	@FindBy(xpath ="//*[text()='Blood Type']/../following-sibling::div//*[@class='oxd-select-text-input']") public  List <WebElement> Blood_TypeList;
	@FindBy(xpath ="//input[@type='radio']") public List <WebElement> Genders;

	@FindBy(xpath ="(//input[@placeholder='yyyy-mm-dd'])[2]") public WebElement Date_of_Birth;
	/*@FindBy(xpath ="") public WebElement ;

	@FindBy(xpath ="") public WebElement s;*/
	@FindBy(xpath ="//img[@class='employee-image']") public WebElement addphotclick;
	@FindBy(xpath ="//i[@class='oxd-icon bi-plus']")public WebElement clickaddbtn;
	@FindBy(xpath ="//button[@type='submit']") public WebElement savebtn;

	public void add_photoclick() throws AWTException {

		addphotclick.click();
		clickaddbtn.click();

	}
	public void Set_License_Expiry_Date()
	{


	}
	public void Select_Nationality(String Nationality) throws InterruptedException
	{
		for(WebElement a: Nationalitylist)
		{
			if(a.equals(Nationality))
			{
				Thread.sleep(2000);
				a.click();
			}
		}
	}
	public void Select_Marital_Status(String Marital_Status)
	{

	}
	public void Select_Date_of_Birth()
	{


	}
	public void select_Gender(String Gender)
	{
		for(WebElement a:Genders)
		{
			if(a.equals(Gender))
			{
				a.click();
			}
		}
	}
	public void select_Blood_Type(String select_Blood_Type) throws InterruptedException
	{
		for(WebElement a:Blood_TypeList)
		{
			if(a.equals(select_Blood_Type))
			{
				Thread.sleep(2000);
				a.click();
			}
		}
	}
	public String PrintNationality() throws InterruptedException
	{
		for(WebElement a: Nationalitylist)
		{
	String data=a.getText();
	return data;

	}
		return null;
	}
}
