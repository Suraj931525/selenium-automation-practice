package com.pom;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoblazePage {

    WebDriver driver;
    WebDriverWait wait;

    public DemoblazePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    By signUpButton = By.id("signin2");
    By signUsername = By.id("sign-username");
    By signPassword = By.id("sign-password");
    By signUpConfirmButton = By.xpath("//button[text()='Sign up']");

    By loginButton = By.id("login2");
    By loginUsername = By.id("loginusername");
    By loginPassword = By.id("loginpassword");
    By loginConfirmButton = By.xpath("//button[text()='Log in']");

    By samsungGalaxyS6 = By.xpath("//a[normalize-space()='Samsung galaxy s6']");
    By addToCart = By.xpath("//a[normalize-space()='Add to cart']");
    By nameOfUserHeader = By.id("nameofuser");

    // Cart & Place Order Locators
    By cartMenu = By.id("cartur");
    By placeOrderButton = By.xpath("//button[text()='Place Order']");
    By nameInput = By.id("name");
    By countryInput = By.id("country");
    By cityInput = By.id("city");
    By cardInput = By.id("card");
    By monthInput = By.id("month");
    By yearInput = By.id("year");
    By purchaseButton = By.xpath("//button[text()='Purchase']");
    By confirmOkButton = By.xpath("//button[contains(@class,'confirm')]");

    // Logout Locator
    By logoutButton = By.id("logout2");

    // ================= SIGN UP =================

    public void clickSignUp() {
        wait.until(ExpectedConditions.elementToBeClickable(signUpButton)).click();
    }

    public void enterSignUpUsername(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(signUsername)).sendKeys(username);
    }

    public void enterSignUpPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(signPassword)).sendKeys(password);
    }

    public void clickConfirmSignUp() {
        wait.until(ExpectedConditions.elementToBeClickable(signUpConfirmButton)).click();
    }

    public void handleSignUpAlert() {
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert Message: " + alert.getText());
        alert.accept();
    }

    // ================= LOGIN =================

    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    public void enterLoginUsername(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginUsername)).sendKeys(username);
    }

    public void enterLoginPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginPassword)).sendKeys(password);
    }

    public void clickConfirmLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginConfirmButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameOfUserHeader));
    }

    // ================= PRODUCT =================

    public void selectSamsungGalaxyS6() {
        wait.until(ExpectedConditions.elementToBeClickable(samsungGalaxyS6)).click();
    }

    public void clickAddToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
    }

    public void handleCartAlert() {
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        System.out.println("Cart Alert: " + alert.getText());
        alert.accept();
    }

    // ================= CART, PLACE ORDER & LOGOUT =================

    public void goToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(cartMenu)).click();
    }

    public void clickPlaceOrder() {
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderButton)).click();
    }

    public void fillOrderDetails(String name, String country, String city, String card, String month, String year) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameInput)).sendKeys(name);
        driver.findElement(countryInput).sendKeys(country);
        driver.findElement(cityInput).sendKeys(city);
        driver.findElement(cardInput).sendKeys(card);
        driver.findElement(monthInput).sendKeys(month);
        driver.findElement(yearInput).sendKeys(year);
    }

    public void clickPurchase() {
        wait.until(ExpectedConditions.elementToBeClickable(purchaseButton)).click();
    }

    public void waitForFiveSecondsAndConfirmPurchase() {
        try {
            Thread.sleep(5000); // Wait 5 seconds after purchase
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.elementToBeClickable(confirmOkButton)).click();
    }

    public void clickLogout() {
        wait.until(ExpectedConditions.elementToBeClickable(logoutButton)).click();
    }
}