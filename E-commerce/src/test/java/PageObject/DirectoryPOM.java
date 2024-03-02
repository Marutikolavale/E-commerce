package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DirectoryPOM {

	public DirectoryPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//
	@FindBy(xpath="//input[@placeholder='Type for hints...']") public WebElement Directory_EmployeeName;
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div") public WebElement jobTitle_dropDown;
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div") public WebElement Location_dropDown;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--ghost']") public WebElement resetBtn;
	@FindBy(xpath="//button[@type='submit']") public WebElement  SearchBtn; 
	
	
	
	
	
	
	
	
	
	
	
}
