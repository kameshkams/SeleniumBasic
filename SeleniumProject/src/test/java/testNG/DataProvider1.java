package testNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider1 {
	
	WebDriver driver;
	
	@Test(dataProvider="OrangeHRM")
	
	public void OrangeHRMLogin(String username, String password)  throws Exception
	
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys(username);
	     driver.findElement(By.id("txtPassword")).sendKeys(password);
	     driver.findElement(By.id("btnLogin")).click();
	}
	
	@AfterMethod
	public void CloseApp() {
		driver.close();
	}

	@DataProvider(name="OrangeHRM")
	
	public Object[][] data()
	{
		
		Object[][] data = new Object[5][2];
		
		data[0][0] = "Kamesh";
		data[0][1] = "123455";
	
		data[1][0] = "Kamesh1";
		data[1][1] = "123456";
		
		data[2][0] = "Kamesh2";
		data[2][1]	= "123457";	
		
		data[3][0] = "Kamesh3";
		data[3][1]	= "123458";
		
		data[4][0] = "Kamesh4";
		data[4][1]	= "123459";
		
		return data;
		
		
	}
}
