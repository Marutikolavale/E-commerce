package Utilities;

import java.nio.channels.SelectableChannel;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UIActions {
	private final Logger log = LogManager.getLogger(UIActions.class);

	public void waitUntilElementLoad(WebElement element) {
		WebDriverWait wait = new WebDriverWait(GlobalIdentifiers.getDriver(), Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitUntilElementLoad(WebElement element, int timeInSecond) {
		WebDriverWait wait = new WebDriverWait(GlobalIdentifiers.getDriver(), Duration.ofSeconds(timeInSecond));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void click(WebElement element, String elementName) {
		try {
			waitUntilElementLoad(element);
			element.click();
			log.info("Clicked on the element:" + elementName);
			Report.test.info("Clicked on the element:" + elementName);
			Report.getScreenShot();
		} catch (Exception e) {
			log.info("Not clicked on the element:" + elementName);
			Report.getScreenShot();
			Report.test.info("Not clicked on the element:" + elementName);
			throw new Error("Not clicked on the element:" + elementName + "\n" + e.getMessage());
		}
	}

	public void click(WebElement element) {
		try {
			waitUntilElementLoad(element);
			element.click();
			log.info("Clicked on the element");
			Report.test.info("Clicked on the element");
			Report.getScreenShot();
		} catch (Exception e) {
			log.info("Not clicked on the element");
			Report.test.info("Not clicked on the element");
			Report.getScreenShot();
			e.printStackTrace();
		}
	}

	public boolean isDisplayed(WebElement element, String elementName) {
		try {
			element.isDisplayed();
			log.info("Element is displayed: " + elementName);
			Report.test.info("Element is displayed: " + elementName);
			Report.getScreenShot();
			return true;
		} catch (Exception e) {
			log.info("Element is not displayed: " + elementName);
			Report.test.info("Element is not displayed: " + elementName);
			Report.getScreenShot();
			return false;
		}
	}

	public void sendKeys(WebElement element, String value, String elementName) {
		try {
			waitUntilElementLoad(element);
			element.sendKeys(value);
			log.info("Value Entered: " + value + " in element: " + elementName);
			//Report.log("Value Entered: " + value + " in element: " + elementName);
			Report.log("Value Entered: " + value + " in element: " + elementName, Report.SCREENSHOT_FILE_PATH);
			Report.getScreenShot();
		} catch (Exception e) {
			Report.getScreenShot();
			log.error("Value Not Entered " + value + " in element: " + elementName);
			Report.test.warning("Value Not Entered " + value + " in element: " + elementName);
			throw new Error("Value Not Entered: " + value + " in " + elementName + "\n" + e.getMessage());
		}
	}

	public void selectByVisibleText(WebElement element, String value, String elementName) {
		try {
			waitUntilElementLoad(element);
			Select select = new Select(element);
			select.selectByVisibleText(value);
			log.info(value + " selected in dropdown: " + elementName);
			Report.test.info(value + " selected in dropdown: " + elementName);
			Report.getScreenShot();
		} catch (Exception e) {
			Report.getScreenShot();
			log.info(value + " not selected in dropdown: " + elementName);
			Report.test.info(value + " not selected in dropdown: " + elementName);
			throw new Error(value + " not selected in dropdown: " + elementName + "\n" + e.getMessage());
		}
	}

	public void selectByValue(WebElement element, String value, String elementName) {
		try {
			waitUntilElementLoad(element);
			Select select = new Select(element);
			select.selectByValue(value);
			log.info(value + " selected in dropdown: " + elementName);
			Report.test.info(value + " selected in dropdown: " + elementName);
			Report.getScreenShot();
		} catch (Exception e) {
			Report.getScreenShot();
			Report.test.info(value + " not selected in dropdown: " + elementName);
			log.info(value + " not selected in dropdown: " + elementName);
			throw new Error(value + " not selected in dropdown: " + elementName + "\n" + e.getMessage());
		}
	}

	public void selectValueFromDropdown(List<WebElement> dropdownElements, String value, String elementName) {
		try {
			waitUntilElementLoad(dropdownElements.get(0));
			for (WebElement element : dropdownElements) {
				if (element.getText().trim().equals(value)) {
					element.click();
					log.info(value + " selected in dropdown: " + elementName);
					Report.test.info(value + " selected in dropdown: " + elementName);
					Report.getScreenShot();
					return;
				}
			}
			Report.test.info(value + " not selected in dropdown: " + elementName);
			log.info(value + " not selected in dropdown: " + elementName);
			throw new Error(value + " not selected in dropdown: " + elementName + "\n");

		} catch (Exception e) {
			Report.getScreenShot();
			log.info(value + " not selected in dropdown: " + elementName);
			Report.test.info(value + " not selected in dropdown: " + elementName);
			throw new Error(value + " not selected in dropdown: " + elementName + "\n" + e.getMessage());
		}

	}

	public void clickByJs(WebElement element, String elementName) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) GlobalIdentifiers.getDriver();
			js.executeScript("arguments[0].click();", element);
			log.info("Clicked on the element:" + elementName);
			Report.test.info("Clicked on the element:" + elementName);
			Report.getScreenShot();
		} catch (Exception e) {
			Report.getScreenShot();
			log.info("Not clicked on the element:" + elementName);
			Report.test.info("Not clicked on the element:" + elementName);
			throw new Error("Not clicked on the element:" + elementName + "\n" + e.getMessage());
		}
	}

	public void openNewTab() {
		GlobalIdentifiers.getDriver().switchTo().newWindow(WindowType.TAB);
	}

	public void openNewTabWithJs() {
		JavascriptExecutor js = (JavascriptExecutor) GlobalIdentifiers.getDriver();
		js.executeScript("window.open()");
	}

	public void openNewTabWithJs(String url) {
		JavascriptExecutor js = (JavascriptExecutor) GlobalIdentifiers.getDriver();
		js.executeScript("window.open(" + url + ")");
	}

	public void switchToWindow(int windowNumber) {
		try {
			Set<String> windows = GlobalIdentifiers.getDriver().getWindowHandles();
			log.info("Total Windows:" + windows.size());
			List<String> windowList = new ArrayList<>(windows);
			if (!((windowList.size() - 1) >= windowNumber)) {
				throw new Error(windowNumber + " : window not found for switch");
			}
			GlobalIdentifiers.getDriver().switchTo().window(windowList.get(windowNumber));
		} catch (Exception e) {
			log.info("Not switched on window " + windowNumber + "\n" + e.getMessage());
		}
	}

}
