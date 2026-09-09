package Test_Automation_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demoa_From {
	ChromeDriver driver;
	
	@Test
	void launch() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
	}
	
	@Test
	void regiform() {
		driver.findElement(By.id("firstName")).sendKeys("Suraj");
		driver.findElement(By.id("lastName")).sendKeys("Patil");
		driver.findElement(By.id("userEmail")).sendKeys("surajpatil9315@gmail.com");
	}
	
	@Test
	void personal() {
		WebElement Gender=driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]"));
		
		Gender.click();
	}

}
