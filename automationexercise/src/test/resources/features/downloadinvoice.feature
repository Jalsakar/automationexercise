@regression @Disha
Feature: Download Invoice Feature
  In Order to test Download Invoice after purchase order
  As a User I should verify that Invoice is downloaded after purchase order

  Background:
    Given I Launch browser
    When  I Navigate to URL "https://automationexercise.com/"
    Then  I Verify that home page is visible successfully

  @sanity
  @Test_Case_24
  Scenario: Download Invoice after purchase order
    When  I Hover over first product and click Add to cart
    And   I Click on View Cart button
    Then  I Verify that cart page is displayed
    And   I Click Proceed To Checkout
    And   I Click Register or Login button for checkout
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
    And   I Click Proceed To Checkout
    Then  I Verify "Address Details" and "Review Your Order"
    And   I Enter description in comment text area "Please deliver product after 12:00pm" and click Place Order button
    And   I Enter payment details: Name on Card "Mr Krish Patel", Card Number "4917300800000000", CVC "311", Expiration month "04" Expiration year "2026"
    And   I Click Pay and Confirm Order button for Payment
    Then  I Verify success message 'Congratulations! Your order has been confirmed!'
    And   I Click Download Invoice button and verify invoice is downloaded successfully.
    And   I Click Continue button after Download Invoice
    And   I Click on Delete Account button
    Then  I Verify that 'ACCOUNT DELETED!' is visible and click Continue button