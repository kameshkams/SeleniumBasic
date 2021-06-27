package SeleniumProject.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class buttons {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		
		//Find position of button (x,y)
		WebElement Position = driver.findElement(By.id("position"));
		Point xyposition = Position.getLocation();
	    int x =	xyposition.getX();
     	int y =	xyposition.getY();
        System.out.println("The value of " +x+ "The Value of " +y);
        
        //Find button color
        
        WebElement buttonColor = driver.findElement(By.id("color"));
        String color = buttonColor.getCssValue("background-color");
        System.out.println(color);
        
        //Find the height and width
        
        WebElement heightandwidth = driver.findElement(By.id("size"));
        int height = heightandwidth.getSize().getHeight();
        int width = heightandwidth.getSize().getWidth();
        System.out.println("Height "+height+ "Width "+width);
	}

}
