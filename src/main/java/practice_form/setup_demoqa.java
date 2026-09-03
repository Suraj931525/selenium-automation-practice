package practice_form;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class setup_demoqa {

    protected ChromeDriver driver;

    @BeforeSuite
    public void launch() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");
    }
}