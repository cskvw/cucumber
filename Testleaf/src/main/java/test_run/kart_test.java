package test_run;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class kart_test {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		//String [] itemsbecarted = {"Blue Shoes","Denim Blue Jeans","Blue Tshirt"};


		//Strix@cskvw05 auth-send-code auth-signin-button
		
		String username = "admin";
		
		//Set the password
		String password = "admin";
		
		driver.manage().window().maximize();
		String URL = "https://" +username +":" +password +"@"+ "the-internet.herokuapp.com/basic_auth";
		driver.get(URL);
		
		
		//driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("oneplus 9 rt",Keys.ENTER);;
		
		
		//driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']")).click();
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("cskvigneshwaran@gmail.com",Keys.ENTER);
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Strix@cskvw05",Keys.ENTER);
		//driver.findElement(By.xpath("//a[@id='auth-get-new-otp-link']")).click();
		//driver.findElement(By.xpath("//input[@name='otpDeviceContext']")).click();
		//driver.findElement(By.xpath("//input[@id='auth-send-code']")).click();
		
		
		//driver.findElement(By.xpath("//input[@id='auth-signin-button']")).click();
		
		

		//driver.findElement(By.linkText("Fresh")).click();
		

		//driver.findElement(By.xpath("//span[text()='Redmi Note 11 (Starburst White, 4GB RAM, 64GB Storage) | 90Hz FHD+ AMOLED Display | Qualcomm® Snapdragon™ 680-6nm | Alexa Built-in']")).click();




		//ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());

		//driver.switchTo().window(newTab.get(1));
		//System.out.println("Page title of new tab: " + driver.getTitle());
		

		//driver.findElement(By.xpath("//input[@class='a-button-input attach-dss-atc']")).click();

		//driver.switchTo().window(newTab.get(0));

		//driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).clear();
		
		
		

		/*
		 * List <WebElement> product = driver.findElements(By.xpath(
		 * "(//h2[@class='woocommerce-loop-product__title'])"));
		 * 
		 * for(int i=0; i<product.size();i++)
		 * 
		 * {
		 * 
		 * List itemsbecartedList = Arrays.asList(itemsbecarted);
		 * 
		 * String name=product.get(i).getText(); //String formattedName=name[0].trim();
		 * System.out.println(name);
		 * 
		 * if(itemsbecartedList.contains(name)) {
		 * 
		 * driver.findElement(By.
		 * xpath("//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart']"
		 * )).click(); }
		 * 
		 * }
		 */

		//driver.close();

		//driver.quit();
	}



}
