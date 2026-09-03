package com.stepdefinitions;

import com.base.setup;
import com.pom.Card;
import com.pom.Login;
import com.pom.Product;
import com.pom.SignUp;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class DemoblazeSteps {

    SignUp signUpPage;
    Login loginPage;
    Product productPage;
    Card cardPage;

    String username = "User" + System.currentTimeMillis();
    String password = "Password123";

    // Helper method to handle 2-second delays cleanly
    private void pauseTwoSeconds() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Before
    public void setupBrowser() {
        setup.initializeDriver();
        signUpPage = new SignUp(setup.driver);
        loginPage = new Login(setup.driver);
        productPage = new Product(setup.driver);
        cardPage = new Card(setup.driver);
    }

    @Given("User opens the Demoblaze application")
    public void user_opens_application() {
        // Driver initialized in @Before
    }

    @When("User registers a new account")
    public void user_registers_new_account() {
        signUpPage.clickSignUp();
        signUpPage.enterUsername(username);
        signUpPage.enterPassword(password);
        signUpPage.clickConfirmSignUp();
        signUpPage.handleAlert();
    }

    @When("User logs in with the registered credentials")
    public void user_logs_in() {
        loginPage.clickLogin();
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickConfirmLogin();
    }

    @When("User selects a product and adds it to the cart")
    public void user_adds_product_to_cart() {
        productPage.selectProduct();
        productPage.clickAddToCart();
        productPage.handleAlert();

        // 1. Pause 2 seconds after adding product to cart
        pauseTwoSeconds();
    }

    @When("User proceeds to cart and completes the purchase order")
    public void user_completes_purchase() {
        cardPage.goToCart();
        cardPage.clickPlaceOrder();

        // 2. Pause 2 seconds after opening place order modal before filling details
        pauseTwoSeconds();

        cardPage.fillOrderDetails("Suraj", "India", "Pune", "1234567890123456", "12", "2026");

        // 3. Pause 2 seconds after filling details before clicking Purchase
        pauseTwoSeconds();

        cardPage.clickPurchase();
        
        // 4. Pause 2 seconds after clicking Purchase before confirming OK
        pauseTwoSeconds();

        cardPage.confirmPurchase();
    }

    @Then("User logs out successfully")
    public void user_logs_out() {
        // 5. Pause 2 seconds before clicking Logout
        pauseTwoSeconds();

        cardPage.clickLogout();

        // 6. Pause 2 seconds after clicking Logout to observe result before teardown
        pauseTwoSeconds();
    }

    @After
    public void tearDown() {
        setup.quitDriver();
    }
}