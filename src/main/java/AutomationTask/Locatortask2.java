package AutomationTask;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatortask2 {

	public static void main(String[] args) {
		
		Locatortask2 ab=new Locatortask2();
		ab.negativetest();
    
	}
	
	void negativetest() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	
		driver.findElement(By.id("username")).sendKeys("123");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		
		
		
		String errortext=driver.findElement(By.id("error")).getText();
	
		if (errortext.equals("Your username is invalid!")) {
            System.out.println(" Error message verified");
        } else {
            System.out.println(" Error message not matched");
        }
	}

}
