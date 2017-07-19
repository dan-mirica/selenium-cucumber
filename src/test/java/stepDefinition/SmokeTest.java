package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SmokeTest extends AbstractPageStepDefinition {

    WebDriver driver;

    @Before
    public void before() {
        driver = getDriver();
    }

    @After
    public void after() {
        closeDriver();
    }

    @Given("^Open firefox and start application$")
    public void Open_firefox_and_start_application() throws Throwable {
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");
    }

    @When("^^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
    public void I_enter_valid_username_and_valid_password(String username, String pass) throws Throwable {
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(pass);
    }

    @Then("^application should close$")
    public void application_should_close() throws Throwable {
    }

}
