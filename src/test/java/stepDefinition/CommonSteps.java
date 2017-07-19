package stepDefinition;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonSteps extends AbstractPageStepDefinition{
	
    WebDriver driver =  getDriver();
	
	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
	}

}
