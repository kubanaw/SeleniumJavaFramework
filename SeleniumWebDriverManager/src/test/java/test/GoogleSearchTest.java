package test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.GoogleSearchPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {
	
	private static ChromeDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we are calling the function here in main method:
		googleSearch();

	}
	public static void googleSearch() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//go to google.com
		driver.get("https://www.google.pl/");
		driver.findElement(By.id("W0wltc")).click();
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation");		
		//click on search button
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		//close browser
		driver.close();
		System.out.println("Test completed");
		
	}
}
