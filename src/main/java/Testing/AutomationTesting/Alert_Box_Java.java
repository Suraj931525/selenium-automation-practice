package Testing.AutomationTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Box_Java {
	ChromeDriver driver;

	public static void main(String[] args) {
		alert_box a=new alert_box();
		a.launch_setup();
		a.simplealert();
		a.confirmalert
		

	}

	
	void launch_setup() {
		driver=new ChromeDriver();
		driver.get("https://testsutomationpractice.blogspot.com");
		driver.manage().window().maximize();
	}
	void simplealert() throws InterruptedException{
		driver.findElement(By.id("alertBtn")).click();
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
	}
	void confirmalert() {
		// cancel button
		driver.findElement(By.id("confirmbtn")).click();
		Alert al=driver.switchTo().alert();
		System.out.println("Cancel:"+algetText());
		al.dismiss();
		//ok button
		driver.findElement(By.id("confirmbtn")).click();
		Alert al=driver.switchTo().alert();
		System.out.println("ok"+al.getText());
		al.accept();
		
		
		
		
		
		
		
		
		
	}
}
