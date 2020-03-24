package com.JpetStepDefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import buildpack.SetupClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jpetpage.HomePage;
import jpetpage.SigninPage;

public class Jpet_Login extends SetupClass {
//WebDriver driver;
	HomePage homepage;
	SigninPage signinpage;
	String argument;

	@Given("^the user should launch the application$")
	public void the_User_Launch_Browser() {
		//to launch the application
		launchApplication("chrome", "https://petstore.octoperf.com/actions/Catalog.action");

	}

	@When("^the user open the 	Home Page$")
	public void the_User_click_signin() {
		homepage = new HomePage(driver);// homepage object
		homepage.click_Signin();// click signin button

	}

	@Then("^enter username and password$")
	public void the_User_enter_login_dtails() throws IOException, InterruptedException {
		signinpage = new SigninPage(driver);//siginpage driver
		signinpage.send_User1();//valid user details
		Thread.sleep(3000);
		signinpage.click_login();//click on login 
		Thread.sleep(3000);
	}

	@Then("^click signout$")
	public void click_signout() {

		homepage.click_logout();//to click logout

		quit();//to close the driver
	}

}
