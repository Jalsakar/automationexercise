package com.automationexercise.steps;

import com.automationexercise.pages.PaymentPage;
import io.cucumber.java.en.And;

public class PaymentPageSteps {
    @And("I Enter payment details: Name on Card {string}, Card Number {string}, CVC {string}, Expiration month {string} Expiration year {string}")
    public void iEnterPaymentDetailsNameOnCardCardNumberCVCExpirationMonthExpirationYear(String name, String cardNumber, String cvcNumber, String month, String year) {
        new PaymentPage().enterPaymentDetails(name, cardNumber,cvcNumber,month,year);
    }
    @And("I Click Pay and Confirm Order button for Payment")
    public void iClickPayAndConfirmOrderButtonForPayment() {
        new PaymentPage().clickOnPayAndConfirmOrderBtn();
    }
}
