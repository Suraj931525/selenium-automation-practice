package AutomationTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTask {

	public static void main(String[] args) {
		
		LocatorTask ab= new LocatorTask();
		ab.test();
		

	}
	public void  test() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		String expectedurl="practicetestautomation.com/logged-in-successfully/";
		
	     String Actualurl=driver.getCurrentUrl();
	
		if(expectedurl.equals(Actualurl))
		
		{
		
		System.out.println("URL is match");
		
		}
		 else {
		 System.out.println("URL is not match");
		
		}
		
		String pagetext = driver.findElement(By.tagName("strong")).getText();
		if (pagetext.contains("Congratulations") || 
		    pagetext.contains("successfully logged in")) {
		
		    System.out.println("Expected text found");
		
		} else {
		
		    System.out.println(" Expected text not found");
		}
		
		
		WebElement logoutBtn = driver.findElement(By.linkText("Log out"));

		if (logoutBtn.isDisplayed()) {
		    System.out.println("PASS");
		}
	}

}
