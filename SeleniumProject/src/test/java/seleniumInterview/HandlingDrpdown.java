package seleniumInterview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDrpdown {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.opencart.com/index.php?route=account/register");
		 
	WebElement	dropDownValue = driver.findElement(By.id("input-country"));
	
	Select dropDown = new Select(dropDownValue);
	
/*	dropDown.selectByVisibleText("Denmark");
	
	dropDown.selectByValue("10");
	
	dropDown.selectByIndex(13); */
	
List<WebElement> options =dropDown.getOptions(); // Selecting all 3 methods using getOptions

for(WebElement value:options) {
	
	if(value.getText().equals("Cuba")) {
		
		value.click();
		break;
	}
}
	
	
	}

}
