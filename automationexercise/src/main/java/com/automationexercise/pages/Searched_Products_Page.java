package com.automationexercise.pages;

import com.automationexercise.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Searched_Products_Page extends Utility {
    private static final Logger log = LogManager.getLogger(Searched_Products_Page.class.getName());

    //========================== Locators ============================//
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Searched Products']")
    WebElement searchedProductsText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='productinfo text-center']")
    WebElement searchedProductDisplay;

    //======================== Methods ===============================//

    public String verifySearchedProductsText() {
        log.info("Verify Searched Products Text" + searchedProductsText.toString());
        return getTextFromElement(searchedProductsText);
    }

    public void verifySearchedProductIsDisplayed() {
        log.info("Verify Searched Product Is Displayed" + searchedProductDisplay.toString());
        searchedProductDisplay.isDisplayed();
    }
}
