@regression @Disha
Feature: Test Case Page Feature
  In Order to test Test Case page
  As a User I should verify different scenarios in Test Case page

  Background:
    Given I Launch browser
    When  I Navigate to URL "https://automationexercise.com/"
    Then  I Verify that home page is visible successfully

  @sanity
  @Test_Case_7
  Scenario: Verify Test Cases Page
    When  I Click On Test Cases button
    Then  I Verify user is navigated to test cases page successfully