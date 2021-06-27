package seleniumInterview;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleDD {
	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://orangehrm.com/orangehrm-30-day-trial/");
	   
	  WebElement noofEmployees = driver.findElement(By.name("NoOfEmployees"));
	   multipleDropdown(noofEmployees, "21 - 25");
	   
	   WebElement industry = driver.findElement(By.name("Industry"));
	   multipleDropdown(industry, "Agriculture / Forestry");
	   
	   WebElement country = driver.findElement(By.name("Country"));
	   multipleDropdown(country, "Australia");
	   
	}  
	
public static void multipleDropdown (WebElement ele, String value)
	
	{
		Select element = new Select(ele);
		
	List<WebElement> element1 = element.getOptions();
		
		for(WebElement dropdown:element1) {
			
			if(dropdown.getText().equals(value)) {
				dropdown.click();
				break;
			}
		}
		
	}
	

}
