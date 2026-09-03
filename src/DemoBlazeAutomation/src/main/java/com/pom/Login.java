package com.pom;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    WebDriver driver;

    By loginBtn = By.id("login2");
    By userField = By.id("loginusername");
    By passField = By.id("loginpassword");
    By confirmBtn = By.xpath("//button[text()='Log in']");
    By userHeader = By.id("nameofuser");
    By loginModal = By.id("logInModal");

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

    public void enterUsername(String username) {
        driver.findElement(userField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passField).sendKeys(password);
    }

    public void clickConfirmLogin() {
        driver.findElement(confirmBtn).click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait until user profile text is visible AND modal overlay disappears
        wait.until(ExpectedConditions.visibilityOfElementLocated(userHeader));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loginModal));
    }
}