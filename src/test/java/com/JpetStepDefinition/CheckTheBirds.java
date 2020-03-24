package com.JpetStepDefinition;

import buildpack.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import jpetpage.HomePage;

public class CheckTheBirds extends SetupClass {

	HomePage homepage;

	@Given("^the user have to launch browser$")
	public void the_user_have_to_launch_browser() {
		// to launch application
		homepage = new HomePage(driver);
		launchApplication("chrome", "https://petstore.octoperf.com/actions/Catalog.action");

	}

	@Then("^the user should click the birdspic$")
	// to click bird pic
	public void the_user_should_click_the_birdspic() {
		homepage = new HomePage(driver);
		homepage.click_bird_pic();// to click on birds pic on home page

		quit();// to close the driver
	}

}
