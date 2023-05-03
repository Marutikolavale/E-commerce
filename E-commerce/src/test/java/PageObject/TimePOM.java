package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimePOM {

	public TimePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText ="Timesheets ") public WebElement Timesheets ;
	@FindBy(linkText ="Attendance  ") public WebElement Attendance  ;
	@FindBy(linkText ="Reports  ") public WebElement Reports  ;
	@FindBy(linkText ="Project Info  ") public WebElement Project_Info  ;

	//

	public void clickTimesheets()
	{
		Timesheets.click();
	}
	public void clickAttendance()
	{
		Attendance .click();
	}
	public void clickReports()
	{
		Reports.click();
	}
	public void clickProject_Info()
	{
		Project_Info.click();
	}
}
