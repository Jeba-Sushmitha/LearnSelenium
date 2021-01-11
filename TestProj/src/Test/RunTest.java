package Test;
import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
//import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



//import java.util.NoSuchElementException;

//import org.openqa.selenium.Alert;
@Test
public class RunTest {
	public WebDriverListeners listeners=null;
	public EventFiringWebDriver event_driver=null;
	public void WebDriverL() throws InterruptedException {
		try {
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://fybapi-qrcode.azurewebsites.net/");
			Thread.sleep(6000);
			List<WebElement> urls=driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
			for (WebElement element: urls){
				System.out.println(element.getText());}
		/*	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();	
			event_driver=RegisterWebDriverListener(driver);
			event_driver.manage().window().maximize();
			event_driver.get("https://www.google.com/");*/
//			Thread.sleep(3000);
//			event_driver.findElement(By.xpath("//*[text()='Gmail']")).click();			
//			UnRegisterWebDriverListener(event_driver);
		} catch (Exception ex) {
			System.out.println("No Element");
			throw (ex);
		}
		System.out.println("Sushmi*Jesus");
	}

	public EventFiringWebDriver RegisterWebDriverListener(WebDriver driver) {
		try {
			event_driver = new EventFiringWebDriver(driver);
			listeners = new WebDriverListeners();
			event_driver.register(listeners);
			return event_driver;
		} catch (Exception ex) {
			throw (ex);
		}
	}

	public void UnRegisterWebDriverListener(EventFiringWebDriver event_driver) {
		try {
			event_driver.unregister(listeners);
		} catch (Exception ex) {
			throw (ex);
		}
	}
		// Wait fluentWait = new FluentWait(driver)
		// .withTimeout(30,TimeUnit.SECONDS)
		// .pollingEvery(1, TimeUnit.SECONDS)
		// .ignoring(NoSuchElementException.class));
//	 public static void ExplicitWait(WebDriver driver, String xpath, String
//	 frameId) {
//	 try {
//	 WebDriverWait wait = new WebDriverWait(driver, 40);
//	 if (frameId != "") {
//	 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameId));
//	 }
//	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();
//	 ;
//	 // new WebDriverWait(driver,
//	 // 40).ignoring(StaleElementReferenceException.class)
//	 //
////	 .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
//	 // driver.findElement(By.xpath(xpath)).click();
//	 } catch (StaleElementReferenceException ex) {
//	 System.out.println(ex.getMessage());
//	 }
//	 }
}
