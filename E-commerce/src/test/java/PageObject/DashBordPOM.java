package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBordPOM {

	public DashBordPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//input[@class='oxd-input oxd-input--active']") public WebElement Search;
	@FindBy(linkText = "Admin") public  WebElement Admin;
	@FindBy(linkText = "PIM") public  WebElement PIM;
	@FindBy(linkText = "Leave") public  WebElement Leave;
	@FindBy(linkText = "Time") public  WebElement Time;
	@FindBy(linkText = "Recruitment") public  WebElement Recruitment;
	@FindBy(linkText = "My Info") public  WebElement MyInfo;
	@FindBy(linkText = "Performance") public  WebElement Performance;
	@FindBy(linkText = "Dashboard") public  WebElement Dashboard;
	@FindBy(linkText = "Directory") public  WebElement Directory;

	@FindBy(linkText = "Maintenance") public  WebElement Maintenance;
	@FindBy(linkText ="Claim") public WebElement Claim;
	@FindBy(linkText = "Buzz") public  WebElement Buzz;

	public void   Searchclick()
	{
		Search.click();
	}
	public void  adminclick()
	{
		Admin.click();
	}
	public void   PIMclick()
	{
		PIM.click();
	}
	public void  Leaveclick()
	{
		Leave.click();
	}
	public void   Timeclick()
	{
		Time.click();
	}
	public void  Recruitmentclick()
	{
		Recruitment.click();
	}
	public void  MyInfoclick()
	{
		MyInfo.click();
	}
	public void   Performanceclick()
	{
		Performance.click();
	}
	public void   Dashboardclick()
	{
		Dashboard.click();
	}
	public void   Directoryclick()
	{
		Directory.click();
	}
	public void   Maintenanceclick()
	{
		Maintenance.click();
	}
	public void   click()
	{
		Buzz.click();
	}
}
