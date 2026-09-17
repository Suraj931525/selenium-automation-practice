package broken_Links;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.*;

public class brokenlinks {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> links=driver.findElements(By.id("broken-links"));
		
		for(WebElement we:links) {
			
			we.click();
			System.out.println(we.getText());
			Thread.sleep(2000);
			driver.navigate().back();
			
		}
	}

}
