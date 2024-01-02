package com.automationexercise.pages;

import com.automationexercise.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Account_Created_Page extends Utility {
    private static final Logger log = LogManager.getLogger(Account_Created_Page.class.getName());

    //========================== Locators ============================//

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
    WebElement accountCreatedText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueButton;

    //======================== Methods ================================//

    public String verifyAccountCreatedText() {
        log.info("Verify Account Created Text" + accountCreatedText.getText());
        return getTextFromElement(accountCreatedText);
    }
    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        log.info("Click on Continue Button" + continueButton.toString());
    }
}
