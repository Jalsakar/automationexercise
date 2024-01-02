package com.automationexercise.steps;

import com.automationexercise.pages.CategoryAndBrandPage;
import com.automationexercise.pages.ContactUsPage;
import com.automationexercise.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.awt.*;

public class ContactUsPageSteps {

    @Then("I Verify {string} is visible")
    public void iVerifyGETINTOUCHIsVisible(String expectedText) {
        Assert.assertEquals(new ContactUsPage().verifyGetInTouchText(), expectedText, "Error Message");
    }

    @And("I Enter name {string}, email {string}, subject {string} and message {string}")
    public void iEnterNameEmailSubjectAndMessage(String name, String email, String subject, String message) {
        new ContactUsPage().enterNameEmailSubjectAndMessageOnContactForm(name, email, subject, message);
    }

    @And("I Upload file")
    public void iUploadFile() throws AWTException {
        new ContactUsPage().uploadFileOnContactForm();
    }

    @And("I Click Submit button")
    public void iClickSubmitButton() {
        new ContactUsPage().clickOnSubmitBtnOnContactUsPage();
    }

    @And("I Click OK button")
    public void iClickOKButton() {
        new ContactUsPage().clickOnOkButton();
    }

    @Then("I Verify success message {string} is visible")
    public void iVerifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible(String expectedMessage) {
        Assert.assertEquals(new ContactUsPage().verifySuccessMsgOnContactUsPage(), expectedMessage, "Error Message");
    }

    @And("I Click Home button and verify that landed to home page successfully")
    public void iClickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {
        new ContactUsPage().clickOnHomeBtnOnContactUsPage();
        new HomePage().verifyContactUsPageNavigatedToHomePage();
    }

    @And("On left side bar,I click on any sub-category link of Men category")
    public void iAmOnLeftSideBarClickOnAnySubCategoryLinkOfMenCategory() throws InterruptedException {
        new CategoryAndBrandPage().clickOnMenCategory();
        new CategoryAndBrandPage().clickOnMenTShirtsCategory();
    }
}
