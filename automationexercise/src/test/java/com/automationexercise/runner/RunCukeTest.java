package com.automationexercise.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",//feature path
        glue = "com/automationexercise/steps",//steps folder path
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/cucumber.json",
                "rerun:target/rerun.txt"},
        tags = "@Test_Case_6"
)

public class RunCukeTest extends AbstractTestNGCucumberTests {
}
