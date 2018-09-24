package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Atthomepage {

	// Public static void means that the method can be called without creating an
	// object for that method.
	public static void Wirelessbutton(WebDriver driver) {
		driver.findElement(By.xpath("//div[@name='/wireless/_navmain']")).click();
	}

	{

	}

}
