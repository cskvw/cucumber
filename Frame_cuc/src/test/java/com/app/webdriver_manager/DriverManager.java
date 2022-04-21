package com.app.webdriver_manager;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.app.constants.Constants;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {


	private static final Logger LOGGER = LogManager.getLogger(DriverManager.class);


	private static WebDriver driver = null;


	@Before
	public static void launchBrowser() {

		try {
			switch(Constants.BROWSER) {

			case"chrome":	
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Lauching"+ Constants.BROWSER);
				driver =new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().window().maximize();
				break;

			case "edge":
				WebDriverManager.edgedriver().setup();
				LOGGER.info("Lauching"+ Constants.BROWSER);
				driver = new EdgeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().window().maximize();
				break;

			default:
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Lauching"+ Constants.BROWSER);
				driver =new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().window().maximize();
				break;	
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static WebDriver getDriver() {
		return driver;
	}

	@After
	public static void closeBrowser() {	

		driver.close();

	}



}
