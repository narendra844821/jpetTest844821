package com.JpetStepDefinition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import buildpack.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jpetpage.HomePage;
import jpetpage.SigninPage;

public class My_Order_List extends SetupClass{
	HomePage homepage;
	SigninPage signinpage;
	
	
	@Given("^the user launch the application jpetstore$")
	public void the_user_launch_the_application_jpetstore() {
		//To launch the driver
		launchApplication("chrome", "https://petstore.octoperf.com/actions/Catalog.action");
	}

	@When("^the user login with valid details in jpetstore$")
	public void the_user_login_with_valid_details_in_jpetstore() throws IOException, InterruptedException {
		signinpage = new SigninPage(driver);//sign in page object
		homepage = new HomePage(driver);//homepage object
		homepage.click_Signin();//click sigin

		signinpage.send_User2();//send valid user details
		Thread.sleep(3000);
		signinpage.click_login();//click on login
		Thread.sleep(3000);
		
	}

	@Then("^the user sholud click my account$")
	public void the_user_sholud_click_my_account() {
		homepage.click_myaccount();//click myaccount after login
	}

	@Then("^the user should click my order$")
	public void the_user_should_click_my_order() {
	homepage.click_myorders();	//click myorders in my account
	}

	@Then("^the user sholud check no of orders$")
	public void the_user_sholud_check_no_of_orders() {
		List<WebElement> items=driver.findElements(By.xpath("//a"));
		System.out.println("No of items:"+(items.size()-11));//print no of items in the my order list
	
		quit();//close the driver;
	}
}
