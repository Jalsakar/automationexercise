package com.automationexercise.steps;

import com.automationexercise.pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ProductsPageSteps {

    @Then("I Verify user is navigated to ALL PRODUCTS page successfully")
    public void iVerifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        String expectedText = "ALL PRODUCTS";
        Assert.assertEquals(new ProductsPage().verifyNavigateToAllProductsPage(), expectedText, "Eorror Message");
    }

    @And("The products list is visible")
    public void theProductsListIsVisible() {
        new ProductsPage().isProductsListDisplayed();
    }

    @And("I Click on View Product")
    public void iClickOnViewProduct() throws InterruptedException {
        new ProductsPage().clickOnViewProductBtn();
    }


    @And("I Enter product name {string} in search input and click Search button")
    public void iEnterProductNameInSearchInputAndClickSearchButton(String productName) {
        new ProductsPage().enterProductNameInSearchInputAndClickOnSearchBtn(productName);
    }

    @And("I Hover over first product and click Add to cart")
    public void iHoverOverFirstProductAndClickAddToCart() throws InterruptedException {
        new ProductsPage().mouseHoverAndClickOnFirstProduct();
    }

    @And("I Click Continue Shopping button")
    public void iCLIckContinueShoppingButton() {
        new ProductsPage().clickOnContinueShoppingBtn();
    }

    @And("I Hover over on second product and click Add to cart")
    public void iHoverOverOnSecondProductAndClickAddToCart() throws InterruptedException {
        new ProductsPage().mouseHoverAndClickOnSecondProduct();
    }

    @And("I Click on View Cart button")
    public void iCLIckOnViewCartButton() {
        new ProductsPage().clickOnViewCartBtn();
    }

}
