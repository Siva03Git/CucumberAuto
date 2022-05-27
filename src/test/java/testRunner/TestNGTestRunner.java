package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestNGTestRunner {
	
	@CucumberOptions
	(
			features ="src\\test\\java\\features",
			glue="stepDefinitions",
			dryRun=false,
			plugin= {"pretty","html:target/cucumber.html"}
			)
	
	public class TestRunner extends AbstractTestNGCucumberTests 
	{
		
	}

}
