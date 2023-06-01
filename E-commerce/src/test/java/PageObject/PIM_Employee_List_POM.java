package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PIM_Employee_List_POM {

	public PIM_Employee_List_POM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="(//input[@placeholder='Type for hints...'])[1]") public  WebElement Employee_Name;
	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[1]") public  WebElement Employment_Status;

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
}
