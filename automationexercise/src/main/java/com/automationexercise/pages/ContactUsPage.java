package com.automationexercise.pages;

import com.automationexercise.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends Utility {

    private static final Logger log = LogManager.getLogger(ContactUsPage.class.getName());

    //========================== Locators ============================//
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    WebElement getInTouchText;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement nameOnContactForm;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement emailOnContactForm;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Subject']")
    WebElement subjectOnContactForm;

    @CacheLookup
    @FindBy(id = "message")
    WebElement messageOnContactForm;

    @CacheLookup
    @FindBy(xpath = "//input[@name='upload_file']")
    WebElement uploadFileOnContactForm;
//    @CacheLookup
//    @FindBy(name = "upload_file")
//    private WebElement uploadFileInput;

    @CacheLookup
    @FindBy(xpath = "//input[@name='submit']")
    WebElement submitBtnOnContactUsPage;


    @CacheLookup
    @FindBy(xpath = "//div[@class='status alert alert-success']")
    WebElement successMsgOnContactUsPage;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-success']")
    WebElement homeBtnOnContactUsPage;

    //======================== Methods ================================//

    public String verifyGetInTouchText() {
        log.info("Verify Get in Touch Text" + getInTouchText.toString());
        return getTextFromElement(getInTouchText);
    }

    public void enterNameEmailSubjectAndMessageOnContactForm(String name, String email, String subject, String message) {
        sendTextToElement(nameOnContactForm, name);
        log.info("Enter Name on Contact Form" + nameOnContactForm.toString());
        sendTextToElement(emailOnContactForm, email);
        log.info("Enter Email on Contact Form" + emailOnContactForm.toString());
        sendTextToElement(subjectOnContactForm, subject);
        log.info("Enter Subject on Contact Form" + subjectOnContactForm.toString());
        sendTextToElement(messageOnContactForm, message);
        log.info("Enter Message on Contact Form" + messageOnContactForm.toString());
    }

    public void uploadFileOnContactForm() {
        log.info("Upload file on Contact Form");
        uploadFileOnContactForm.sendKeys(System.getProperty("user.dir") + "/src/test/resources/sample.txt");
    }

//    public void uploadFileOnContactForm(String filePath) {
//        //filePath = "C:\\Users\\disha\\IdeaProjects\\automationexercise\\src\\TestCases.txt";
//        filePath = "src/test/resources/sample.txt";
//        log.info("Upload file" + uploadFileOnContactForm.toString());
//        uploadFiles(filePath,uploadFileOnContactForm);
//    }

    public void clickOnSubmitBtnOnContactUsPage() {
        javaExecutorScriptExecuteScriptToClick(submitBtnOnContactUsPage);
        log.info("Click on Submit Button on Contact Us Page");
    }

    public void clickOnOkButton() {
        log.info("Click on Ok Alert");
        acceptAlert();
    }

    public String verifySuccessMsgOnContactUsPage() {
        log.info("Verify Success Message on Contact us Page" + successMsgOnContactUsPage.toString());
        return getTextFromElement(successMsgOnContactUsPage);
    }

    public void clickOnHomeBtnOnContactUsPage() {
        clickOnElement(homeBtnOnContactUsPage);
        log.info("Click on Home button On Contact Us Page" + homeBtnOnContactUsPage.toString());
    }

}
