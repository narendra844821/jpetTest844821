package com.JpetStepDefinition;

import java.io.IOException;


import org.openqa.selenium.By;
//import org.testng.Assert;
import org.testng.Assert;

import buildpack.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jpetpage.HomePage;
import jpetpage.SigninPage;

public class Invalid_Login extends SetupClass {

	HomePage homepage;
	SigninPage signinpage;
	String argument;

	@Given("^the user sholud launch the application 2nd time$")
	// to launch application
	public void the_user_lauch_application_2nd_time() {

		launchApplication("chrome", "https://petstore.octoperf.com/actions/Catalog.action");

	}

	@When("^the user gets Home Page$")
	// to click on signin
	public void the_user_gets_Home_Page() {
		homepage = new HomePage(driver);
		homepage.click_Signin();

	}

	@Then("^user enter invalid username and password$")
	// invalid signin check
	public void user_enter_invalid_username_and_password() throws IOException {
		signinpage = new SigninPage(driver);
		signinpage.send_User3();// sending invalid user data through excel

	}

	@Then("^check if the error messge is displayed$")
	// To check if the error message is displayed
	public void check_if_the_error_messge_is_displayed() {
		signinpage.click_login();
		String text = driver.findElement(By.xpath("//*[@id='Content']/ul/li")).getText();
		// To assert if the invalid username
		Assert.assertTrue(text.equalsIgnoreCase("Invalid username or password. Signon failed."),
				"login details are incorret");

		quit();// To close the driver
	}

}
