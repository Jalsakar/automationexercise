@regression @Disha
Feature: Login Page Feature
  In Order to test Login page
  As a User I should verify login functionality with valid and invalid credentials

  Background:
    Given I Launch browser
    When  I Navigate to URL "https://automationexercise.com/"
    Then  I Verify that home page is visible successfully

  @sanity
  @Test_Case_2
  Scenario: Login User with correct email and password
    When  I Click on Signup or Login button
    Then  I Verify 'New User Signup!' is visible on Login page
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
    And   I Click on Logout button
    Then  I Verify text 'Login to your account' is visible
    And   I Enter email address "krish123@gmail.com" and password "krish123"
    And   I Click on Login button
    Then  I Verify that a Logged in as username is visible
    And   I Click on Delete Account button
    Then  I Verify that 'ACCOUNT DELETED!' is visible and click Continue button

  @smoke
  @Test_Case_3
  Scenario: Login User with incorrect email and password
    When  I Click on Signup or Login button
    Then  I Verify text 'Login to your account' is visible
    And   I Enter email address "kana45@gmail.com" and password "kana45"
    And   I Click on Login button
    Then  I Verify error 'Your email or password is incorrect!' is visible

  @regression
  @Test_Case_4
  Scenario: Verify that user can Logout successfully
    When  I Click on Signup or Login button
    Then  I Verify text 'Login to your account' is visible
    And   I Enter email address "vina123@gmail.com" and password "vina123"
    And   I Click on Login button
    Then  I Verify that a Logged in as username is visible
    And   I Click on Logout button
    Then  I Verify that user is navigated to login page
