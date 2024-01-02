package com.automationexercise.pages;

import com.automationexercise.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Delete_Account_Page extends Utility {

    private static final Logger log = LogManager.getLogger(Delete_Account_Page.class.getName());

    //========================== Locators ============================//

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
    WebElement accountDeletedText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueButton1;

    //======================== Methods ================================//

    public String verifyAccountDeletedText() {
        log.info("Verify Account Deleted Text" + accountDeletedText.toString());
        return getTextFromElement(accountDeletedText);
    }

    public void clickOnContinueButton1() {
        mouseHoverToElementAndClick(continueButton1);
        log.info("Click on Continue Button1" + continueButton1.toString());
    }
}
