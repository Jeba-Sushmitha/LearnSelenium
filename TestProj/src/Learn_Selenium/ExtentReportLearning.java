package Learn_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



/*import junit.framework.Assert;*/

public class ExtentReportLearning {

	@Test	
	public void Vivo2() {						
		Assert.assertEquals(false, true);
	}
	@AfterTest
	public void Vivo3() {						
		Assert.assertEquals(false, true);
	}
}
