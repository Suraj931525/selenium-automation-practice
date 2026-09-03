package Testing.AutomationTesting;


import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ex_xpath {

	public static void main(String[] args) {
		ex_xpath ab= new ex_xpath();
		ab.logintest();
		
		
		
	}
	void logintest() {
		
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		
		// 1. attribute -> //tagname[@attribute='value']
		driver.get("https://practicetestautomation.com/practice-test-login/");
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Suraj");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Student@123");
//
//		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		//2 . traverse-> parenttagname/childtagname
		driver.findElement(By.xpath("//label//input")).sendKeys("Student@123");		
		driver.findElement(By.xpath("//div/button")).click();
		
		
		//3 . tagname -> // tagname
	    driver.findElement(By.xpath("//input)")).sendKeys("Student@123");
	    driver.findElement(By.xpath("//button)[@id='submit']")).click();
	    
	   //4. by using text-> tagname[text()='value']
	    driver.findElement(By.xpath("//label[text()='username']")).sendKeys("suraj123");
	    driver.findElement(By.xpath("//input[@ id='submit']")).click();
	    
	    
	   // 5. by using contains  // tagname[contains(@attribute,'value')]
	
	    driver.findElement(By.xpath("//label[contains(@type,'username')]")).click();
	
	}

}
