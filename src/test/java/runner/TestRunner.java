package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"features"},
		glue={"stepDefinition"},
		plugin={"html:target/cucumber-html-report", "json:target/report.json"},
		tags= {"@tag1"}
		// tags= {"@tag1, @tag2"} // tags= {"@tag1", "@tag2"}
		)
public class TestRunner {

}
