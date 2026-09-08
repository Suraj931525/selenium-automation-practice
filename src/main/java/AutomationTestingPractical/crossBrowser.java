package AutomationTestingPractical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class crossBrowser {

    public static void main(String[] args) throws InterruptedException {

        WebDriver chrome = new ChromeDriver();

        chrome.manage().window().maximize();

        chrome.get("https://practicetestautomation.com/practice-test-login/");

        chrome.findElement(By.id("username")).sendKeys("student");
        chrome.findElement(By.id("password")).sendKeys("Password123");
        chrome.findElement(By.id("submit")).click();

        Thread.sleep(2000);

        System.out.println("Chrome Login Successful");

        chrome.quit();


        WebDriver edge = new EdgeDriver();

        edge.manage().window().maximize();

        edge.get("https://practicetestautomation.com/practice-test-login/");

        edge.findElement(By.id("username")).sendKeys("student");
        edge.findElement(By.id("password")).sendKeys("Password123");
        edge.findElement(By.id("submit")).click();

        Thread.sleep(2000);

        System.out.println("Edge Login Successful");

        edge.quit();


        WebDriver firefox = new FirefoxDriver();

        firefox.manage().window().maximize();

        firefox.get("https://practicetestautomation.com/practice-test-login/");

        firefox.findElement(By.id("username")).sendKeys("student");
        firefox.findElement(By.id("password")).sendKeys("Password123");
        firefox.findElement(By.id("submit")).click();

        Thread.sleep(2000);

        System.out.println("Firefox Login Successful");

        firefox.quit();

        System.out.println("All Browser Testing Completed Successfully");

    }
}