package com.automationexercise.pages;

import com.automationexercise.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends Utility {
    private static final Logger log = LogManager.getLogger(PaymentPage.class.getName());

    //========================== Locators ============================//
    @CacheLookup
    @FindBy(xpath = "//input[@name='name_on_card']")
    WebElement nameOnCard;
    @CacheLookup
    @FindBy(xpath = "//input[@name='card_number']")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='ex. 311']")
    WebElement cvc;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='MM']")
    WebElement expirationMonth;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='YYYY']")
    WebElement expirationYear;
    @CacheLookup
    @FindBy(xpath = "//button[@id='submit']")
    WebElement payAndConfirmOrderButton;

    //======================== Methods ===============================//

    public void enterNameOnCard(String name){
        log.info("Enter name on card" + nameOnCard.toString());
        sendTextToElement(nameOnCard, name);
    }
    public void enterCardNumber(String cardNumber){
        log.info("Enter Card Number" + this.cardNumber.toString());
        sendTextToElement(this.cardNumber, cardNumber);
    }
    public void enterCVC(String cvc){
        log.info("Enter CVC" + this.cvc.toString());
        sendTextToElement(this.cvc, cvc);
    }
    public void enterExpirationMonth(String month){
        log.info("Enter Expiration Month" + expirationMonth.toString());
        sendTextToElement(expirationMonth, month);
    }
    public void enterExpirationYear(String year){
        log.info("Enter Expiration Year" + expirationYear.toString());
        sendTextToElement(expirationYear, year);
    }
    public void enterPaymentDetails(String name, String cardNumber, String cvc, String month, String year){
        log.info("Enter name on card" + nameOnCard.toString());
        sendTextToElement(nameOnCard, name);
        log.info("Enter Card Number" + this.cardNumber.toString());
        sendTextToElement(this.cardNumber, cardNumber);
        log.info("Enter CVC" + this.cvc.toString());
        sendTextToElement(this.cvc, cvc);
        log.info("Enter Expiration Month" + expirationMonth.toString());
        sendTextToElement(expirationMonth, month);
        log.info("Enter Expiration Year" + expirationYear.toString());
        sendTextToElement(expirationYear, year);
    }
    public void clickOnPayAndConfirmOrderBtn(){
        log.info("Click on Pay and Confirm Order Button" + payAndConfirmOrderButton.toString());
        clickOnElement(payAndConfirmOrderButton);
    }
}
