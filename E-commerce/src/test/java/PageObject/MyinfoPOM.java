package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyinfoPOM {

	public MyinfoPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//input[@name='firstName']") public WebElement FirstName;
	@FindBy(xpath ="//input[@placeholder='Middle Name']") public WebElement Middle_Name;
	@FindBy(xpath ="//input[@placeholder='Last Name']") public WebElement Last_Name;
	@FindBy(xpath ="(//input[@class='oxd-input oxd-input--active'])[2]") public WebElement Nick_Name;
	@FindBy(xpath ="(//input[@class='oxd-input oxd-input--active'])[3]") public WebElement Employee_Id;
	@FindBy(xpath ="(//input[@class='oxd-input oxd-input--active'])[4]") public WebElement Other_Id;
	@FindBy(xpath ="(//input[@class='oxd-input oxd-input--active'])[5]") public WebElement Drivers_License_Number
	;
	@FindBy(xpath ="(//input[@class='oxd-input oxd-input--active'])[7]") public WebElement SSN_Number;

	@FindBy(xpath ="(//input[@class='oxd-input oxd-input--active'])[8]") public WebElement SIN_Number;

	@FindBy(xpath ="(//input[@class='oxd-input oxd-input--active'])[10]") public WebElement Military_Service;
	@FindBy(xpath ="//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']") public WebElement SmokerChekBox;

	@FindBy(xpath ="(//input[@placeholder='yyyy-mm-dd'])[1]") public WebElement License_Expiry_Date;

	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[1]") public WebElement Nationality;

	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[2]") public WebElement Marital_Status;

	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[3]") public WebElement Blood_Type;
	@FindBy(xpath ="//input[@type='radio']") public List <WebElement> Gender;

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
	public void Select_Nationality(String Nationality)
	{

	}
	public void Select_Marital_Status(String Marital_Status)
	{

	}
	public void Select_Date_of_Birth()
	{
		
	}
	public void select_Gender(String Gender)
	{

	}
	public void select_Blood_Type()
	{

	}


}
