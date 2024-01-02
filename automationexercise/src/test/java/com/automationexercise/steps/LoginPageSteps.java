package com.automationexercise.steps;

import com.automationexercise.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginPageSteps {

    @Then("I Verify text {string} is visible")
    public void iVerifyALoginToYourAccountIsVisible(String expectedText) {
        Assert.assertEquals(new LoginPage().verifyLoginToYourAccountText(), expectedText, "Error Message");
    }

    @And("I Enter email address {string} and password {string}")
    public void iEnterEmailAddressAndPassword(String emailCredentials, String passwordCredentials) {
        new LoginPage().enterLoginEmailAddress(emailCredentials);
        new LoginPage().enterPassword(passwordCredentials);
    }

    @And("I Click on Login button")
    public void iClickOnTheLoginButton() {
        new LoginPage().clickOnLoginButton();
    }


    @Then("I Verify error {string} is visible")
    public void iVerifyErrorYourEmailOrPasswordIsIncorrectIsVisible(String errorMessage) {
        Assert.assertEquals(new LoginPage().verifyErrorMessageForInvalidCredentials(), errorMessage);
    }

    @Then("I Verify that user is navigated to login page")
    public void iVerifyThatUserIsNavigatedToLoginPage() {
        new LoginPage().verifyNavigateToLoginPage();
    }


}
