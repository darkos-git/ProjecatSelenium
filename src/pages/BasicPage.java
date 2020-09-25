package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicPage {
protected WebDriver driver;
protected WebDriverWait waiter;
public BasicPage(WebDriver driver, WebDriverWait waiter) {
	super();
	this.driver = driver;
	this.waiter = waiter;
}
}
