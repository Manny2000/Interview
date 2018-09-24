package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Attlogin {

	public static void Username(WebDriver driver, String username) {
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(username);
	}

	public static void password(WebDriver driver, String password) {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
	}

	public static WebElement loginbutton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='loginButton-lgwgLoginButton']"));
	}

	public static WebElement SavepasswordCheckBox(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='save-user-id']"));

	}
}
