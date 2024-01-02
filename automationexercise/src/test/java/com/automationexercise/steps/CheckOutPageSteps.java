package com.automationexercise.steps;

import com.automationexercise.pages.CheckOutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CheckOutPageSteps {
    @And("I Verify {string} and {string}")
    public void iVerifyAnd(String addressDetails, String reviewYourOrder) {
        Assert.assertEquals(new CheckOutPage().verifyAddressDetails(), addressDetails, "Error Message");
        Assert.assertEquals(new CheckOutPage().verifyReviewYourOrder(), reviewYourOrder, "Error Message");
    }


    @And("I Enter description in comment text area {string} and click Place Order button")
    public void iEnterDescriptionInCommentTextAreaAndClick(String comment) {
        new CheckOutPage().addCheckOutComment(comment);
        new CheckOutPage().clickOnPlaceOrderButton();
    }

    @Then("I Verify that the delivery address is same address {string} filled at the time registration of account")
    public void iVerifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount(String deliveryAddress) {
        Assert.assertEquals(new CheckOutPage().verifyAddressDelivery(), deliveryAddress, "ErrorMessage");
    }

    @Then("I Verify that the billing address is same address {string} filled at the time registration of account")
    public void iVerifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount(String invoiceAddress) {
        Assert.assertEquals(new CheckOutPage().verifyAddressInvoice(), invoiceAddress, "Error Message");
    }
}
