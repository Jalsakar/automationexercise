@regression @Disha
Feature: All Products and product detail page
  In Order to test All Products and product detail page
  As a User I should verify different scenarios in All Products and product detail page

  Background:
    Given I Launch browser
    When  I Navigate to URL "https://automationexercise.com/"
    Then  I Verify that home page is visible successfully

  @sanity
  @Test_Case_8
  Scenario: Verify All Products and product detail page
    When  I Click on Products button
    Then  I Verify user is navigated to ALL PRODUCTS page successfully
    And   The products list is visible
    And   I Click on View Product
    And   I Landed to product detail page
    Then  I Verify that detail is visible: product name, category, price, availability, condition, brand

  @smoke
  @Test_Case_9
  Scenario: Search Product
    When  I Click on Products button
    Then  I Verify user is navigated to ALL PRODUCTS page successfully
    And   I Enter product name "Stylish Dress" in search input and click Search button
    Then  I Verify 'SEARCHED PRODUCTS' is visible on Search Product page
    Then  I Verify all the products related to search are visible

  @regression
  @Test_Case_20
  Scenario: Search Products and Verify Cart After Login
    When  I Click on Products button
    Then  I Verify user is navigated to ALL PRODUCTS page successfully
    And   I Enter product name "Stylish Dress" in search input and click Search button
    Then  I Verify 'SEARCHED PRODUCTS' is visible on Search Product page
    Then  I Verify all the products related to search are visible
    And   I Click Add to cart button
    And   I Click on View Cart button
    Then  I Verify that cart page is displayed
    And   I Click on Signup or Login button
    And   I Enter name "Krish"
    And   I Enter email address "krish123@gmail.com"
    And   I Click on Signup button
    Then  I Verify that 'ENTER ACCOUNT INFORMATION' is visible
    And   I Fill details: Title "Mr." Password "krish123" Day "4" Month "March" Year "2015"
    And   I Select checkbox Sign up for our newsletter!
    And   I Select checkbox Receive special offers from our partners!
    And   I Fill all details: First name "Krish" Last name "Patel" Company "StarPlusLtd." Address "12, Elmore Drive" AddressTwo "Kenton Road" Country "India" State "Gujarat" City "Ahmedabad" Zipcode "320008", Mobile Number "07884111720"
    And   I Click Create Account
    Then  I Verify that an 'ACCOUNT CREATED!' is visible
    And   I Click Continue button
    Then  I Verify that a Logged in as username is visible
    And   I Click Cart button
    Then  I Verify that cart page is displayed

  @regression
  @Test_Case_21
  Scenario: Add review on product
    When  I Click on Products button
    Then  I Verify user is navigated to ALL PRODUCTS page successfully
    And   I Click on View Product
    Then  I Verify 'WRITE YOUR REVIEW' is visible on product details page
    And   I Enter name "Krish" email "krish123@gmail.com" and review "The Quality of a Product is not good."
    And   I Click Submit button for Review product
    Then  I Verify success message 'Thank you for your review.' for Review product
