package com.automationexercise.pages;

import com.automationexercise.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.AssertJUnit;

import static org.testng.Assert.assertEquals;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    //========================== Locators ============================//
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
    WebElement loginToYourAccountText;
    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement loginEmailAddressField;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
    WebElement newUserSignupText;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement nameField;
    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement signupEmailField;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Signup']")
    WebElement signupButton;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    WebElement errorMessageForInvalidCredentials;


    //======================== Methods ================================//

    public void verifyTextOnLoginPage(String text) {
        if (text.equalsIgnoreCase("Login to your account")) {
            assertEquals(new LoginPage().loginToYourAccountText, text, text + " text not displayed");
        } else if (text.equalsIgnoreCase("New User Signup!")) {
            assertEquals(new LoginPage().newUserSignupText, text, text + "text not displayed");
        }
    }

    public String verifyLoginToYourAccountText() {
        log.info("Verify Login to Your account Text" + loginToYourAccountText.toString());
        return getTextFromElement(loginToYourAccountText);
    }

    public String verifyNewUserSignupText() {
        log.info("Verify New UserSignup Text" + newUserSignupText.toString());
        return getTextFromElement(newUserSignupText);
    }

    public void enterLoginEmailAddress(String loginEmail) {
        log.info("Enter Login Email Address" + loginEmailAddressField.toString());
        sendTextToElement(loginEmailAddressField, loginEmail);
    }

    public void enterPassword(String password) {
        log.info("Enter Password" + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void enterName(String name) {
        log.info("Enter Name" + nameField.toString());
        sendTextToElement(nameField, name);
    }

    public void enterSignupEmail(String signupEmail) {
        log.info("Enter Signup Email" + signupEmailField.toString());
        sendTextToElement(signupEmailField, signupEmail);
    }

    public void clickOnSignupButton() {
        log.info("Click on Signup Button" + signupButton.toString());
        clickOnElement(signupButton);
    }

    public void clickOnLoginButton() {
        log.info("Click on Login Button" + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String verifyErrorMessageForInvalidCredentials() {
        log.info("Verify Error Message for Invalid Credentials");
        return getTextFromElement(errorMessageForInvalidCredentials);
    }

    public void verifyNavigateToLoginPage() {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://automationexercise.com/login";
        log.info("Verifying LoginPage URL");
        AssertJUnit.assertEquals(expectedUrl, actualUrl);
    }
}
