package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM{


	public LoginPagePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//locate Element 
	@FindBy(xpath ="//input[@name='username']")public WebElement  username;
	@FindBy(xpath ="//input[@name='password']") public WebElement passwored;
	@FindBy(xpath ="//button[@type='submit']")public WebElement loginbutton;
	@FindBy(linkText ="Forgot your password?")  public WebElement forgotpasswordElement;


	public void clickForgotyourpassword()
	{
		forgotpasswordElement.click();
	}

	public void Loginoperation()
	{
		username.sendKeys("Admin");
		passwored.sendKeys("admin123");
		loginbutton.click();
	}





}
