package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
	    driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		
		WebElement user = driver.findElement(By.id("menu_admin_UserManagement"));
		
		WebElement viewusers = driver.findElement(By.id("menu_admin_viewSystemUsers"));
		
		Actions mouseHandling = new Actions(driver);
		
		Thread.sleep(2000);
	//	mouseHandling.moveToElement(admin).perform();
		
		mouseHandling.moveToElement(user).perform();
		
		Thread.sleep(2000);
		
		mouseHandling.moveToElement(viewusers).click().build().perform();
		
		
		
		
		
		
		
	}

}
