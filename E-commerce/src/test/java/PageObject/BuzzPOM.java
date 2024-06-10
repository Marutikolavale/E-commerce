package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuzzPOM {

	public BuzzPOM(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//
	@FindBy(xpath ="//button[@type='submit']") public WebElement postButton;
	@FindBy(xpath ="//button[text()=' Share Photos']") public  WebElement sharePhoto;
	@FindBy(xpath = "") public WebElement a ;
	@FindBy(xpath = "//button[text()=' Share Video']") public WebElement shareVideoBtn;
	@FindBy(xpath = "//button[text()=' Most Recent Posts ']") public WebElement mostRecentPostBtn;
	@FindBy(xpath = "//button[text()=' Most Liked Posts ']") public WebElement mostLikedPostBtn;
	@FindBy(xpath = "//button[text()=' Most Commented Posts ']") public WebElement mostCommentedBtn;

	@FindBy(xpath ="//i[@class='oxd-icon bi-x oxd-sidepanel-header-close']") public WebElement ActionBTN;
}
