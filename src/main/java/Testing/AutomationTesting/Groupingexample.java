package Testing.AutomationTesting;

import org.testng.annotations.Test;

public class Groupingexample {

    @Test(groups = {"smoke"})
    void loginTest() {
        System.out.println("Login Test");
    }

    @Test(groups = {"smoke", "regression"})
    void searchTest() {
        System.out.println("Search Test");
    }

    @Test(groups = {"regression"})
    void paymentTest() {
        System.out.println("Payment Test");
    }

    @Test(groups = {"regression"})
    void logoutTest() {
        System.out.println("Logout Test");
    }
}