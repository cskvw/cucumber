package com.app.utilities;


import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.app.constants.Constants;
import com.app.page_objects.Login_page;
import com.app.webdriver_manager.DriverManager;



public class CommonUtilies {

	private static CommonUtilies commonUtiliesInstances=null;

	private CommonUtilies() {

	}

	public static CommonUtilies getInstance() {   

		if (commonUtiliesInstances==null) {   
			commonUtiliesInstances = new CommonUtilies();
		}	   	   
		return commonUtiliesInstances;

	}

	public  void loadProperties() {

		Properties properties = new Properties();

		try {
			
			properties.load(getClass().getResourceAsStream("/config.properties"));

		} catch (Exception e)
		{
			e.printStackTrace();
		}

		Constants.APP_URL=properties.getProperty("APP_URL");
		Constants.BROWSER=properties.getProperty("BROWSER");
		Constants.UserName= properties.getProperty("UserName");
		Constants.Password=properties.getProperty("Password");
		//Constants.CHROME_DRIVER_LOCATION=properties.getProperty("CHROME_DRIVER_LOCATION");
		//Constants.EDGE_DRIVER_LOCATION=properties.getProperty("EDGE_DRIVER_LOCATION");

	}

	public void initWebElements() {

		PageFactory.initElements(DriverManager.getDriver(), Login_page.getInstance());

	}

	public void takeScreenshot() {

		File screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(screenshot, new File("screen.png"));

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public void highlightElement(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();

		js.executeScript("arguments[0].setAttribute('style', 'background: red ; border: 2px solid blue;');", element);
	} 

}
