@regression @Disha
Feature: Register Page Feature
  In Order to test Register page
  As a User I should verify different scenarios in Register page

  Background:
    Given I Launch browser
    When  I Navigate to URL "https://automationexercise.com/"
    Then  I Verify that home page is visible successfully

  @sanity
  @Test_Case_1
  Scenario: Verify User should register successfully
    When  I Click on Signup or Login button
    Then  I Verify 'New User Signup!' is visible on Login page
    And   I Enter name "Tiya"
    And   I Enter email address "tiya123@gmail.com"
    And   I Click on Signup button
    Then  I Verify that 'ENTER ACCOUNT INFORMATION' is visible
    And   I Fill details: Title "Mrs." Password "tiya123" Day "7" Month "February" Year "2010"
    And   I Select checkbox Sign up for our newsletter!
    And   I Select checkbox Receive special offers from our partners!
    And   I Fill all details: First name "Tiya" Last name "Shah" Company "StarPlusLtd." Address "12, Elmore Drive" AddressTwo "Kenton Road" Country "India" State "Gujarat" City "Ahmedabad" Zipcode "320008", Mobile Number "07884111720"
    And   I Click Create Account
    Then  I Verify that an 'ACCOUNT CREATED!' is visible
    And   I Click Continue button
    Then  I Verify that a Logged in as username is visible
    And   I Click on Delete Account button
    Then  I Verify that 'ACCOUNT DELETED!' is visible and click Continue button

  @smoke
  @Test_Case_5
  Scenario: Register User with existing email
    When  I Click on Signup or Login button
    Then  I Verify 'New User Signup!' is visible on Login page
    And   I Enter name "Krish"
    And   I Enter email address "krish123@gmail.com"
    And   I Click on Signup button
    Then  I Verify error that 'Email Address already exist!' is visible