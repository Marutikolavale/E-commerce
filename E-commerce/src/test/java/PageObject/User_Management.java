package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Testcases.Baseclass;

public class User_Management  extends Baseclass {

	 
@FindBy(xpath ="//input[@class='oxd-input oxd-input--active' and @placeholder='Search']") public  WebElement User_ManagementUsername;
@FindBy(xpath="//input[@placeholder='Type for hints...']") public WebElement  User_Management_Employee_Name;
@FindBy(xpath ="//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--ghost']") public WebElement User_Management_ResetBtn;
@FindBy(xpath ="//button[@type='submit' ]") public WebElement User_Management_SearchBtn;

@FindBy(xpath ="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") public WebElement User_ManagementADDBtn;

@FindBy(xpath ="") public WebElement User_Management;



}
