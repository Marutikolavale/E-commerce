package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClaimPOM {

	public ClaimPOM(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath ="//a[text()='Submit Claim']") public WebElement Submit_Claim;
	@FindBy(linkText = "My Claims") public WebElement My_Claims;
	@FindBy(linkText = "Employee Claims") public WebElement Employee_Claims;
	@FindBy(linkText ="Assign Claim") public WebElement Assign_Claim;
	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[1]") public  WebElement Event;
	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[2]") public WebElement Currency;
	@FindBy(linkText ="//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']") public WebElement Remarks;
	@FindBy(xpath ="(//button[@type='button'])[3]") public WebElement  CancelBTN;
	@FindBy(xpath ="(//button[@type='button'])[4]") public WebElement  SaveBTN;


	@FindBy(xpath ="//label[text()='Event']/../following-sibling::div//div[@class='oxd-select-text-input']") public  List<WebElement> eventList;
	@FindBy(xpath ="//label[text()='Currency']/../following-sibling::div//div") public List<WebElement> currencyList;

	public void Select_EventList(String EventList) throws InterruptedException
	{
		for (WebElement a :eventList) {
			System.out.println(a);
			if(a.equals(EventList))
			{
				Thread.sleep(5000);
			String s = a.getText();
			System.out.println(s);
				a.click();
				
			}	
		}	

	}
	public  void select_Currency(String Currency)
	{
		for (WebElement b : currencyList) {
			if(b.equals(Currency))
			{
				b.click();
			}
		}
	}


}
