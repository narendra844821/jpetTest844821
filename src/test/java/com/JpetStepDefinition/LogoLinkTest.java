package com.JpetStepDefinition;

import buildpack.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jpetpage.HomePage;

public class LogoLinkTest extends SetupClass {
	HomePage homepage;
	@Given("^the user(\\d+) launch the application$")
	public void the_user_launch_the_application(int arg1)  {
	    //to launch the driver 
		launchApplication("chrome", "https://petstore.octoperf.com/actions/Catalog.action");
		
	}

	@When("^the user(\\d+) click login icon$")
	public void the_user_click_login_icon(int arg1)  {
		homepage=new HomePage(driver);//homepage object
		homepage.click_Signin();//to click signin
		
	}

	@Then("^the user(\\d+) should click logo$")
	public void the_user_should_click_logo(int arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	 homepage.click_Logo();//to click on logo
	 quit();//To close the driver
	 
	}

}
