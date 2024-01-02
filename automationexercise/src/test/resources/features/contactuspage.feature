@regression @Disha
Feature: Contact Us Page Feature
  In Order to test Contact Us page
  As a User I should verify different scenarios in Contact Us page

  Background:
    Given I Launch browser
    When  I Navigate to URL "https://automationexercise.com/"
    Then  I Verify that home page is visible successfully
@sanity
  @Test_Case_6
  Scenario: Verify Contact Us Form
    When  I Click on Contact Us button
    Then  I Verify 'GET IN TOUCH' is visible
    And   I Enter name "Krish", email "krish123@gmail.com", subject "Product Quality" and message "Disappointment with Recent Purchase"
    And   I Upload file
    And   I Click Submit button
    And   I Click OK button
    Then  I Verify success message 'Success! Your details have been submitted successfully.' is visible
    And   I Click Home button and verify that landed to home page successfully
