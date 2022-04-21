package stepDefinations;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.app.utilities.CommonUtilies;
import com.app.webdriver_manager.DriverManager;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class common_Step_browser_Scen {


	private static String scenarioName=null;

	public static String getScenarioName() {
		return scenarioName;
	}

	private static final Logger LOGGER =LogManager.getLogger(common_Step_browser_Scen.class);

	@Before
	public void beforeScenario(Scenario scenario) {

		LOGGER.info("Execution Started");

		try {
			scenarioName= scenario.getName();
			LOGGER.info("Instatiation the CommonUtils");

			LOGGER.info("Loading the Config files");
			CommonUtilies.getInstance().loadProperties();

			LOGGER.info("Checking the Driver is NULL or NOT");

			if(DriverManager.getDriver()==null) {
				DriverManager.launchBrowser();
				CommonUtilies.getInstance().initWebElements(); 

			}

		} catch (Exception e) 
		{
			e.printStackTrace();    
		}

	}
	
	@AfterStep
	public void attachScreenshot(Scenario scenario) throws Exception {

		if(scenario.isFailed()) {

			byte[] attScreenShot =((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(attScreenShot, "image/png", "error screen");
		}


	}



}



