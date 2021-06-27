package seleniumInterview;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementvsFindElements {

	public static void main(String[] args) {


		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		/*
		WebElement textBox= driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		textBox.sendKeys("Kamesh");
		
	WebElement first =	driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
	
	System.out.println(first.getText());	*/
		

		List<WebElement>links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(links.size());
		for(WebElement elements:links)
		{
			System.out.println(elements.getText());
		}
		
		
		

	}

}
