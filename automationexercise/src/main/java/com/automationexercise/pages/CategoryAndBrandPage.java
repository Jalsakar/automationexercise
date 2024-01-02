package com.automationexercise.pages;

import com.automationexercise.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CategoryAndBrandPage extends Utility {
    private static final Logger log = LogManager.getLogger(CategoryAndBrandPage.class.getName());

    //========================== Locators ============================//

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Women']")
    WebElement womenCategory;

    @CacheLookup
    @FindBy(xpath = "//div[@id='Women']//a[contains(text(),'Dress')]")
    WebElement womenDressCategory;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Women - Dress Products']")
    WebElement womenDressProductsText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men']")
    WebElement menCategory;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Tshirts']")
    WebElement menTShirtsCategory;


    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Men - Tshirts Products']")
    WebElement menTShirtsProductsText;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brands']")
    WebElement brandsText;
    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/H&M']")
    WebElement hmBrands;

    @CacheLookup
    @FindBy(xpath = "//div[@class='features_items']")
    List<WebElement> hmProductsList;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/H&M']")
    WebElement kooKieKidsBrands;

    @CacheLookup
    @FindBy(xpath = "//div[@class='features_items']")
    List<WebElement> kooKieKidsProductsList;


    //======================== Methods ===============================//

    public void clickOnWomenCategory()  {
        javaExecutorScriptExecuteScriptToClick(womenCategory);
        log.info("Click on Women Category" + womenCategory.toString());
    }

    public void clickOnWomenDressCategory() {
        log.info("Click on Women Dress Category" + womenDressCategory.toString());
        javaExecutorScriptExecuteScriptToClick(womenDressCategory);
    }

    public String verifyWomenDressProductsText() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Verify Women Dress Products Text" + womenDressProductsText.toString());
        return getTextFromElement(womenDressProductsText);
    }

    public void clickOnMenCategory() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Click on Men Category" + menCategory.toString());
        clickOnElement(menCategory);
    }

    public void clickOnMenTShirtsCategory() {
        log.info("Click on Men TShirts Category" + menTShirtsCategory.toString());
        clickOnElement(menTShirtsCategory);
    }

    public String verifyNavigateToMenProductCategoryPage() {
        log.info("Verify Navigate to Men Products Category Page" + menTShirtsProductsText.toString());
        return getTextFromElement(menTShirtsProductsText);
    }

    public String brandsText() throws InterruptedException {
        javaExecutorScriptExecuteScriptToScrollThePageTillElementFound(brandsText);
        Thread.sleep(2000);
        log.info("Brands Text" + brandsText.toString());
        return getTextFromElement(brandsText);
    }

    public void clickOnHMBrands() {
        javaExecutorScriptExecuteScriptToClick(hmBrands);
        log.info("Click on HM Brands" + hmBrands.toString());
    }

    public void navigatedToHMBrandsPage() {
        log.info("Navigated to HM Brands Page");
        driver.navigate().to("https://automationexercise.com/brand_products/H&M");
    }

    public void verifyHMBrandsProductsListIsDisplayed() {
        log.info("Verify HM Brands Product List is displayed" + hmProductsList.toString());
        getArrayListFromWebElements(hmProductsList);
    }

    public void clickOnKooKieKidsBrands() {
        log.info("Click on KooKieKids Brands" + kooKieKidsBrands.toString());
        clickOnElement(kooKieKidsBrands);
    }

    public void navigatedToKooKieKidsBrandsPage() {
        log.info("Navigated to KooKie Kids Brands Page");
        driver.navigate().to("https://automationexercise.com/brand_products/Kookie%20Kids");
    }

    public void verifyKooKieKidsBrandsProductsListIsDisplayed() {
        log.info("Verify KooKieKids Brands Product List is displayed" + kooKieKidsProductsList.toString());
        getArrayListFromWebElements(kooKieKidsProductsList);
    }

}
