package com.automationexercise.pages;

import com.automationexercise.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Products_Details_Page extends Utility {

    private static final Logger log = LogManager.getLogger(Products_Details_Page.class.getName());

    //========================== Locators ============================//
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Blue Top']")
    WebElement firstProductName;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Category: Women > Tops']")
    WebElement firstProductCategory;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Rs. 500']")
    WebElement firstProductPrice;

    @CacheLookup
    @FindBy(xpath = "(//b[normalize-space()='Availability:'])[1]")
    WebElement firstProductAvailability;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-details']//p[1]")
    WebElement firstProductCondition;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-details']//p[1]")
    WebElement firstProductBrand;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-information']")
    WebElement firstProductDetails;

    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity']")
    WebElement changeQuantity;

    @CacheLookup
    @FindBy(xpath = "//div[@class='overlay-content']//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart']")
    WebElement addToCartButton;


    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Write Your Review']")
    WebElement writeYourReviewText;

    @CacheLookup
    @FindBy(id = "name")
    WebElement yourName;
    @CacheLookup
    @FindBy(id = "email")
    WebElement emailAddress;
    @CacheLookup
    @FindBy(id = "review")
    WebElement addReviewHere;

    @CacheLookup
    @FindBy(id = "button-review")
    WebElement submitReview;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Thank you for your review.']")
    WebElement successMessageForReview;

    //========================== Methods ============================//
    public void landedToFirstProductPage() {
        log.info("Landed to First Product Page");
        driver.navigate().to("https://automationexercise.com/product_details/1");
    }

    public void verifyFirstProductDetailsIsVisible() {
        getTextFromElement(firstProductName);
        getTextFromElement(firstProductCategory);
        getTextFromElement(firstProductPrice);
        getTextFromElement(firstProductAvailability);
        getTextFromElement(firstProductCondition);
        getTextFromElement(firstProductBrand);
    }

    public void verifyProductDetailIsOpened() {
        log.info("Verify Product details is opened" + firstProductDetails.toString());
        firstProductDetails.isDisplayed();
    }

    public void increaseQuantity(String qty) throws InterruptedException {
        Thread.sleep(2000);
        clearTextField(changeQuantity);
        sendTextToElement(changeQuantity, qty);
        log.info("Change Quantity" + changeQuantity.toString());
    }

    public void clickOnAddToCartBtn() {
        log.info("Click on Add To Cart Button" + addToCartButton.toString());
        javaExecutorScriptExecuteScriptToClick(addToCartButton);
    }

    public String verifyWriteYourReviewText() {
        log.info("Verify Write Your Review Text" + writeYourReviewText.toString());
        return getTextFromElement(writeYourReviewText);
    }

    public void writeYourReviewData(String yourName, String emailAddress, String addReviewHere) {
        sendTextToElement(this.yourName, yourName);
        log.info("enter Your Name" + this.yourName.toString());
        sendTextToElement(this.emailAddress, emailAddress);
        log.info("Enter Your Email Address" + this.emailAddress.toString());
        sendTextToElement(this.addReviewHere, addReviewHere);
        log.info("Enter Your Email Address" + this.addReviewHere.toString());
    }

    public void clickOnSubmitForReview() {
        log.info("Click on Submit For Review" + submitReview.toString());
        javaExecutorScriptExecuteScriptToClick(submitReview);
    }

    public String verifyThankYouForYourReviewMessage() {
        log.info("Verify Thank You For Your Review Message" + successMessageForReview.toString());
        return getTextFromElement(successMessageForReview);
    }
}
