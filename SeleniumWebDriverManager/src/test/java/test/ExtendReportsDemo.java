package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportsDemo {
	
	private static WebDriver driver = null;

	public static void main (String[] args) {
				
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extend.html");
		//create ExtentReports and attach report(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test1 = extent.createTest("Google Search test 1", 
				"this is a test to validate google search functionality");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting TC");
		driver.get("https://google.com");
		test1.pass("Navigated to google.com");
		driver.findElement(By.id("W0wltc")).click();
		test1.pass("Getting rid of popup window");
		driver.findElement(By.name("q")).sendKeys("Automation");
		test1.pass("Entered text in searchbox");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("Button clicked");
		driver.close();
		driver.quit();
		test1.pass("Browser closed");
		test1.info("Test completed");
		//calling flush writes everything to the log file
		extent.flush();
	}

}
