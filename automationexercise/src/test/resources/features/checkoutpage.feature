@regression @Disha
Feature: Checkout Page Feature
  In Order to test Checkout page
  As a User I should verify different scenarios in Checkout page

  Background:
    Given I Launch browser
    When  I Navigate to URL "https://automationexercise.com/"
    Then  I Verify that home page is visible successfully

  @sanity
  @Test_Case_14
  Scenario: Place Order: Register while Checkout
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
    And   I Click on Delete Account button
    Then  I Verify that 'ACCOUNT DELETED!' is visible and click Continue button

  @smoke
  @Test_Case_15
  Scenario: Place Order: Register before Checkout
    When  I Click on Signup or Login button
    And   I Enter name "Mishi"
    And   I Enter email address "mishi123@gmail.com"
    And   I Click on Signup button
    Then  I Verify that 'ENTER ACCOUNT INFORMATION' is visible
    And   I Fill details: Title "Mrs." Password "mishi123" Day "8" Month "January" Year "2008"
    And   I Select checkbox Sign up for our newsletter!
    And   I Select checkbox Receive special offers from our partners!
    And   I Fill all details: First name "Mishi" Last name "Kohli" Company "ZeeTVLtd." Address "12, Elmore Close" AddressTwo "Kenton Road" Country "India" State "Gujarat" City "Ahmedabad" Zipcode "320008", Mobile Number "07884111720"
    And   I Click Create Account
    Then  I Verify that an 'ACCOUNT CREATED!' is visible
    And   I Click Continue button
    Then  I Verify that a Logged in as username is visible
    When  I Hover over first product and click Add to cart
    And   I Click on View Cart button
    Then  I Verify that cart page is displayed
    And   I Click Proceed To Checkout
    Then  I Verify "Address Details" and "Review Your Order"
    And   I Enter description in comment text area "Please deliver product after 12:00pm" and click Place Order button
    And   I Enter payment details: Name on Card "Mrs Mishi Kohli", Card Number "4917300800000000", CVC "311", Expiration month "04" Expiration year "2026"
    And   I Click Pay and Confirm Order button for Payment
    Then  I Verify success message 'Congratulations! Your order has been confirmed!'
    And   I Click on Delete Account button
    Then  I Verify that 'ACCOUNT DELETED!' is visible and click Continue button

  @regression
  @Test_Case_16
  Scenario: Place Order: Login before Checkout
    When  I Click on Signup or Login button
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
    When  I Hover over first product and click Add to cart
    And   I Click on View Cart button
    Then  I Verify that cart page is displayed
    And   I Click Proceed To Checkout
    Then  I Verify "Address Details" and "Review Your Order"
    And   I Enter description in comment text area "Please deliver product after 12:00pm" and click Place Order button
    And   I Enter payment details: Name on Card "Mr Krish Patel", Card Number "4917300800000000", CVC "311", Expiration month "04" Expiration year "2026"
    And   I Click Pay and Confirm Order button for Payment
    Then  I Verify success message 'Congratulations! Your order has been confirmed!'
    And   I Click on Delete Account button
    Then  I Verify that 'ACCOUNT DELETED!' is visible and click Continue button

  @Test_Case_23
  Scenario: Verify address details in checkout page
    When  I Click on Signup or Login button
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
    When  I Hover over first product and click Add to cart
    And   I Click on View Cart button
    Then  I Verify that cart page is displayed
    And   I Click Proceed To Checkout
    Then  I Verify that the delivery address is same address "Kenton Road" filled at the time registration of account
    Then  I Verify that the billing address is same address "Kenton Road" filled at the time registration of account
    And   I Click on Delete Account button
    Then  I Verify that 'ACCOUNT DELETED!' is visible and click Continue button