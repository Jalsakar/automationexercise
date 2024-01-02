@regression @Disha
Feature: Subscription in Home Page Feature
  In Order to test Subscription in Home Page
  As a User I should verify Success Message You Have Been Successfully Subscribed Is Visible

  Background:
    Given I Launch browser
    When  I Navigate to URL "https://automationexercise.com/"
    Then  I Verify that home page is visible successfully

  @sanity
  @Test_Case_10
  Scenario: Verify Subscription in home page
    When  I Scroll down to footer
    Then  I Verify text 'SUBSCRIPTION'
    And   I Enter email address "nisha123@gmail.com" in input and click arrow button
    Then  I Verify success message 'You have been successfully subscribed!' is visible on Home page

  @smoke
  @Test_Case_11
  Scenario: Verify Subscription in Cart page
    When  I Click Cart button
    And   I Scroll down to footer
    Then  I Verify text 'SUBSCRIPTION'
    And   I Enter email address "nisha123@gmail.com" in input and click arrow button
    Then  I Verify success message 'You have been successfully subscribed!' is visible on Home page

  @regression
  @Test_Case_25
  Scenario: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
    When  I Scroll down to footer
    Then  I Verify text 'SUBSCRIPTION'
    And   I Click on arrow at bottom right side to move upward
    Then  I Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

  @regression
  @Test_Case_26
  Scenario: Verify Scroll Up without 'Arrow' button and Scroll Down functionality
    When  I Scroll down to footer
    Then  I Verify text 'SUBSCRIPTION'
    And   I Scroll up page to top
    Then  I Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
