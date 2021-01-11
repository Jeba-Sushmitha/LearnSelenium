package learnTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel_Testing {
	@Test	
	public void Vivo1() {						
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
	}
	@Test	
	public void Vivo2() {						
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/results?search_query=learn+automation+online");
	}
	@Test
	public void Vivo3() {						
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
	}
}
