package AutomationTestingPractical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;




public class Testpracticeform {
	
	public static void main(String[] args) throws InterruptedException  {
		
		Testpracticeform ab=new Testpracticeform();
		ab.form();
		
	}
	WebDriver driver;

	
	void form() throws InterruptedException {
		
		driver = new EdgeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("suraj");
		driver.findElement(By.id("lastName")).sendKeys("patil");
		driver.findElement(By.id("userEmail")).sendKeys("surajpatil@gmail");
		
		WebElement Male = driver.findElement(
			    By.xpath("//*[@id=\"gender-radio-1\"]")
			);

			Male.click();
			
			driver.findElement(By.id("userNumber")).sendKeys("9112947889");
			driver.findElement(By.id("subjects-label")).sendKeys("Marathi");
			
			Thread.sleep(1000);

			WebElement Sports = driver.findElement(
				    By.xpath("//*[@id=\"gender-radio-1\"]")
				);
			Thread.sleep(1000);

			Sports.click();
			driver.findElement(By.id("currentAddress")).sendKeys("Hello");
			
			Thread.sleep(1000);
			WebElement state=driver.findElement(By.className("css-19bb58m"));
			
			Select sel=new Select(state);
			
			sel.selectByIndex(4);
			
			
			
			
		
	}
}

