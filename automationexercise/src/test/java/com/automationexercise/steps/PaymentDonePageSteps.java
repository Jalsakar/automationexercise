package com.automationexercise.steps;

import com.automationexercise.pages.PaymentDonePage;
import io.cucumber.java.en.And;
import org.testng.Assert;

import java.io.IOException;

public class PaymentDonePageSteps {
    @And("I Verify success message {string}")
    public void iVerifySuccessMessageCongratulationsYourOrderHasBeenConfirmed(String expectedMessage) {
        Assert.assertEquals(new PaymentDonePage().successMessageForOrderPlaced(), expectedMessage, "Error Message");
    }

    @And("I Click Download Invoice button and verify invoice is downloaded successfully.")
    public void userClickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully() throws IOException, InterruptedException {
        new PaymentDonePage().clickOnDownloadInvoiceButton();
    }
    @And("I Click Continue button after Download Invoice")
    public void iClickContinueButtonAfterDownloadInvoice() {
        new PaymentDonePage().clickOnContinueBtnForDownloadInvoice();
    }

    @And("User Click on the {string} button")
    public void userClickOnTheContinueButton(String downloadContinueButton) {
        new PaymentDonePage().clickOnDownloadContinueButton3();
    }
}
