package runnerclass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="classpath:/features",monochrome=true,
glue={"stepDefinations"},
plugin = {"json:target/cucumber-repot.json;","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
dryRun=false)



public class TestRunner extends AbstractTestNGCucumberTests {
	
	
}

