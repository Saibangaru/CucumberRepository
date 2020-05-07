package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C:\\Users\\pdvna\\Desktop\\Shailaja\\Software\\Maven\\Feature\\Customer.feature",
		glue="StepDefinition",
		dryRun=false,
		monochrome=true,
		strict=true,
		plugin= {"pretty","html:test-output"},
		tags= {"@sanity"})


public class NopCommerceTestRunner {

}
