package com.automationexercise.steps;

import com.automationexercise.pages.CategoryAndBrandPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CategoryAndBrandsPageSteps {

    @And("I Click on Women category")
    public void iClickOnWomenCategory()  {
        new CategoryAndBrandPage().clickOnWomenCategory();
    }

    @And("I Click on any category link under Women category, for example: Dress")
    public void iClickOnAnyCategoryLinkUnderWomenCategoryForExampleDress() {
        new CategoryAndBrandPage().clickOnWomenDressCategory();
    }

    @Then("I Verify that category page is displayed and confirm text {string}")
    public void iVerifyThatCategoryPageIsDisplayedAndConfirmTextWOMENDRESSPRODUCTS(String expectedText) throws InterruptedException {
        Assert.assertEquals(new CategoryAndBrandPage().verifyWomenDressProductsText(), expectedText, "Error Message");
    }

    @Then("I Verify that user is navigated to that category page")
    public void iVerifyThatUserIsNavigatedToThatCategoryPage() {
        String expectedText = "MEN - TSHIRTS PRODUCTS";
        Assert.assertEquals(new CategoryAndBrandPage().verifyNavigateToMenProductCategoryPage(),expectedText);
    }


    @And("I Verify that Brands are visible on left side bar")
    public void iVerifyThatAreVisibleOnLeftSideBar() throws InterruptedException {
        Assert.assertEquals(new CategoryAndBrandPage().brandsText(), "BRANDS", "Error Message");
    }

    @And("I Click on brand name {string}")
    public void iClickOnBrandName(String brandsName) {
        new CategoryAndBrandPage().clickOnHMBrands();
    }

    @Then("I Verify that user is navigated to brand page and brand products are displayed")
    public void iVerifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
        new CategoryAndBrandPage().navigatedToHMBrandsPage();
        new CategoryAndBrandPage().verifyHMBrandsProductsListIsDisplayed();
    }

    @And("On left side bar, I click on {string} brand link")
    public void onLeftSideBarIClickOnBrandLink(String kooKieKidsBrands) {
        new CategoryAndBrandPage().clickOnKooKieKidsBrands();
    }

    @Then("I Verify that user is navigated to that brand page and can see products")
    public void iVerifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {
        new CategoryAndBrandPage().navigatedToKooKieKidsBrandsPage();
        new CategoryAndBrandPage().verifyKooKieKidsBrandsProductsListIsDisplayed();
    }
}
