package SeleniumProject.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBox {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");
		
      WebElement	editButton = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
      editButton.click(); // To click
      
      //Enter your email address
      WebElement emailBox = driver.findElement(By.id("email"));
      emailBox.sendKeys("Kameshthukaram@gmail.com"); // To send values
      
      
      //Append a text and press keyboard tab 
      WebElement appendBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
      appendBox.sendKeys("my text"); 
      
      //Get default text entered
      WebElement getDefaultValue = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
      String  value1 = getDefaultValue.getAttribute("value");
      System.out.println("The value inside the box is"+value1);
      
      
      //Clear the text
      WebElement clearText = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
      clearText.clear();
      
      //Confirm that edit field is disabled
      WebElement disabled = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
      boolean boolValue = disabled.isEnabled();
      System.out.println("The value is" +boolValue);
	}

}
