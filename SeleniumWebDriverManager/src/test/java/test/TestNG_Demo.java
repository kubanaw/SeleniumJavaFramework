package test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {
	
	WebDriver driver = null; 
	
	@BeforeTest
	public void setUpTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void googleSearch() {
		driver.get("https://www.google.pl/");
		driver.findElement(By.id("W0wltc")).click();
		driver.findElement(By.name("q")).sendKeys("nara");
		//driver.findElement(By.name("btnK")).click();
		//below code line is instead of .click() cause that one wasn't working
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}
	
	@AfterTest
	public void tearDownTest() {
		//close browser
				driver.close();
				driver.quit();
				System.out.println("Test completed");
	}
}
