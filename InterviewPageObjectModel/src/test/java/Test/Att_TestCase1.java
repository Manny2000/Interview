package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.AttWirelessPage;
import Pages.Attlogin;
import org.openqa.selenium.support.ui.Select;

public class Att_TestCase1 {

	public static WebDriver driver;

	@BeforeClass
	public static void Initialize() {
		System.setProperty("webdriver.drive.chrome",
				"/Users/Mansoor/eclipse-workspace/InterviewPageObjectModel/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws InterruptedException {
		System.out.println("Testing has started");
		driver.get("https://www.att.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Current page URL is : " + driver.getTitle());
		List<WebElement> a = driver.findElements(By.tagName("a"));
		int b = a.size();
		System.out.println("This page has " + b + " links");

		AttWirelessPage.signinbutton(driver);
		Pages.Attlogin.Username(driver, "Jehanzaib");
		Pages.Attlogin.password(driver, "123456");
		Pages.Attlogin.loginbutton(driver);
		WebElement ab = Pages.Attlogin.SavepasswordCheckBox(driver);
		if (ab.isSelected()) {
			System.out.println("Save password checkbox is selected by default");
		} else {
			System.out.println("Save passowrd checkbox is not selected by default");
		}
		Pages.Attlogin.loginbutton(driver).click();
		Thread.sleep(5000);
		try {
			WebElement ba = driver.findElement(By.xpath("//*[@class='alertvalign-children-middle']/div[2]"));
			String c = ba.getText();
		} catch (Exception e) {
			System.out.println("WebElement not found");
		}
	}

	@AfterClass
	public void close() {
		System.out.println(this.getClass().getName() + " Tested");
		driver.manage().deleteAllCookies();
		driver.close();
	}
}
