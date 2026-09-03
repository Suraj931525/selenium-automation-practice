package AutomationTask;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTask3 {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");

		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		
		String errormessage=driver.findElement(By.id("error")).getText();
		
		if(errormessage.equals("Your password is invalid!")){
			System.out.println("Error message verified");
			
		}
		else {
			System.out.println("Error message not verified");
		}
	}

}
