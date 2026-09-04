package practice_form;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class TestFullForm extends BaseTest {
	
	
	public static void main(String[] args) throws InterruptedException {
		TestFullForm test=new TestFullForm();
		test.personal();
		//test.dropdown();
		//test.checkbox();
		//test.mousehover();
		//test.draganddrop();
		//test.slider();
		test.alert();
		}
	void personal() throws InterruptedException {
		setup();
		Thread.sleep(4000);
		driver.findElement(By.id("name")).sendKeys("ritesh");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("surajpatil@gmail");
		//driver.findElement(By.id("phone")).sendKeys("surajpatil@gmail");
		//driver.findElement(By.id("textarea")).sendKeys("surajpatil@gmail931245");
		
		
	
		}
	void checkbox() {
		WebElement sunday = driver.findElement(
			    By.xpath("//label[normalize-space()='Sunday']/preceding-sibling::input[@type='checkbox']")
			);

			sunday.click();
			
		}
	
	void dropdown() {
	
        WebElement country=driver.findElement(By.id("country"));

		
		Select se=new Select(country);
		se.selectByValue("germany");
		//se.selectByIndex(1);
	}
	void mousehover() {
		WebElement pointme=driver.findElement(By.xpath("//button[text()='Point Me']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(pointme).build().perform();
	}
	
	void draganddrop() {
		WebElement d1 = driver.findElement(By.id("draggable"));
		WebElement d2 = driver.findElement(By.id("droppable"));

		Actions Ac=new Actions(driver);
		Ac.dragAndDrop(d1, d2).build().perform();
		
		
	}
	void slider() throws InterruptedException {
		WebElement s1=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/div"));
	    Actions ac = new Actions(driver);

		ac.dragAndDropBy(s1, 100, 100).build().perform();
		Thread.sleep(4000);
	}
	
	void alert() throws InterruptedException {
		//driver.findElement(By.id("alertBtn")).click();
		//driver.switchTo().alert().accept();
		
//		driver.findElement(By.id("confirmBtn")).click();
//		Alert al = driver.switchTo().alert();
//		Thread.sleep(4000);
//		System.out.println("ok"+al.getText());
//		
//		Thread.sleep(4000);
//
//		al.accept();
		
		
		driver.findElement(By.id("promptBtn")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(4000);
		al.sendKeys("Suraj");
		System.out.println("ok"+al.getText());
		
		
		Thread.sleep(4000);

		al.accept();
		
	}
	
	

}
