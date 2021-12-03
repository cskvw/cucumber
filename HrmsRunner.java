package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (features = "src/test/java/Features/hrms.feature", glue="Step", monochrome = true)

public class HrmsRunner extends AbstractTestNGCucumberTests{


}



