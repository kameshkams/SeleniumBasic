package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.xpath("//*[@id='searchSystemUser_userName']")).sendKeys("Kameshwaran");
		
		Select userrole = new Select(driver.findElement(By.id("searchSystemUser_userType")));
		
        userrole.selectByVisibleText("Admin");
        
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[3]/input[1]")).sendKeys("Kamesh");
        
Select status = new Select(driver.findElement(By.name("searchSystemUser[status]")));
		
       // status.selectByValue("0");

status.selectByIndex(1);

driver.findElement(By.xpath("//*[@id='searchBtn' or @name='_search']")).click();
	}
	
	

}
