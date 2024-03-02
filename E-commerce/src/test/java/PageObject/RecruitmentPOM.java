package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPOM {

	public RecruitmentPOM(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(linkText ="Candidates") public WebElement Candidates;
	@FindBy(linkText ="Vacancies") public WebElement Vacancies;


	public  void clickCandidates()
	{
		Candidates.click();
	}
	public  void clickVacancies()
	{
		Vacancies.click();
	}
}
