package SeleniumProject.SeleniumProject;

import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		// Select By Index	
	   WebElement dropDown = driver.findElement(By.id("dropdown1"));
	   Select select = new Select(dropDown);
	   select.selectByIndex(2);
	   
	   //Select using Text
	   WebElement dropDown2 = driver.findElement(By.name("dropdown2")); 
	   Select select1 = new Select(dropDown2);
	   select1.selectByVisibleText("UFT/QTP");
	   
	   //Select by Value
	   WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
	   Select select2 = new Select(dropdown3);
	   select2.selectByValue("4");
	   
	   // Get the number of dropdown options
	   
	   List<WebElement> listofoptions = select.getOptions();
	   int x = listofoptions.size();
	   System.out.println(x);
	   
	   //Send kyes to select
	   WebElement sendvalueText = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
	   sendvalueText.sendKeys("Appium"+Keys.ENTER);
	   
	   //MultiSelect
	   
	   WebElement multiSelect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
	   
	   Select select4 = new Select(multiSelect);
	   select4.selectByValue("1");
	   select4.selectByValue("2");
	   select4.selectByValue("3");

	}

}
