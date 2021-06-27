package seleniumInterview;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		jqueryDrop(driver, "args");
		jqueryDrop(driver, "args","");
		jqueryDrop(driver, "all");
		
	}
	
	
	public static void jqueryDrop(WebDriver driver, String... value) {
	
		//driver.findElement(By.id("justAnInputBox")).click();
		
	List<WebElement> choiceWebElement = driver.findElements(By.xpath("//sp]an[@class='comboTreeItemTitle'"));
	
	if(!value[0].equalsIgnoreCase("all")) {
		
		for(WebElement item:choiceWebElement) {
			
		String text =item.getText();
		
		}
		
		for(String val:value) {
			
			Object text;
			if(text.equals(val)) {
				

		item.click();
				break;
				 
			 }
			 
	     
		}
	}
		
	}

}
