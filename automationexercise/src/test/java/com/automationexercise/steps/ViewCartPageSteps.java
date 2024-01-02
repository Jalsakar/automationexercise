package com.automationexercise.steps;

import com.automationexercise.pages.ViewCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ViewCartPageSteps {

    @Then("I Verify both products are added to Cart")
    public void iVerifyBothProductsAreAddedToCart() {
        new ViewCartPage().verifyBothProductsAreAddedToCart();
    }

    @And("I Verify their prices, quantity and total price")
    public void iVerifyTheirPricesQuantityAndTotalPrice() {
        new ViewCartPage().verifyPricesQuantityAndTotalPrice();
    }

    @Then("I Verify that product is displayed in cart page with exact quantity")
    public void iVerifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        new ViewCartPage().verifyExactQuantityOfProductsIsDisplayed();
    }

    @And("I Verify that cart page is displayed")
    public void iVerifyThatCartPageIsDisplayed() {
        new ViewCartPage().verifyCartPageIsDisplayed();
    }

    @And("I Click Proceed To Checkout")
    public void iClickProceedToCheckout() {
        new ViewCartPage().clickOnProceedToCheckoutBtn();
    }

    @And("I Click Register or Login button for checkout")
    public void iClickRegisterLoginButtonForCheckout() {
        new ViewCartPage().clickRegisterOrLoginBtnForCheckOut();
    }

    @And("I Click {string} button corresponding to particular product")
    public void iClickXButtonCorrespondingToParticularProduct(String button) {
        new ViewCartPage().clickOnXButtonToRemoveProduct();
    }

    @Then("I Verify that product is removed from the cart")
    public void iVerifyThatProductIsRemovedFromTheCart() {

    }

}
