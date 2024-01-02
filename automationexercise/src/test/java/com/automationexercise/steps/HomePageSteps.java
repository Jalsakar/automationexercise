package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageSteps {

    @Given("I Launch browser")
    public void iLaunchBrowser() {
    }

    @When("I Navigate to URL {string}")
    public void iNavigateToUrl(String baseUrl) {
        System.out.println(baseUrl);
    }

    @Then("I Verify that home page is visible successfully")
    public void iVerifyThatHomePageIsVisibleSuccessfully() {
        new HomePage().verifyNavigateToHomePage();
    }

    @When("I Click on Signup or Login button")
    public void iClickOnSignupOrLoginSignupLoginButton() {
        new HomePage().clickOnSignUpOrLoginLink();
    }

    @When("I Scroll down to footer")
    public void iScrollDownToFooter() {
        new HomePage().scrollDownToFooter();
    }

    @Then("I Verify text {string}")
    public void iVerifyTextSUBSCRIPTION(String text) {
        Assert.assertEquals(new HomePage().verifySubSubscriptionTextOnHomePage(), text, "Error Message");
    }

    @And("I Enter email address {string} in input and click arrow button")
    public void iEnterEmailAddressInInputAndClickArrowButton(String email) {
        new HomePage().enterEmailAddressAndClickOnArrowButtonOnHomePage(email);
    }

    @Then("I Verify success message {string} is visible on Home page")
    public void iVerifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible(String actualMessage) {
        Assert.assertEquals(new HomePage().verifyYouHaveBeenSuccessfullySubscribedMsg(), "You have been successfully subscribed!", "Error Message");
    }

    @When("I Click on Contact Us button")
    public void iClickOnContactUsButton() {
        new HomePage().clickOnContactUsButton();
    }

    @And("I Click on Logout button")
    public void iClickOnALogoutButton() {
        new HomePage().clickOnLogoutButton();
    }

    @When("I Click on Products button")
    public void iCLickOnProductsButton() {
        new HomePage().clickOnProductsButton();
    }

    @Then("I Verify that a Logged in as username is visible")
    public void iVerifyThatALoggedInAsUsernameIsVisible() {
        String expectedText = "Logged in as Krish";
        Assert.assertEquals(new HomePage().verifyLoggedInAsUserNameIsVisible(), expectedText, "Error Message");
    }

    @And("I Click on Delete Account button")
    public void iClickOnDeleteAccountButton() {
        new HomePage().clickOnDeleteAccountButton();
    }

    @When("I Click On Test Cases button")
    public void iClickOnTestCasesButton() {
        new HomePage().clickOnTestCasesButton();
    }

    @When("I Click Cart button")
    public void iClickCartButton() {
        new HomePage().clickOnCartButton();
    }

    @Then("I Verify {string} are visible")
    public void iVerifyRECOMMENDEDITEMSAreVisible(String expectedText) {
        Assert.assertEquals(new HomePage().verifyRecommendedItemsText(), expectedText, "Error Message");
    }

    @And("I Click on arrow at bottom right side to move upward")
    public void iClickOnArrowAtBottomRightSideToMoveUpward() {
        new HomePage().clickOnScrollUpArrow();
    }

    @And("I Scroll up page to top")
    public void iScrollUpPageToTop() {
        new HomePage().scrollUp();
    }

    @Then("I Verify that page is scrolled up and {string} text is visible on screen")
    public void iVerifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen(String expectedText) {
        Assert.assertEquals(new HomePage().verifySliderBarText(), expectedText, "Error Message");
    }

}
