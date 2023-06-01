package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminOrganization {

	public AdminOrganization(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//ul[@class='oxd-dropdown-menu']/child ::li") public List <WebElement> Organization_dropdwon;





	public void Select_Organization_dropdwon(String Organizationvalue)
	{
		for(WebElement a:Organization_dropdwon)
		{
			if(a.getText().equals(Organizationvalue))
			{
				a.click();
			}
		}
	}
}
