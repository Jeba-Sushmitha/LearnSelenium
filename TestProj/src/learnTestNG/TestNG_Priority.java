package learnTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Priority {
	@Test(priority=1, enabled=true)
	public void cFirst() {		
		
		
			System.out.println("1st TestCase");
		
	}
	
	@Test(priority=2)
	public void bSecond() {
		
	
			System.out.println("2st TestCase");
		
	}
	
	@Test(priority=3)
	public void aThird() {
		System.out.println("3rd TestCase");
	
			System.out.println("3rd TestCase");
		
	}
	/*public void aThird() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://fybapi-qrcode.azurewebsites.net/");
	List<WebElement> urls=driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
	for (WebElement element: urls){
		System.out.println(element.getText());
	}*/
}
