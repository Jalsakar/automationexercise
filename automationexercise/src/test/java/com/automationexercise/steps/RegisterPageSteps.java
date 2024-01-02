package com.automationexercise.steps;

import com.automationexercise.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class RegisterPageSteps {

    @Then("I Verify {string} is visible on Login page")
    public void iVerifyNewUserSignupIsVisible(String expectedText) {
        Assert.assertEquals(new LoginPage().verifyNewUserSignupText(), expectedText, "Error Message");
    }

    @And("I Enter name {string}")
    public void iEnterName(String name) {
        new LoginPage().enterName(name);
    }

    @And("I Enter email address {string}")
    public void iEnterEmailAddress(String email) {
        new LoginPage().enterSignupEmail(email);
    }

    @And("I Click on Signup button")
    public void iClickOnSignupSignupButton() {
        new LoginPage().clickOnSignupButton();
    }


    @Then("I Verify that {string} is visible")
    public void iVerifyThatENTERACCOUNTINFORMATIONIsVisible(String expectedText) {
        Assert.assertEquals(new RegisterPage().verifyEnterAccountInformationText(), expectedText, "Error Message");
    }

    @And("I Fill details: Title {string} Password {string} Day {string} Month {string} Year {string}")
    public void iFillDetailsTitlePasswordDayMonthYear(String title, String password, String days, String months, String years) {
        new RegisterPage().fillDetails(title, password, days, months, years);
    }

    @And("I Select checkbox Sign up for our newsletter!")
    public void iSelectCheckboxSignUpForOurNewsletter() {
        new RegisterPage().clickOnNewsletter();
    }

    @And("I Select checkbox Receive special offers from our partners!")
    public void iSelectACheckboxReceiveSpecialOffersFromOurPartners() {
        new RegisterPage().clickOnReceiveSpecialOffersFromOurPartners();
    }

    @And("I Fill all details: First name {string} Last name {string} Company {string} Address {string} AddressTwo {string} Country {string} State {string} City {string} Zipcode {string}, Mobile Number {string}")
    public void iFillAllDetailsFirstNameLastNameCompanyAddressAddressTwoCountryStateCityZipcodeMobileNumberInAddressInformation(String fName, String lName, String company, String address, String addressTwo, String country, String state, String city, String zipcode, String mobileNumber) {
        new RegisterPage().fillAllDetails(fName, lName, company, address, addressTwo, country, state, city, zipcode, mobileNumber);
    }

    @And("I Click Create Account")
    public void iClickCreateAccountButton() throws InterruptedException {
        new RegisterPage().clickOnCreateAccountButton();
    }

    @Then("I Verify that an {string} is visible")
    public void iVerifyThatAnACCOUNTCREATEDIsVisible(String expectedText) {
        Assert.assertEquals(new Account_Created_Page().verifyAccountCreatedText(), expectedText, "Error Message");
    }

    @And("I Click Continue button")
    public void iClickContinueButton() {
        new Account_Created_Page().clickOnContinueButton();
    }


    @Then("I Verify that {string} is visible and click Continue button")
    public void iVerifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton(String expectedText) {
        Assert.assertEquals(new Delete_Account_Page().verifyAccountDeletedText(), expectedText, "Error Message");
        new Delete_Account_Page().clickOnContinueButton1();
    }

    @Then("I Verify error that {string} is visible")
    public void iVerifyErrorThatEmailAddressAlreadyExistIsVisible(String expectedMsg) {
        Assert.assertEquals(new RegisterPage().verifyEmailAddressAlreadyExistMessage(), expectedMsg);
    }
}
