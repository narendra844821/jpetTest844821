package com.JpetStepDefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import buildpack.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jpetpage.Check_Out_Page;
import jpetpage.DogsPage;
import jpetpage.HomePage;
import jpetpage.SigninPage;

public class Check_Out_Test extends SetupClass {
	HomePage homepage;
	SigninPage signinpage;
	Check_Out_Page checkoutpage;

	@Given("^the user launch the application jpet$")
	public void the_user_launch_the_application_jpet() {
		// to launch application
		launchApplication("chrome", "https://petstore.octoperf.com/actions/Catalog.action");

	}

	@When("^the user login with valid details in jpet$")
	// to login with valid details
	public void the_user_login_with_valid_details_in_jpet() throws IOException, InterruptedException {
		signinpage = new SigninPage(driver);// Singn in page object
		homepage = new HomePage(driver);
		homepage.click_Signin();

		signinpage.send_User2();// to send valid user details
		Thread.sleep(3000); // to sleep after filling login details
		signinpage.click_login();
		Thread.sleep(3000);// to sleep after clicking login button

	}

	@Then("^the user should click dogs in jpet homepage$")
	public void the_user_should_click_dogs_in_jpet_homepage() {
		homepage = new HomePage(driver);// home page object
		homepage.click_Dogs();// click on dogs in home page
	}

	@Then("^the user should click Golden Retriever in dogs page$")
	// to click on golden Retriver
	public void the_user_should_click_Golden_Retriever_in_dogs_page() {
		DogsPage dogspage = new DogsPage(driver);// Dogspage object
		dogspage.click_Golden_Retriever();// click on golden retriever

	}

	@Then("^the user should click addtocart to check out$")
	public void the_user_should_click_addtocart_to_check_out() throws InterruptedException {
		DogsPage dogspage = new DogsPage(driver);// dogs page object
		dogspage.gr_Add_To_Cart();// add to cart golden retriever
	}

	@Then("^the user should click proceed to checkout$")
	public void the_user_should_click_proceed_to_checkout() {
		checkoutpage = new Check_Out_Page(driver);// check out page object
		checkoutpage.click_proceed_to_checkout();// click proceed to check out

	}

	@Then("^the user should click continue$")
	public void the_user_should_click_continue() {
		checkoutpage.click_continuee();// click continue

	}

	@Then("^the user should click confirm$")
	public void the_user_should_click_confirm() {
		checkoutpage.click_conform();// click conform
		String orderconfirm = driver.findElement(By.xpath("//*[@id='Content']/ul/li")).getText();
		// Assertion for order confirmation
		Assert.assertTrue(orderconfirm.equalsIgnoreCase("Thank you, your order has been submitted."),
				"Order not conformed");
		System.out.println("Orderd Successfully");

		quit();// to close the driver

	}

}
