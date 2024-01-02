package com.automationexercise.pages;

import com.automationexercise.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());
    JavascriptExecutor js = (JavascriptExecutor) driver;

    //========================== Locators ============================//

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    WebElement enterAccountInformationText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement titleMr;

    @CacheLookup
    @FindBy(xpath = "//input[@id='id_gender2']")
    WebElement titleMrs;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//select[@id='days']")
    WebElement day;
    @CacheLookup
    @FindBy(xpath = "//select[@id='months']")
    WebElement month;

    @CacheLookup
    @FindBy(xpath = "//select[@id='years']")
    WebElement year;

    @CacheLookup
    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement clickOnNewsletter;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Receive special offers from our partners!']")
    WebElement clickOnReceiveSpecialOffersFromOurPartners;

    @CacheLookup
    @FindBy(xpath = "//input[@id='first_name']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='last_name']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='company']")
    WebElement company;
    @CacheLookup
    @FindBy(id = "address1")
    WebElement address;

    @CacheLookup
    @FindBy(id = "address2")
    WebElement addressTwo;
    @CacheLookup
    @FindBy(xpath = "//select[@id='country']")
    WebElement country;
    @CacheLookup
    @FindBy(xpath = "//input[@id='state']")
    WebElement state;
    @CacheLookup
    @FindBy(xpath = "//input[@id='city']")
    WebElement city;
    @CacheLookup
    @FindBy(xpath = "//input[@id='zipcode']")
    WebElement zipcode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='mobile_number']")
    WebElement mobileNumber;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    WebElement createAccountButton;
    //button[normalize-space()='Create Account']
    //button[data-qa='create-account']
    ///html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    WebElement emailAddressAlreadyExistMsg;

    //======================== Methods ================================//

    public String verifyEnterAccountInformationText() {
        log.info("Verify Enter Account Information Text" + enterAccountInformationText.toString());
        return getTextFromElement(enterAccountInformationText);
    }

    public void selectGender(String mrOrMrs) {
        switch (mrOrMrs) {
            case "Mr.":
                clickOnElement(titleMr);
                break;
            case "Mrs.":
                clickOnElement(titleMrs);
                break;
            default:
                break;
        }
        log.info("Select gender : " + titleMr.toString());
        log.info("Select gender : " + titleMrs.toString());
    }

    public void fillDetails(String title, String password, String day, String month, String year) {
        selectGender(title);
        sendTextToElement(this.password, password);
        log.info("Fill Details" + this.password.toString());
        sendTextToElement(this.day, day);
        log.info("Fill Details" + this.day.toString());
        sendTextToElement(this.month, month);
        log.info("Fill Details" + this.month.toString());
        sendTextToElement(this.year, year);
        log.info("Fill Details" + this.year.toString());
    }

    public void clickOnNewsletter() {
        mouseHoverToElement(clickOnNewsletter);
        log.info("Click on Button : " + clickOnNewsletter.toString());
    }

    public void clickOnReceiveSpecialOffersFromOurPartners() {
        mouseHoverToElement(clickOnReceiveSpecialOffersFromOurPartners);
        log.info("Click on Button : " + clickOnReceiveSpecialOffersFromOurPartners.toString());
    }

    public void fillAllDetails(String fName, String lName, String company, String address, String addressTwo, String country, String state, String city, String zipcode, String mobileNumber) {
        sendTextToElement(firstName, fName);
        log.info("Fill All Details" + firstName.toString());
        sendTextToElement(lastName, lName);
        log.info("Fill All Details" + lastName.toString());
        sendTextToElement(this.company, company);
        log.info("Fill All Details" + this.company.toString());
        sendTextToElement(this.address, address);
        log.info("Fill All Details" + this.address.toString());
        sendTextToElement(this.addressTwo, addressTwo);
        log.info("Fill All Details" + this.addressTwo.toString());
        selectByVisibleTextFromDropDown(this.country, country);
        sendTextToElement(this.state, state);
        log.info("Fill All Details" + this.state.toString());
        sendTextToElement(this.city, city);
        log.info("Fill All Details" + this.city.toString());
        sendTextToElement(this.zipcode, zipcode);
        log.info("Fill All Details" + this.zipcode.toString());
        sendTextToElement(this.mobileNumber, mobileNumber);
        log.info("Fill All Details" + this.mobileNumber.toString());
    }

    public void clickOnCreateAccountButton() throws InterruptedException {
        javaExecutorScriptExecuteScriptToClick(createAccountButton);
        Thread.sleep(2000);
        //clickOnElement(createAccountButton);
        log.info("Click on Create Account Button" + createAccountButton.toString());
    }

    public String verifyEmailAddressAlreadyExistMessage(){
        log.info("Verify Email Address Already Exist Message" + emailAddressAlreadyExistMsg.toString());
        return getTextFromElement(emailAddressAlreadyExistMsg);
    }

    public void iCanSeeTheText(String text) {
        if (text.equalsIgnoreCase("New User Signup!")) {
            Assert.assertEquals(new LoginPage().verifyNewUserSignupText(), text, text + " text not displayed");
        } else if (text.equalsIgnoreCase("ENTER ACCOUNT INFORMATION")) {
            Assert.assertEquals(new RegisterPage().verifyEnterAccountInformationText(), text, text + "text not displayed");
        } else if (text.equalsIgnoreCase("ACCOUNT CREATED!")) {
            Assert.assertEquals(new Account_Created_Page().verifyAccountCreatedText(), text, text + "text not displayed");
        } else if (text.equalsIgnoreCase("Logged in as username")) {
            Assert.assertEquals(new HomePage().verifyLoggedInAsUserNameIsVisible(), text, text + "text not displayed");
        }
    }
}
