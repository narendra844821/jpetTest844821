package com.JpetTestrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/functionalTests/JpetTest1.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
	tags = {"@TS_01,"},

		glue = {"com.JpetStepDefinition"},
		monochrome = true
		)
		






public class TestRunnerJpet {

}
