package runner;

import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features={"src//test//java//features"}
					,glue={"stepdefinations","utility"}
					,plugin = {"pretty", "json:target/cucumber.json","html:target/cucumber"}
					, tags ={"@appium,@weba"}
		,strict = true
		)
@Test
public class RunTest extends AbstractTestNGCucumberTests{

}
