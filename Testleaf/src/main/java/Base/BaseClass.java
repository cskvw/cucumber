package Base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Utilies.ReadExcel;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	//public  ChromeDriver driver;
	
	
	protected WebDriver driver;
	
	
	public String excelFileName; 
	 
	@DataProvider//(indices = 0)
	public String[][] provideData() throws IOException 
	{
	
		return ReadExcel.readData(excelFileName);
	
	}

	
	@BeforeMethod
	@Parameters("browser")
	public void preCondition(String browser) throws Exception {

		if(browser.equalsIgnoreCase("chrome")) {
		  WebDriverManager.chromedriver().setup(); 
		  driver = new ChromeDriver(); 
		  }
		  
		  else if(browser.equalsIgnoreCase("edge")) {
		  WebDriverManager.edgedriver().setup(); 
		  driver = new EdgeDriver(); 
		  }
		  
		
		  else{
		  
		  throw new Exception("Browser is not correct"); 
		  
		  }
		
		
		//WebDriverManager.chromedriver().setup(); 
		//driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}

}
