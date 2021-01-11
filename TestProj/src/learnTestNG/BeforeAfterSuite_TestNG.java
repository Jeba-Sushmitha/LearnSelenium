package learnTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAfterSuite_TestNG {
	WebDriver driver = new ChromeDriver();
	long startTime;
	long endTime;
	@BeforeSuite
	public void start(){
		startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");				
	}
	@AfterSuite
	public void end(){
		endTime=System.currentTimeMillis();
		long total=endTime-startTime;
		System.out.println(total);
	}
	@Test
	public void aGoogle() {		
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void bYahoo() {
		driver.get("https://in.yahoo.com/");;
	}
	
	@Test
	public void cBing() {
		driver.get("https://www.bing.com/");
		
	}
}
