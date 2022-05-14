package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class CreateLeadPage extends BaseClass{
	
public CreateLeadPage (WebDriver driver) {
		
	this.driver = driver;
	
	}

    
	public CreateLeadPage clickLd() {
		driver.findElement(By.linkText("Leads")).click();
		
		return this;
	}

	public CreateLeadPage createLeadClick() {
		driver.findElement(By.linkText("Create Lead")).click();
		return this;
	}
	public CreateLeadPage leadFormCompany(String Company) {

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Company);
		return this;
	}

	public CreateLeadPage leadFormFirstName(String firstName) {

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		return this;
	}

	public CreateLeadPage leadFormLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;
	}

	public CreateLeadPage leadFormphNumber() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("123456789");
		return this;
	}
	
	public MyLeadsPage leadFormButton() {
		driver.findElement(By.name("submitButton")).click();

		return new MyLeadsPage();
	}

	



}
