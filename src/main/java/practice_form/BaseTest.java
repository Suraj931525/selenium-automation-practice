package practice_form;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {
	public static WebDriver driver;
	
	 public void setup() {
		driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
	}
}
