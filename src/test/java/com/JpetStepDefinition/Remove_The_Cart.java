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

public class Remove_The_Cart extends SetupClass {
	HomePage homepage;
	SigninPage signinpage;
	Check_Out_Page checkoutpage;

	@Given("^user should launch the jpetstore$")
	public void use_should_launch_the_jpetstore() {
	//to launch the browser
		launchApplication("chrome", "https://petstore.octoperf.com/actions/Catalog.action");
	}

	@When("^user login with valid details in jpet$")
	public void user_login_with_valid_details_in_jpet() throws IOException, InterruptedException {
		signinpage = new SigninPage(driver);//signin page object
		homepage = new HomePage(driver);//homepage object
		homepage.click_Signin();//to click sign in home page 

		signinpage.send_User2();//to fill valid user details
		Thread.sleep(3000);
		signinpage.click_login();//toclick on login 
		Thread.sleep(3000);

	}

	@Then("^user should click dogs in jpet homepage$")
	public void user_should_click_dogs_in_jpet_homepage() {
		homepage = new HomePage(driver);
		homepage.click_Dogs();//click on dogs in homepage
	}

	@Then("^user should click Golden Retriever in dogs page$")
	public void user_should_click_Golden_Retriever_in_dogs_page() {
		DogsPage dogspage = new DogsPage(driver);
		dogspage.click_Golden_Retriever();//to click on Goldn Retriever
	}

	@Then("^user should click addtocart to check out$")
	public void user_should_click_addtocart_to_check_out() throws InterruptedException {
		DogsPage dogspage = new DogsPage(driver);//dogs page object
		dogspage.gr_Add_To_Cart();//add to cart golden retriever
	}

	@Then("^user should click proceed to checkout$")
	public void user_should_click_proceed_to_checkout() {
		checkoutpage = new Check_Out_Page(driver);//checkoutpage object
		checkoutpage.click_proceed_to_checkout();//to click proceed to check out

	}

	@Then("^the user clicks remove from cart in jpet$")
	public void the_user_clicks_remove_from_cart_in_jpet() {
		checkoutpage = new Check_Out_Page(driver);
		checkoutpage.click_remove();//click remove to remove the cart item
	}
	@Then("^the application should display the empty cart$")
	public void the_application_should_display_the_empty_cart() {
		String remve=driver.findElement(By.xpath("//*[@id='Cart']/form/table/tbody/tr[2]/td/b")).getText();
		//Assert if the cart is empty 
		Assert.assertTrue(remve.equalsIgnoreCase("Your cart is empty."), "Items are not removed");
	quit();//to close the driver
	}
}
