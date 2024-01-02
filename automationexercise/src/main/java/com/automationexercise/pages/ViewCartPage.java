package com.automationexercise.pages;

import com.automationexercise.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ViewCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ViewCartPage.class.getName());

    //========================== Locators ============================//

    @CacheLookup
    @FindBy(xpath = "//tbody")
    WebElement bothProducts;

    @CacheLookup
    @FindBy(className = "cart_price")
    List<WebElement> prices;
    @CacheLookup
    @FindBy(className = "cart_quantity")
    List<WebElement> quantity;
    @CacheLookup
    @FindBy(className = "cart_total")
    List<WebElement> totalPrice;

    @CacheLookup
    @FindBy(className = "cart_quantity")
    WebElement exactQuantity;

    @CacheLookup
    @FindBy(xpath = "//body/section[@id='cart_items']/div[1]")
    WebElement viewCartPage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
    WebElement proceedToCheckout;

    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='Register / Login']")
    WebElement registerOrLoginBtnForCheckOut;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-times']")
    WebElement removeProductXButton;

    //======================== Methods ===============================//

    public void verifyBothProductsAreAddedToCart(){
        bothProducts.isDisplayed();
    }
    public void verifyPricesQuantityAndTotalPrice() {
        getArrayListFromWebElements(prices);
        log.info("Verify prices" + prices.toString());
        getArrayListFromWebElements(quantity);
        log.info("Verify quantity" + quantity.toString());
        getArrayListFromWebElements(totalPrice);
        log.info("Verify total price" + totalPrice.toString());
    }
    public void verifyExactQuantityOfProductsIsDisplayed(){
        log.info("Verify Exact Quality Of Products" + exactQuantity.toString());
        exactQuantity.isDisplayed();
    }
    public void verifyCartPageIsDisplayed(){
        log.info("Verify Cart Page is displayed" + viewCartPage.toString());
        viewCartPage.isDisplayed();
    }
    public void clickOnProceedToCheckoutBtn(){
        log.info("Click on Proceed To Checkout");
        clickOnElement(proceedToCheckout);
    }
    public void clickRegisterOrLoginBtnForCheckOut(){
        log.info("Click on Register Or Login Btn For CheckOut" + registerOrLoginBtnForCheckOut.toString());
        clickOnElement(registerOrLoginBtnForCheckOut);
    }

    public void clickOnXButtonToRemoveProduct(){
        log.info("Click on XButton to remove product" + removeProductXButton.toString());
        clickOnElement(removeProductXButton);
    }

}
