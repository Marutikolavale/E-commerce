package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM{
	//public static Logger log=log=LogManager.getLogger("E-commers");

	public LoginPagePOM(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//locate Element 
	@FindBy(xpath ="//input[@name='username']") public WebElement  username;
	@FindBy(xpath ="//input[@name='password']") public WebElement passwored;
	@FindBy(xpath ="//button[@type='submit']") public WebElement loginbutton;
	@FindBy(linkText ="Forgot your password?")  public WebElement forgotpasswordElement;
	@FindBy(xpath ="//*[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	public WebElement  dashboard;

	@FindBy(xpath="//img[@alt='client brand banner']") public WebElement logo;
	public void clickForgotyourpassword()
	{
		forgotpasswordElement.click();
	}

	public void Loginoperation(String Username,String Password) throws InterruptedException
	{
		username.sendKeys(Username);
		passwored.sendKeys(Password);
		Thread.sleep(2000);
		loginbutton.click();
		//log.info("user login sucessfull");
	}

	//invalid Condition
	public void actiTimeInvalidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
	{
		username.sendKeys(invalidUsername);
		passwored.sendKeys(invalidPassword);
		loginbutton.click();
	}



}
