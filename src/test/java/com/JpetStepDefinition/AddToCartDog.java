package com.JpetStepDefinition;

import java.io.IOException;

import buildpack.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jpetpage.DogsPage;
import jpetpage.HomePage;
import jpetpage.SigninPage;

public class AddToCartDog extends SetupClass {

	HomePage homepage;
	SigninPage signinpage;

	@Given("^the user launch the application$")
	public void the_user_lauch_application() {
		// to launch application
		launchApplication("chrome", "https://petstore.octoperf.com/actions/Catalog.action");

	}

	@When("^the user login with valid details$")
	// to login the application with valid details
	public void the_user_enter_valid_details() throws IOException, InterruptedException {
		signinpage = new SigninPage(driver);
		homepage = new HomePage(driver);
		homepage.click_Signin();

		signinpage.send_User2();
		signinpage.click_login();
		Thread.sleep(3000);
	}

	@Then("^the user should click dogs$")
	// to click the dogs page
	public void the_user_click_dogs() throws IOException {

		homepage = new HomePage(driver);// object for home page
		homepage.click_Dogs();
	}

	@When("^the user should click Golden Retriever$")
	// to click the golden retriever
	public void the_user_click_golden_retriever() throws IOException {
		DogsPage dogspage = new DogsPage(driver);// object for dogs page
		dogspage.click_Golden_Retriever();

	}

	@Then("^the user should click addtocart$")
	// To add golden retriever to cart
	public void the_user_click_addtocart() throws IOException, InterruptedException {
		DogsPage dogspage = new DogsPage(driver);// object for dogspage
		dogspage.gr_Add_To_Cart();
		homepage.click_logout();
		quit();// To close the browser
	}
}
