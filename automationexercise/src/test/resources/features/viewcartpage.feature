@regression @Disha
Feature: View Cart Page Feature
  In Order to test View Cart page
  As a User I should verify different Products are added to Cart

  Background:
    Given I Launch browser
    When  I Navigate to URL "https://automationexercise.com/"
    Then  I Verify that home page is visible successfully

  @sanity
  @Test_Case_12
  Scenario: Add Products in Cart
    When  I Click on Products button
    And   I Hover over first product and click Add to cart
    And   I Click Continue Shopping button
    And   I Hover over on second product and click Add to cart
    And   I Click on View Cart button
    Then  I Verify both products are added to Cart
    And   I Verify their prices, quantity and total price

  @smoke
  @Test_Case_13
  Scenario: Verify Product quantity in Cart
    When  I Click on View Product
    Then  I Verify product detail is opened
    And   I Increase quantity to "4"
    And   I Click Add to cart button
    And   I Click on View Cart button
    Then  I Verify that product is displayed in cart page with exact quantity

  @regression
  @Test_Case_17
  Scenario: Remove Products From Cart
    When  I Hover over first product and click Add to cart
    And   I Click on View Cart button
    Then  I Verify that cart page is displayed
    And   I Click 'X' button corresponding to particular product
    Then  I Verify that product is removed from the cart

  @Test_Case_18
  Scenario: View Category Product
    When  I Click on Products button
    And   I Click on Women category
    And   I Click on any category link under Women category, for example: Dress
    Then  I Verify that category page is displayed and confirm text 'WOMEN - DRESS PRODUCTS'
    And   On left side bar,I click on any sub-category link of Men category
    Then  I Verify that user is navigated to that category page

  @regression
  @Test_Case_19
  Scenario: View & Cart Brand Products
    When  I Click on Products button
    And   I Verify that Brands are visible on left side bar
    And   I Click on brand name "H&M"
    Then  I Verify that user is navigated to brand page and brand products are displayed
    And   On left side bar, I click on "KOOKIE KIDS" brand link
    Then  I Verify that user is navigated to that brand page and can see products

  @regression
  @Test_Case_22
  Scenario: Add to cart from Recommended items
    When  I Scroll down to footer
    Then  I Verify 'RECOMMENDED ITEMS' are visible
    And   I Click Add to cart button
    And   I Click on View Cart button
    Then  I Verify that cart page is displayed