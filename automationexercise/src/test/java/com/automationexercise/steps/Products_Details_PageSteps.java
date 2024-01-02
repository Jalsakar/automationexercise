package com.automationexercise.steps;

import com.automationexercise.pages.Products_Details_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Products_Details_PageSteps {
    @And("I Landed to product detail page")
    public void iAmLandedToProductDetailPage() {
        new Products_Details_Page().landedToFirstProductPage();
    }

    @Then("I Verify that detail is visible: product name, category, price, availability, condition, brand")
    public void iVerifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        new Products_Details_Page().verifyFirstProductDetailsIsVisible();
    }

    @Then("I Verify product detail is opened")
    public void iVerifyProductDetailIsOpened() {
        new Products_Details_Page().verifyProductDetailIsOpened();
    }

    @And("I Increase quantity to {string}")
    public void iIncreaseQuantityTo(String number) throws InterruptedException {
        new Products_Details_Page().increaseQuantity(number);
    }

    @And("I Click Add to cart button")
    public void iCLICkAddToCartButton() {
        new Products_Details_Page().clickOnAddToCartBtn();
    }


    @Then("I Verify {string} is visible on product details page")
    public void iVerifyWriteYourReviewIsVisibleOnProductDetailsPage(String expectedText) {
        Assert.assertEquals(new Products_Details_Page().verifyWriteYourReviewText(), expectedText, "Error Message");

    }

    @And("I Enter name {string} email {string} and review {string}")
    public void iEnterNameEmailAndReview(String name, String email, String review) {
        new Products_Details_Page().writeYourReviewData(name, email, review);
    }

    @And("I Click Submit button for Review product")
    public void iClickSubmitButtonForReviewProduct() {
        new Products_Details_Page().clickOnSubmitForReview();
    }

    @Then("I Verify success message {string} for Review product")
    public void iVerifySuccessMessageThankYouForYourReviewForReviewProduct(String expectedText) {
        Assert.assertEquals(new Products_Details_Page().verifyThankYouForYourReviewMessage(), expectedText, "Error Message");
    }
}
