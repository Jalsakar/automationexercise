package com.automationexercise.steps;

import com.automationexercise.pages.Searched_Products_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Searched_Products_PageSteps {

    @Then("I Verify {string} is visible on Search Product page")
    public void iVerifySEARCHEDPRODUCTSIsVisible(String expectedText) {
        Assert.assertEquals(new Searched_Products_Page().verifySearchedProductsText(), expectedText, "Error Message");
    }

    @And("I Verify all the products related to search are visible")
    public void iVerifyAllTheProductsRelatedToSearchAreVisible() {
        new Searched_Products_Page().verifySearchedProductIsDisplayed();
    }
}
