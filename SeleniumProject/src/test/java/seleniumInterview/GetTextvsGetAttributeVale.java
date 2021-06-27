package seleniumInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextvsGetAttributeVale {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		
	    WebElement	emailTextBox= driver.findElement(By.xpath("//input[@id='Email']"));
	
	    System.out.println(emailTextBox.getAttribute("value")); // capture Text from Input Box 
	  //System.out.println(emailTextBox.getText("value")); will return inner text value
	
	
	    Thread.sleep(2000);
		
		emailTextBox.clear(); //  Clear text from Input Box
		
		emailTextBox.sendKeys("admin@yourstore.com"); // Provide input
		
		driver.findElement(By.id("Password")).sendKeys("admin");
		
	    WebElement	loginButton = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
	    System.out.println(loginButton.getText());
	 	loginButton.click();
		
		
		
	}

}
