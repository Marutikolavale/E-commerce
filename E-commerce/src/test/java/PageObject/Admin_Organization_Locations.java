package PageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Organization_Locations {

	public Admin_Organization_Locations(WebElement driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath ="(//input[@class='oxd-input oxd-input--active'])[2]") public WebElement Name;
	@FindBy(xpath ="(//input[@class='oxd-input oxd-input--active'])[3]") public WebElement city;
	@FindBy(xpath ="//div[@class='oxd-select-text-input']") public WebElement Country;
	@FindBy(xpath ="//label[text()='Country']/../following-sibling :: div//div[@class='oxd-select-text-input']") public List<WebElement> CountryListvalues;





	public void Country(String Country)
	{
		for(WebElement a:CountryListvalues)
			if(a.equals(Country))
			{
				a.click();
			}

	}
}
