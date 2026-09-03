package com.pom;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp {
    WebDriver driver;

    By signUpBtn = By.id("signin2");
    By userField = By.id("sign-username");
    By passField = By.id("sign-password");
    By confirmBtn = By.xpath("//button[text()='Sign up']");

    public SignUp(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignUp() {
        driver.findElement(signUpBtn).click();
    }

    public void enterUsername(String username) {
        driver.findElement(userField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passField).sendKeys(password);
    }

    public void clickConfirmSignUp() {
        driver.findElement(confirmBtn).click();
    }

    public void handleAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent()).accept();
    }
}