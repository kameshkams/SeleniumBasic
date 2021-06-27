package basic;

import java.net.URI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	private static String url;

	public static void main(String[] args) {

   WebDriverManager.chromedriver().setup();
   
   WebDriver driver = new ChromeDriver();
   
   driver.manage().window().maximize();
   
   driver.get("https://opensource-demo.orangehrmlive.com/");
   
 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
   driver.findElement(By.id("txtPassword")).sendKeys("123456");
   driver.findElement(By.id("btnLogin")).click();
  
String actualText = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();

System.out.println(actualText);

String expectedText = "Invalid credentials";
 Assert.assertEquals(actualText, expectedText);

   
		

	}

}
