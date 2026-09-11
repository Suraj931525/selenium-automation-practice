package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login_logout {
	WebDriver driver;
	@Test
	void login1() throws InterruptedException {
	 driver =new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(1000);
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	Thread.sleep(1000);
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(1000);
	driver.findElement(By.id("login-button")).click();	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("logout_sidebar_link")).click();
	Thread.sleep(1000);
	}
	@Test
	void login2() throws InterruptedException {
		    driver =new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(1000);
			driver.findElement(By.id("user-name")).sendKeys("problem_user");
			Thread.sleep(1000);
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			Thread.sleep(1000);
			driver.findElement(By.id("login-button")).click();	
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("logout_sidebar_link")).click();
		
	}
}

