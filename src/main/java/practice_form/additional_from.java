package practice_form;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class additional_from extends setup_demoqa {

    @Test(priority = 2)
    public void additional() {

        // Subject
        driver.findElement(
            By.xpath("//*[@id='subjectsContainer']/div/div[1]/div[2]")
        ).sendKeys("English");

        // Hobbies
        driver.findElement(By.id("hobbies-checkbox-1")).click();
        driver.findElement(By.id("hobbies-checkbox-2")).click();
        driver.findElement(By.id("hobbies-checkbox-3")).click();

        // Address
        driver.findElement(By.id("currentAddress"))
              .sendKeys("At Post Latur, Dist Latur");

        // State dropdown
        driver.findElement(
            By.xpath("//*[@id='state']/div/div[1]/div[2]")
        ).click();

        // Select state
        driver.findElement(
            By.xpath("//*[@id='root']/div/div/div/div[2]")
        ).click();

        // Submit
        driver.findElement(By.id("submit")).click();
    }
}