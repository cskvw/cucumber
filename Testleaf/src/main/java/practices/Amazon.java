package practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Amazon {

	
	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.amazon.in/");
		 
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("oneplus 9 pro",Keys.ENTER);
		 String data =driver.findElement(By.xpath("(//span[@class='a-price-whole'])[3]")).getText();
		 System.out.println(data);
		
		 String data1 =driver.findElement(By.xpath("//span[text()='7,919']")).getText();
		 System.out.println(data1);
		 
		 WebElement rating = driver.findElement(By.xpath("(//a[@class='a-popover-trigger a-declarative'])[2]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(rating).perform();
		rating.click();
		
		
		
		 
		 
		 
		 
		
		 
		
	}
	
	
}
