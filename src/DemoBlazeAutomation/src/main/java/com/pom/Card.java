package com.pom;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Card {
    WebDriver driver;

    By cartMenu = By.id("cartur");
    By placeOrderBtn = By.xpath("//button[text()='Place Order']");
    By nameField = By.id("name");
    By countryField = By.id("country");
    By cityField = By.id("city");
    By cardField = By.id("card");
    By monthField = By.id("month");
    By yearField = By.id("year");
    By purchaseBtn = By.xpath("//button[text()='Purchase']");
    By sweetAlertOkBtn = By.xpath("//button[contains(@class,'confirm')]");
    By logoutBtn = By.id("logout2");

    public Card(WebDriver driver) {
        this.driver = driver;
    }

    public void goToCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(cartMenu)).click();
    }

    public void clickPlaceOrder() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderBtn)).click();
    }

    public void fillOrderDetails(String name, String country, String city, String card, String month, String year) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameField)).sendKeys(name);
        driver.findElement(countryField).sendKeys(country);
        driver.findElement(cityField).sendKeys(city);
        driver.findElement(cardField).sendKeys(card);
        driver.findElement(monthField).sendKeys(month);
        driver.findElement(yearField).sendKeys(year);
    }

    public void clickPurchase() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(purchaseBtn)).click();
    }

    public void confirmPurchase() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sweetAlertOkBtn)).click();

        // Redirect explicitly if Demoblaze fails to clear the modal automatically
        driver.get("https://www.demoblaze.com/index.html");
    }

    public void clickLogout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Use JavascriptExecutor to ensure the click reaches #logout2 regardless of DOM overlays
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", wait.until(ExpectedConditions.presenceOfElementLocated(logoutBtn)));
    }
}