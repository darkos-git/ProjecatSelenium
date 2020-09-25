package tests;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BasicTest {
	protected WebDriver driver;
	protected WebDriverWait waiter;
	protected String baseUrl;

	
	

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();

		this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		this.driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
	}

	@Test
	public void test() {
		driver.navigate().to(baseUrl);
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
