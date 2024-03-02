package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPOM {

	 public AdminPOM(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 @FindBy(linkText ="//span[ text()='User Management ' and @class='oxd-topbar-body-nav-tab-item']") public WebElement UserManagement;
	 @FindBy(xpath ="//span[text()='Job ']") public WebElement Job;
	 @FindBy(linkText ="Organization") public WebElement Organization;
	 @FindBy(linkText ="Qualifications") public WebElement Qualifications  ;
	 @FindBy(linkText ="Nationalities") public WebElement Nationalities;
	 @FindBy(linkText ="Corporate Branding") public WebElement CorporateBranding;
	 @FindBy(linkText ="Configuration") public WebElement Configuration;
	 //
	 @FindBy(linkText="Users") public WebElement users;
	 @FindBy(xpath ="//div[@class='oxd-select-text-input']") public WebElement SSS;
	 @FindBy(xpath ="//div[text()='Disabled' and @class='oxd-select-text-input']") public WebElement aaa;
	
	 public void clickUserManagement()
	 {
		 UserManagement.click();
	 }
	 public void clickJob()
	 {
		 Job.click();
	 }
	
	 public void clickOrganization()
	 {
		 Organization.click();
	 }
	
	 public void clickQualifications()
	 {
		 Qualifications.click();
	 }
	
	 public void clickNationalities()
	 {
		 Nationalities.click();
	 }
	
	 public void clickCorporateBranding()
	 {
		 CorporateBranding .click();
	 }
	 public void clickConfiguration()
	 {
		 Configuration.click();
	 }	
	  public void clickusers()
	  {
		  users.click();
	  }
}
