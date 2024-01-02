package com.automationexercise.pages;

import com.automationexercise.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ProductsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductsPage.class.getName());

    //========================== Locators ============================//

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='All Products']")
    WebElement allProductsText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='features_items']")
    List<WebElement> allProductsList;

    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'View Product')])[1]")
    WebElement viewProduct;

    @CacheLookup
    @FindBy(css = "#search_product")
    WebElement searchProductField;
    @CacheLookup
    @FindBy(id = "submit_search")
    WebElement submitSearchButton;

    @CacheLookup
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[2]")
    WebElement addToCartButtonForFirstProduct;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
    WebElement continueShoppingButton;
    @CacheLookup
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[2]")
    WebElement addToCartButton1;
    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[4]")
    WebElement addToCartButton2;

    @CacheLookup
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[4]")
    WebElement addToCartButtonForSecondProduct;

    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    WebElement viewCartButton;

    //========================== Methods ============================//

    public String verifyNavigateToAllProductsPage() {
        log.info("Verify Navigate to All Products Page" + allProductsText.toString());
     return getTextFromElement(allProductsText);
    }

    public ArrayList<String> isProductsListDisplayed() {
        log.info("Is Products List Displayed" + allProductsList.toString());
        return getArrayListFromWebElements(allProductsList);
    }

    public void clickOnViewProductBtn() throws InterruptedException {
        Thread.sleep(4000);
        javaExecutorScriptExecuteScriptToClick(viewProduct);
        log.info("Click on View Product button of First Product" + viewProduct.toString());
    }

    public void enterProductNameInSearchInputAndClickOnSearchBtn(String searchProductName) {
        sendTextToElement(searchProductField, searchProductName);
        log.info("Enter Product name in Search Input" + searchProductField.toString());
        clickOnElement(submitSearchButton);
        log.info("Click on Submit Search button" + submitSearchButton.toString());
    }

    public void mouseHoverAndClickOnFirstProduct() throws InterruptedException {
        Thread.sleep(4000);
        javaExecutorScriptExecuteScriptToClick(addToCartButton1);
        log.info("Click on add to cart button1 for first product : " + addToCartButton1.toString());
    }

    public void clickOnContinueShoppingBtn() {
        log.info("Click on continue Shopping Button" + continueShoppingButton.toString());
        clickOnElement(continueShoppingButton);
    }

    public void mouseHoverAndClickOnSecondProduct() throws InterruptedException {
        Thread.sleep(4000);
        javaExecutorScriptExecuteScriptToClick(addToCartButton2);
        log.info("Click on add to cart button2 for Second product : " + addToCartButton2.toString());
    }

    public void clickOnViewCartBtn() {
        log.info("Click on View Cart button" + viewCartButton.toString());
        clickOnElement(viewCartButton);
    }
}
