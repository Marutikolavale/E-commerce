package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM{


	public LoginPagePOM(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//locate Element 
	@FindBy(xpath ="//input[@name='username']") public WebElement  username;
	@FindBy(xpath ="//input[@name='password']") public WebElement passwored;
	@FindBy(xpath ="//button[@type='submit']") public WebElement loginbutton;
	@FindBy(linkText ="Forgot your password?")  public WebElement forgotpasswordElement;


	public void clickForgotyourpassword()
	{
		forgotpasswordElement.click();
	}

	public void Loginoperation(String Username,String Password)
	{
		username.sendKeys(Username);
		passwored.sendKeys(Password);
		loginbutton.click();
	}

	//invalid Condition
	public void actiTimeInvalidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
	{
		username.sendKeys(invalidUsername);
		passwored.sendKeys(invalidPassword);
		loginbutton.click();
		Thread.sleep(3000);
		username.clear();

	}



}
