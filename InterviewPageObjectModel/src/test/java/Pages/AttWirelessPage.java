package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AttWirelessPage {

	public static void signinbutton(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id='z1-profile-cta']")).click();

	}

}
