package com.test;

import com.base.Setup;
import com.pom.DemoblazePage;
import org.testng.annotations.Test;

public class DemoblazeTest extends Setup {

    @Test
    public void signUpLoginAddToCartPlaceOrderAndLogout() {

        DemoblazePage page = new DemoblazePage(driver);

        String username = "Suraj" + System.currentTimeMillis();
        String password = "Password123";

        // SIGN UP
        page.clickSignUp();
        page.enterSignUpUsername(username);
        page.enterSignUpPassword(password);
        page.clickConfirmSignUp();
        page.handleSignUpAlert();

        // LOGIN
        page.clickLogin();
        page.enterLoginUsername(username);
        page.enterLoginPassword(password);
        page.clickConfirmLogin();

        // ADD TO CART
        page.selectSamsungGalaxyS6();
        page.clickAddToCart();
        page.handleCartAlert();

        // CART & PLACE ORDER
        page.goToCart();
        page.clickPlaceOrder();
        page.fillOrderDetails("Suraj", "India", "Pune", "1234567890123456", "12", "2026");
        page.clickPurchase();

        // WAIT 5 SECONDS -> CLICK OK -> LOGOUT
        page.waitForFiveSecondsAndConfirmPurchase();
        page.clickLogout();
    }
}