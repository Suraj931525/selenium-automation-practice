package Testing.AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {
	 EdgeDriver driver;
	public static void main(String[] args) {
		
		
		mousehover ob =new mousehover ();
		ob.mousehover1();
		ob.dragAndDrop();
	}
	
	void mousehover1() {
		 driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement pointme=driver.findElement(By.xpath("//button[text()='Point Me']"));
        
        
        //Action class --> use for mouse and keyboard action
        
        Actions ac= new Actions(driver);
        
        ac.moveToElement(pointme).build().perform();
	}
	
	public void dragAndDrop() {

	    WebElement drag = driver.findElement(By.id("draggable"));
	    WebElement drop = driver.findElement(By.id("droppable"));

	    Actions actions = new Actions(driver);

	    actions.dragAndDrop(drag, drop).perform();
	}
	
			
			

}
