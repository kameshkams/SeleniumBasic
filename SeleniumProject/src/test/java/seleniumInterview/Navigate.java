package seleniumInterview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
	
		
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.snapdeal.com/");
	
	Thread.sleep(1000);
	
	driver.navigate().to("https://www.amazon.in/"); // 1. will navigate to particular url and does not wait till the page load.
	                                                    
	
	// driver.get("https://www.amazon.in/"); wait till page load
	
	Thread.sleep(1000);
	
	driver.navigate().back(); // 2. Navigate().back
	
	Thread.sleep(1000);
	
	driver.navigate().forward(); // 3. Navigate Forward
	
	Thread.sleep(1000);
	
	driver.navigate().refresh(); // 4. refresh current page
	
	

	}

}
