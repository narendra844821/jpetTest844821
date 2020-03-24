package com.JpetStepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import buildpack.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jpetpage.HomePage;

public class No_Of_Birds extends SetupClass {
	HomePage homepage;

	@Given("^the user should launch the browserr$")
	public void the_userr_launch_the_appliation() {
		//launch the browser
		launchApplication("chrome", "https://petstore.octoperf.com/actions/Catalog.action");
	}

	@When("^the user click on Birds$")
	public void the_userr_click_birds() {

		homepage = new HomePage(driver);//homepage object
		homepage.click_bird_pic();//click on birds link
		;
	}

	@Then("^the user should get no of  types of Birds$")
	public void the_userr_should_get_no_of_types_of_birds() {
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int number = links.size();
		System.out.println((number - 11) + ":no of birds");//print no birds available 

		quit();//close the driver
	}
}
