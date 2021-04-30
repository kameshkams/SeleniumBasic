package SeleniumProject.SeleniumProject;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLogin {
	WebDriver driver;
	
	 @Test
	  public void Login() {
		 driver.findElement(By.id("txtUsername")).sendKeys("admin");
	     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	     driver.findElement(By.id("btnLogin")).click();
	  }
	 
	  public void Admin() {
		 driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		 driver.findElement(By.xpath("//*[@id='searchSystemUser_userName']")).sendKeys("Aravind");
			
		 Select userrole = new Select(driver.findElement(By.id("searchSystemUser_userType")));
			
	     userrole.selectByVisibleText("ESS");
	        
	     driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[3]/input[1]")).sendKeys("Dominic Chase");
	       
	     Select status = new Select(driver.findElement(By.name("searchSystemUser[status]")));
			
	     status.selectByIndex(1);

	     driver.findElement(By.xpath("//*[@id='searchBtn' or @name='_search']")).click();
		}
	  
	  @BeforeMethod
	  public void Launch() {
		  
		
		  WebDriverManager.chromedriver().setup();
			
			 driver = new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			driver.manage().window().maximize();
	  }

	  @AfterMethod
	  public void afterMethod() {
		  
		 driver.close();
		  
	  }

}
