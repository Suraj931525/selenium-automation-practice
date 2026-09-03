package Testing.AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class cssSelectorLocator {

	public static void main(String[] args) {
		cssSelectorLocator ab = new cssSelectorLocator();
		ab.test();
		
	}
	
	void test()
{
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");

		// 1.  attributes  tagname[attributes='value']
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("student");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Password123");
//		driver.findElement(By.cssSelector("button[name='btn']")).click();
		
		
		// 2  classname -->  .classvalue
//		driver.findElement(By.cssSelector(".btn")).click();
		
		// 3. #id value
		
//		driver.findElement(By.cssSelector("#username")).sendKeys("student");
//		driver.findElement(By.cssSelector("#password")).sendKeys("Password123");

		
        // tagname
		
//		driver.findElement(By.cssSelector("img")).click();
		
		
		
		
		//tagname.classname
		
		
		driver.findElement(By.cssSelector("button.btn")).click();
		
		


}
}
