package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HrmsStep {

	
   public ChromeDriver driver;
	
	
	@Given("Open the Chrome Browser")
	public void open_the_chrome_browser() {
		
		WebDriverManager.chromedriver().setup();

		 driver = new ChromeDriver();

		driver.manage().window().maximize();
	    
	}
	@Given("Load the application url {string}")
	public void load_the_application_url(String url) {
		
		driver.get(url);
	    
	}
	@Given("Enter username as {string}")
	public void enter_username_as(String username ) {
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
	   
	}
	@Given("Enter password as {string}")
	public void enter_password_as(String password) {
		
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	    
	}
	@When("Click on login button")
	public void click_on_login_button() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}
	@Then("Homepage should be displayed")
	public void homepage_should_be_displayed() {
	    
		
String title = driver.getTitle(); 
		
		if(title.equals ("dashboard"))
				{

				System.out.println("homepage is title displayed is correct");

				}
		else {

				System.out.println("homepage is title is wrong");

				}
		}
		
	@But("error message should be displayed") 
	
	 public void error_message_should_be_displayed() {
		
		System.out.println("error message should be displayed");
		
	}

}
