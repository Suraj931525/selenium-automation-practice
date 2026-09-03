package practice_form;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class personal_info extends setup_demoqa {

    @Test(priority = 1)
    void personal() {

        driver.findElement(By.id("firstName"))
              .sendKeys("Suraj");

        driver.findElement(By.id("lastName"))
              .sendKeys("patil");

        driver.findElement(By.id("userEmail"))
              .sendKeys("surajpatil9315@gmail.com");

        driver.findElement(By.id("gender-radio-1"))
              .click();

        driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"))
              .sendKeys("1234567345");

        driver.findElement(By.id("dateOfBirthInput"))
              .click();
    }
}