package in.airlines.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "features"
		,glue ="in.airlines.testscripts"
		,tags = "@check"		
		)

public class TestRunner extends AbstractTestNGCucumberTests {


}
