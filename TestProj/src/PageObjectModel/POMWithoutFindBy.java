package PageObjectModel;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class POMWithoutFindBy {

	public static WebElement i0116;

	public static void main(String[] args) throws Exception  {
		WebDriver driver = Driver();
		FileInputStream file=new FileInputStream("config.properties");
		Properties prop=new Properties();
		prop.load(file);
		prop.getProperty("url");
		driver.get(prop.getProperty("url"));
	//	driver.get("https://stagemap.tempursealy.com/");
//PageFactory.initElements(driver, POMWithoutFindBy.class);
		i0116.sendKeys("tempurlogin@customeranalytics360.com");
	}

	public static WebDriver Driver() {
		try {
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
}
