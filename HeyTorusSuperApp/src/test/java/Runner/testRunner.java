package Runner;
 
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Feature", 
//		features="src/test/resources/Feature/Alogin.feature",
		glue="stepDefinition",
		dryRun=false,
		monochrome=true,
//		tags = "@StocksOnboarding",
		tags= "@Login or @Career",
//		tags= "@Login1",
		plugin ={"pretty", "html:target/htmlReport.html", }
		
//		plugin={"com.avenstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;"},
//		publish = true

)
public class testRunner {

}
