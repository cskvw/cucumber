package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class LoginPage extends BaseClass{

	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	

	public LoginPage enterUsername(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);
		return this; 
	}


	public LoginPage enterPassword(String userPass) {
		driver.findElement(By.id("password")).sendKeys(userPass);
		return this;
	}


	public HomePage clickSubmit() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		return new HomePage(driver);

	}


	
}
