package Testing.AutomationTesting;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownhandle {

	public static void main(String[] args) {
		test();
     
	}
	 static void test() {
		WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        
        WebElement country=driver.findElement(By.id("country"));
        
        //for handling the dropdown
        Select sel=new Select(country);
        
        //for selecting the option from dropdown
        //1.selectbyvalue  2.selectbyvisibletext  3.selectbyindex
       // sel.selectByVisibleText("India");
        
        //sel.selectByValue("germany");
        
        sel.selectByIndex(4);
        
	}
}
