package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



import Base.BaseClass;

public class HomePage extends BaseClass{
	
	public HomePage (WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public HomePage verfiyHomepage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}
	
	public CreateLeadPage buttonClick() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		return new CreateLeadPage(driver);
	}

}
