package com.automationexercise.pages;

import com.automationexercise.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PaymentDonePage extends Utility {
    private static final Logger log = LogManager.getLogger(TestCasePage.class.getName());

    //========================== Locators ============================//

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Congratulations! Your order has been confirmed!']")
    WebElement successMessageForOrderPlaced;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueBtnForDownloadInvoice;
//    @CacheLookup
//    @FindBy(xpath = "//a[normalize-space()='Continue']")
//    WebElement downloadInvoiceButton;
    By downloadInvoiceButton = By.xpath("//a[normalize-space()='Download Invoice']");
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement downloadContinueButton3;

    //======================== Methods ===============================//

    public String successMessageForOrderPlaced() {
        log.info("Success Message for Order Placed" + successMessageForOrderPlaced.toString());
        return getTextFromElement(successMessageForOrderPlaced);
    }
    public void clickOnContinueBtnForDownloadInvoice(){
        log.info("Click on Continue button for Download Invoice" + continueBtnForDownloadInvoice.toString());
        clickOnElement(continueBtnForDownloadInvoice);
    }
    //Folder location
    public void clickOnDownloadInvoiceButton() throws InterruptedException {
        log.info("Click on download invoice : " + downloadInvoiceButton.toString());
        seleniumDownloadFile(downloadInvoiceButton);

    }

    public void clickOnDownloadContinueButton3() {
        clickOnElement(downloadContinueButton3);
    }
}
