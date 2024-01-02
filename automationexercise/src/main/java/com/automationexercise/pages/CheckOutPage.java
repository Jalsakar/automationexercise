package com.automationexercise.pages;

import com.automationexercise.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    //========================== Locators ============================//

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Address Details']")
    WebElement addressDetails;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Review Your Order']")
    WebElement reviewYourOrder;
    @CacheLookup
    @FindBy(xpath = "//textarea[@name='message']")
    WebElement checkOutComment;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Place Order']")
    WebElement placeOrderButton;

    @CacheLookup
    @FindBy (xpath = "//ul[@id = 'address_delivery']/li[5]")
    WebElement addressDelivery;
    @CacheLookup
    @FindBy (xpath = "//ul[@id = 'address_invoice']/li[5]")
    WebElement addressInvoice;

    //======================== Methods ===============================//

    public String verifyAddressDetails() {
        log.info("Verify Address Details" + addressDetails.toString());
        return getTextFromElement(addressDetails);
    }

    public String verifyReviewYourOrder() {
        log.info("Verify Review Your Order" + reviewYourOrder.toString());
        return getTextFromElement(reviewYourOrder);
    }

    public void addCheckOutComment(String comment) {
        log.info("Add CheckOut Comment" + checkOutComment.toString());
        sendTextToElement(checkOutComment, comment);
    }

    public void clickOnPlaceOrderButton() {
        log.info("Click on Place Order button" + placeOrderButton.toString());
        clickOnElement(placeOrderButton);
    }
    public String verifyAddressDelivery(){
        log.info("Verify Address Delivery" + addressDelivery.toString());
        return getTextFromElement(addressDelivery);
    }
    public String verifyAddressInvoice(){
        log.info("Verify Address Invoice" + addressInvoice.toString());
        return getTextFromElement(addressInvoice);
    }

}
