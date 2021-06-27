package seleniumInterview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropDown {

	public static void main(String[] args) {

			// If select tag not available go with custome xpath
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.hdfcbank.com/");
	
	driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
	
   List<WebElement> productType = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));

		commonDropDown(productType, "EMI");
		
		driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
		
		   List<WebElement> productType1 = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
        commonDropDown(productType1, "Lifecare");
	}
	
	
	public static void commonDropDown(List<WebElement> drp1, String value) {
		
		for(WebElement dropDown:drp1) {
			
			if(dropDown.getText().equals(value))
			{
				dropDown.click();
				break;
			}
		}
	}

}
