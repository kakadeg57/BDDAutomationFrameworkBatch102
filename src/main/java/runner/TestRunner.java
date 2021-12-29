package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		glue = "stepdefinations",   // stepdefination file path
		
		features = "C:\\Users\\Admin\\eclipse-workspace\\BDDAutomation-Framework-Batch102\\src\\test\\java\\features\\LoginPage.feature"
								    // features file path
		)


public class TestRunner {

}
