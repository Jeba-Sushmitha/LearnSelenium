package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
public class WebDriverListeners implements WebDriverEventListener {
	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
	}
	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {	
		System.out.println("Hi Sushmi, You are God's Child, No doubt");
		arg1.findElement(By.linkText("Create an account")).click();
	}
	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
	}
	@Override
	public void afterNavigateBack(WebDriver arg0) {
	}
	@Override
	public void afterNavigateForward(WebDriver arg0) {
	}
	@Override
	public void afterNavigateRefresh(WebDriver arg0) {		
	}
	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {	
	}
	@Override
	public void afterScript(String arg0, WebDriver arg1) {
	}
	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {	
	}
	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {		
	}
	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
	}
	@Override
	public void beforeNavigateBack(WebDriver arg0) {
	}
	@Override
	public void beforeNavigateForward(WebDriver arg0) {
	}
	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {			
	}
	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {	
	}
	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
	}
	@Override
	public void onException(Throwable arg0, WebDriver arg1) {
	}
}
