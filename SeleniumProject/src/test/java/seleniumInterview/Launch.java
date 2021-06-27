package seleniumInterview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {

	public static void main(String[] args) {
		
		// 1. Launch Browser 
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		// 2. Open URL
		
		driver.get("https://login.salesforce.com/");
		
		//3. Capture title of the page
		
		System.out.println(driver.getTitle());
		
		// 4. Capture URL
		
		System.out.println(driver.getCurrentUrl());
		
		// 5. Capture pageSource
		
		System.out.println(driver.getPageSource());
		
	

	}

}
