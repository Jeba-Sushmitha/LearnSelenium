package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SimpleExample {
	@FindBy(how = How.ID_OR_NAME, using = "i0116")
	public static WebElement UserName;
	@FindBy(css = "#i0118")
	public static WebElement Password;
}
