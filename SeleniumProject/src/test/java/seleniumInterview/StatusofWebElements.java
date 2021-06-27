package seleniumInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusofWebElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		//isDisplayed() & isEnabled()
		
	WebElement textBox= driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
	System.out.println(textBox.isDisplayed()); // True
	System.out.println(textBox.isEnabled()); // True
	
	// isSelected();
	
	WebElement male=driver.findElement(By.xpath("//*[@id=\"gender\"]/span[1]/label"));
	WebElement female=driver.findElement(By.xpath("//*[@id=\"gender\"]/span[2]/label"));
	
	System.out.println(male.isSelected()); // False
	System.out.println(female.isSelected()); // False
	
	Thread.sleep(2000);
	
	male.click();
	

	System.out.println(male.isSelected()); // True
	System.out.println(female.isSelected()); // False

	}

}
