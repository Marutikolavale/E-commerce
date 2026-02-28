package DSA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Redio_button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));
		try {

			driver.get("https://demoqa.com/buttons");
			WebElement Button = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
			Actions action= new Actions(driver);
			action.doubleClick(Button).perform();
		} finally {
			driver.quit();
		}
	}

}
