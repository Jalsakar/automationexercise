package com.automationexercise.steps;

import com.automationexercise.pages.TestCasePage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TestCasePageSteps {

    @Then("I Verify user is navigated to test cases page successfully")
    public void iVerifyUserIsNavigatedToTestCasesPageSuccessfully() {
        String expectedText = "Below is the list of test Cases for you to practice the Automation. Click on the scenario for detailed Test Steps:";
        Assert.assertEquals(new TestCasePage().verifyNavigateToTestCasesPage(),expectedText);
    }

}
