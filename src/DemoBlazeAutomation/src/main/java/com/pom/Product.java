package com.pom;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product {
    WebDriver driver;

    By samsungProduct = By.xpath("//a[text()='Samsung galaxy s6']");
    By addToCartBtn  = By.xpath("//a[text()='Add to cart']");

    public Product(WebDriver driver) {
        this.driver = driver;
    }

    public void selectProduct() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.elementToBeClickable(samsungProduct)).click();
        } catch (StaleElementReferenceException e) {
            // Relocate and click if the DOM reloaded dynamically
            wait.until(ExpectedConditions.elementToBeClickable(samsungProduct)).click();
        }
    }

    public void clickAddToCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();
    }

    public void handleAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent()).accept();
    }
}