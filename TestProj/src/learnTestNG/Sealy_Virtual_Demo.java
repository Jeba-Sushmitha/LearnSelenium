package learnTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sealy_Virtual_Demo {
	public void AutomateSealy(){
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	driver.get("https://stgnational.findyourbed.com/product/8pMhiB19RWw8U7wEbxu7kJj7MZ6sjSchCasFopZ7gP4xU6t5kyjlimOv8j6Dpy0mslashfnRyd92ONB5slashD9slashpOwsiQequalequal");
	String collectionName=driver.findElement(By.cssSelector(".pdp-collection-name")).getText();
	String ModelName=driver.findElement(By.cssSelector(".pdp-ML-name")).getText();
	String constant=driver.findElement(By.cssSelector(".pdp-const-name")).getText();
	List<WebElement> productOverview= driver.findElements(By.xpath("//h1"));
	
	}
}
