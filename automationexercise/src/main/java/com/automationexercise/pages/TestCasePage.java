package com.automationexercise.pages;

import com.automationexercise.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TestCasePage extends Utility {

    private static final Logger log = LogManager.getLogger(TestCasePage.class.getName());

    //========================== Locators ============================//
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Below is the list of test Cases for you to practic')]")
    WebElement testCasesText;

    //======================== Methods ===============================//

    public String verifyNavigateToTestCasesPage(){
        return getTextFromElement(testCasesText);
    }

}
