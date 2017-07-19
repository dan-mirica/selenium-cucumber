package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractPageStepDefinition {

	protected static WebDriver driver;

	protected WebDriver getDriver() {

		if (driver == null) {
			System.out.println("******************* driver is null, will make an instance...");
			driver = new FirefoxDriver();
		} else {
			System.out.println("************************** driver is instantiated...");
		}
		return driver;

	}

	protected WebDriver closeDriver() {
		if (driver != null) { // instanciated driver for the first time
			driver.quit();
		}
		return driver = null;
	}
}
