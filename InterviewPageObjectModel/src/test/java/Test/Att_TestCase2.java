package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Att_TestCase2 {

	public static WebDriver driver;

	@BeforeClass
	public static void Initialize() {
		System.setProperty("webdriver.drive.chrome",
				"/Users/Mansoor/eclipse-workspace/InterviewPageObjectModel/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void test() {
		// driver.get("www.");

	}

	@AfterClass
	public void close() {
		System.out.println(this.getClass().getSimpleName() + " tested");
		driver.manage().deleteAllCookies();
		driver.close();

	}

}
