package com.automationexercise.pages;

import com.automationexercise.propertreader.PropertyReader;
import com.automationexercise.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.AssertJUnit;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    JavascriptExecutor js = (JavascriptExecutor) driver;

    //========================== Locators ============================//

    @CacheLookup
    @FindBy(xpath = "//a[@href='/products']")
    WebElement productsLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cart']")
    WebElement cartLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement signUpOrLoginLink;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Test Cases')]")
    WebElement testCasesLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Contact us']")
    WebElement contactUsLink;

    @CacheLookup
    @FindBy(xpath = "//li[10]//a[1]")
    WebElement loggedInAsUserName;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    WebElement deleteAccountButton;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logoutButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    WebElement subscriptionText;

    @CacheLookup
    @FindBy(id = "susbscribe_email")
    WebElement subscriptionEmail;

    @CacheLookup
    @FindBy(id = "subscribe")
    WebElement subscriptionArrowButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert-success alert']")
    WebElement subscribeSuccessfullyMessage;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='recommended items']")
    WebElement recommendedItemsText;

    @CacheLookup
    @FindBy(id = "scrollUp")
    WebElement scrollUpArrow;

    @CacheLookup
    @FindBy(id = "slider")
    WebElement scrollUp;

    @CacheLookup
    @FindBy(xpath = "//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")
    WebElement sliderBarText;

    @CacheLookup
    @FindBy(xpath= "//a[normalize-space()='Home']")
    WebElement homeText;

    //======================== Methods ================================//

    public void verifyNavigateToHomePage() {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = PropertyReader.getInstance().getProperty("baseUrl");
        log.info("verifying homepage url.");
        AssertJUnit.assertEquals(expectedUrl, actualUrl);
    }

    public void clickOnSignUpOrLoginLink() {
        log.info("Click on SignupOrLoginLink" + signUpOrLoginLink.toString());
        clickOnElement(signUpOrLoginLink);
    }

    public String verifyLoggedInAsUserNameIsVisible() {
        log.info("Verify Logged in as Username is Visible" + loggedInAsUserName.toString());
        return getTextFromElement(loggedInAsUserName);
    }

    public void clickOnDeleteAccountButton() {
        mouseHoverToElementAndClick(deleteAccountButton);
        log.info("Click on Delete Account Button" + deleteAccountButton.toString());
    }

    public void clickOnLogoutButton() {
        log.info("Click on Logout button" + logoutButton.toString());
        clickOnElement(logoutButton);
    }

    public void clickOnContactUsButton() {
        log.info("Click on Contact Us button" + contactUsLink.toString());
        clickOnElement(contactUsLink);
    }

    public void clickOnTestCasesButton() {
        log.info("Click on Test Cases button" + testCasesLink.toString());
        clickOnElement(testCasesLink);
    }

    public void clickOnProductsButton() {
        log.info("Click on Products button" + productsLink.toString());
        clickOnElement(productsLink);
    }

    public void scrollDownToFooter() {
        log.info("Scroll Down to Footer");
        javaExecutorScriptExecuteScriptToScrollThePageTillElementFound(subscriptionText);
    }

    public String verifySubSubscriptionTextOnHomePage() {
        log.info("Verify Subscription Text on HomePage" + subscriptionText.toString());
        return getTextFromElement(subscriptionText);
    }

    public void enterEmailAddressAndClickOnArrowButtonOnHomePage(String email) {
        sendTextToElement(subscriptionEmail, email);
        log.info("Enter Email Address to Subscription Field on HomePage" + subscriptionEmail.toString());
        clickOnElement(subscriptionArrowButton);
        log.info("Click on Subscription Arrow Button" + subscriptionArrowButton.toString());
    }

    public String verifyYouHaveBeenSuccessfullySubscribedMsg() {
        log.info("Verify You have been successfully subscribed" + subscribeSuccessfullyMessage);
        return getTextFromElement(subscribeSuccessfullyMessage);
    }

    public void clickOnCartButton() {
        log.info("Click on Cart button" + cartLink.toString());
        clickOnElement(cartLink);
    }

    public String verifyRecommendedItemsText() {
        log.info("Verify Recommended Items Text" + recommendedItemsText.toString());
        return getTextFromElement(recommendedItemsText);
    }

    public void clickOnScrollUpArrow() {
        javaExecutorScriptExecuteScriptToClick(scrollUpArrow);
        log.info("Click on Scroll Up Arrow" + scrollUpArrow.toString());
    }

    public String verifySliderBarText() {
        log.info("Verify Slider Bar Text" + sliderBarText.toString());
        return getTextFromElement(sliderBarText);
    }

    public void scrollUp() {
        javaExecutorScriptExecuteScriptToScrollThePageTillElementFound(scrollUp);
    }
    public void verifyContactUsPageNavigatedToHomePage(){
        log.info("Verify ContactUs Page Navigated To HomePage" + homeText.toString());
        homeText.isDisplayed();
    }
}
