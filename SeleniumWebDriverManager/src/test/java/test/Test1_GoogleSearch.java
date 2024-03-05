package test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we are calling the function here in main method:
		googleSearch();

	}
	public static void googleSearch() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//go to google.com
		driver.get("https://www.google.pl/");
		driver.findElement(By.id("W0wltc")).click();
		driver.findElement(By.name("q")).sendKeys("nara");
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		//below code line is instead of .click() cause that one wasn't working
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		//close browser
		driver.close();
		System.out.println("Test completed");
		
	}
}
