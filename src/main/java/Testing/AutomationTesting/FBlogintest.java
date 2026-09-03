package Testing.AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FBlogintest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://secure.facebook.com/");

        Thread.sleep(5000);
        //id
        driver.findElement(By.id("email")).sendKeys("Om@gmail.com");
        //name
        driver.findElement(By.name("pass")).sendKeys("A@123");
        //tagname
        driver.findElement(By.tagName("button")).click();
        //Linktext
        driver.findElement(By.linkText("Forgotten password?")).click();
        //navigate to back
        driver.navigate().back();
        //paartiallinktext
        driver.findElement(By.partialLinkText("Forgotten")).click();
        //navigate to back
        driver.navigate().back();
        driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy")).click();
    }
}