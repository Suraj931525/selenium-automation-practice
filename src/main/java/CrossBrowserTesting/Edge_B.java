package CrossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_B extends Chrome_B{
	
	void TC_2(){
		EdgeDriver driver =new EdgeDriver ();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		//positive login test
		
		driver.findElement(By.id("username")).sendKeys("incorrectUser");
		driver.findElement(By.id("password")).sendKeys("Passsword123");
		driver.findElement(By.id("submit")).click();
		
		
		WebElement errormsg=driver.findElement(By.id("error"));
		String error_msg="Your username is invalid!";
		
		String Actual_error_msg=errormsg.getText();
		
		if( error_msg.equals(Actual_error_msg)) {
			System.out.println("negative test case passed");
		}
		else {
			System.out.println("negative test case failed");
		}
	}

}
