import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.pl/");
		//Thread.sleep(3000);
		driver.findElement(By.id("W0wltc")).click();
		//driver.findElement(By.id("APjFqb")).sendKeys("Dupcioszek");
		WebElement textBox = driver.findElement(By.xpath("//textarea[@name='q']"));
		textBox.sendKeys("DUpa");
		Thread.sleep(3000);
		List<WebElement> listOfTextAreaElements = driver.findElements(By.xpath("//textarea"));
		int count = listOfTextAreaElements.size();
		System.out.println("Count of text areas is: "+count);
		driver.close();

	}

}
