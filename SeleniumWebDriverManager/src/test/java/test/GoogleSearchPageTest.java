package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;
	public static void main(String[] args) {
		//calling the function from main method
		googleSearchTest();
	}
	//function
	public static void googleSearchTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		//create an object of our page class
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		
		driver.get("https://google.com");
		searchPageObj.clickOnPopUpWindow();
		searchPageObj.setTextInSearchBox("A B C D");
		searchPageObj.clickSearchButton();
		driver.close();
		
	}
	
}
