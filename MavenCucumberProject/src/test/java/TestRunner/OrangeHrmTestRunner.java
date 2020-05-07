package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\pdvna\\Desktop\\Shailaja\\Software\\Maven\\Feature\\orangeHRM.feature",
		glue="StepDefinition")   //Package name
		


public class OrangeHrmTestRunner {

}
