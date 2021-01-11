package Selenium_Actions;

import java.awt.Desktop.Action;
//import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.jna.Function;

import PageObjectModel.SimpleExample;;

public class Learn_Actions {
	public static void main(String[] args) throws Exception {
		try {
			WebDriver driver = Driver();
			driver.get("https://stagemap.tempursealy.com/");		
			PageFactory.initElements(driver, SimpleExample.class);
			
			SimpleExample.UserName.sendKeys("tempurlogin@customeranalytics360.com");		
			driver.findElement(By.xpath("//input[@type='submit']")).click();			
			SimpleExample.Password.sendKeys("Sealey_common11");			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			/*driver.findElement(By.id("i0116")).sendKeys(username);
			ExplicitWait(driver, "//input[@type='submit']");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#i0118")).sendKeys(password);
			Thread.sleep(2000);
			ExplicitWait(driver, "//input[@type='submit']");
			ExplicitWait(driver, "//input[@type='submit']");*/
			

//			driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
//			driver.findElement(By.xpath("//button[text()='Try it']")).click();
			

//			driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
			         
//			Thread.sleep(3000);
//			Wait<WebDriver> fluentWait= new FluentWait<WebDriver>(driver)
//					.withTimeout(3000, TimeUnit.SECONDS)
//					.pollingEvery(1000, TimeUnit.SECONDS)
//					.ignoring(NoSuchElementException.class);
//			WebElement element=fluentWait.until(new Function<F, T>() {
//			};(){
//				public WebElement apply(WebDriver driver){
//					return driver.
//				}
//			});	
//				
//				
//			driver.findElement(By.xpath("//a[text()='Executive Programs' and ./@class='nav-link ga_category_upfront']"))
//					.click();
			
		} catch (Exception ex) {
			throw ex;
		}
	}
	//MouseHoverAndClick - Using this method, we can only Hover or Hover and Click
	public static void MouseHoverAndClick(WebDriver driver, String HoverPath, String ClickablePath) throws Exception {
		try {
			Actions action = new Actions(driver);
			
			action.moveToElement(driver.findElement(By.xpath(HoverPath))).build().perform();
			Thread.sleep(3000);
			if (ClickablePath != "") {
				driver.findElement(By.xpath(ClickablePath)).click();
			}
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public static void DragAndDrop(WebDriver driver, String Source, String Target) throws Exception {
		try {
			Actions action = new Actions(driver);
			action.contextClick(driver.findElement(By.xpath("//a[@class='w3-button w3-bar-item topnav-icons fa fa-adjust']"))).perform();
			action.clickAndHold(driver.findElement(By.xpath(Source)))
					.moveToElement(driver.findElement(By.xpath(Target))).release().build().perform();
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public static WebDriver Driver() {
		try {
//			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
//			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			return driver;
		} catch (Exception ex) {
			throw ex;
		}
	}
	public static WebDriver MicrosoftLogin(WebDriver driver, String url, String username, String password)
			throws InterruptedException {
		try {
			driver.get(url);
			driver.findElement(By.id("i0116")).sendKeys(username);
			ExplicitWait(driver, "//input[@type='submit']");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#i0118")).sendKeys(password);
			Thread.sleep(2000);
			ExplicitWait(driver, "//input[@type='submit']");
			ExplicitWait(driver, "//input[@type='submit']");
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return driver;
	}
	public static void ExplicitWait(WebDriver driver, String xpath) {
		try {
			new WebDriverWait(driver, 40).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			driver.findElement(By.xpath(xpath)).click();
		} catch (StaleElementReferenceException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
