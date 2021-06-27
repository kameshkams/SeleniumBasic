package SeleniumProject.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class letsCode {

	public static void main(String[] args) {

      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.get("https://courses.letskodeit.com/PRACTICE");
      
      driver.manage().window().maximize();
      
    WebElement carDropDown =  driver.findElement(By.id("carselect"));
    
    Select car = new Select(carDropDown);
    car.selectByValue("benz");
    
  
    
    
    
 
      

	}

}
