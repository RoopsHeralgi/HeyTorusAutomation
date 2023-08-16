package Runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

			features = {"src/test/resources/Feature"},
			glue = "stepDefinition",
			tags="@Login or @Career",
			plugin = {"pretty",

// "html:target/cucumber-reports/cucumber-pretty",

// "json:target/cucumber-reports/CucumberTestReport.json",

// "rerun:target/cucumber-reports/rerun.txt"

})

public class TestRunnerTestng extends AbstractTestNGCucumberTests 
{

}
