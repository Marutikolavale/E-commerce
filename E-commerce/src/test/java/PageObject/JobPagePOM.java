package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobPagePOM {

	public JobPagePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//ul[@class='oxd-dropdown-menu']/child::li") public  List <WebElement>  Jobdropdwon;

	public void SelectJob(String jobvalues)
	{
		for(WebElement a:Jobdropdwon)
		{
			if(a.getText().equals(jobvalues))
			{
				a.click();
			}
		}
	}



























}
