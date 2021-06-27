package SeleniumProject.SeleniumProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		
		//Click the button to display a confirm box.
		
		
		
		WebElement confirmBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		confirmBox.click();
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		
		
		//Click the button to display a prompt box.
		
		
        WebElement promtBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		promtBox.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("Kamesh");
		alert2.accept();
		
		//Click the button to learn line-breaks in an alert.
		
		WebElement getLine = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/button"));
		getLine.click();
		
		Alert alert3 = driver.switchTo().alert();
		String text = alert3.getText();
		System.out.println(text);
		alert3.accept();

	}

}
