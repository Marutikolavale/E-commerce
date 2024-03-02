package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import groovyjarjarantlr4.v4.parse.ANTLRParser.id_return;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class LeavePOM {

	public LeavePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText ="Apply") public WebElement Apply;
	@FindBy(linkText ="My Leave") public WebElement My_Leave;
	@FindBy(linkText ="Entitlements ") public WebElement Entitlements ;
	@FindBy(linkText ="Reports ") public WebElement Reports ;
	@FindBy(linkText ="Configure ") public WebElement Configure ;
	@FindBy(linkText ="Leave List") public WebElement Leave_List;
	@FindBy(linkText ="Assign Leave") public WebElement Assign_Leave;

	// my Leave
	@FindBy(xpath ="//i[@ class='oxd-icon bi-x oxd-sidepanel-header-close']") public WebElement MyLeave_fromDate;
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active' and  @placeholder='Search']") public WebElement MyLeave_fromDate_Year;
	@FindBy(xpath="//div[text()='Select']") public WebElement Show_Leave_with_Status;
	@FindBy(xpath="//div[@class='oxd-multiselect-chips-area']/child::span") public List <WebElement>  show_Leave_with_Status_dropdwon;
	
	public void clickApply()
	{
		Apply.click(); 
	}
	public void clickMy_Leave()
	{
		My_Leave.click();
	}
	public void clickEntitlements()
	{
		Entitlements.click(); 
	}
	public void clickReports()
	{
		Reports.click(); 
	}
	public void clickConfigure()
	{
		Configure.click();	 
	}
	public void clickLeave_List()
	{
		Leave_List.click(); 
	}
	public void clickAssign_Leave()
	{
		Assign_Leave.click(); 
	} 
	public void A(String er)
	{
		for(WebElement  a:show_Leave_with_Status_dropdwon)
		{
			if (a.getText().equals(er)) 
			{
				a.click();
				System.out.println();
				
			}
		a.getText();	
		}
	}
}
