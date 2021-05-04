package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		
		Actions keyboardHandling = new Actions(driver);
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		
	
        keyboardHandling.sendKeys(Keys.TAB).perform();
        
        Thread.sleep(2000);
		
        keyboardHandling.sendKeys("admin123").perform();
        
        Thread.sleep(2000);
        
        keyboardHandling.sendKeys(Keys.ENTER).perform();
        
      
        

	}

}
