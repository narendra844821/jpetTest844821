package com.JpetStepDefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import buildpack.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jpetpage.HomePage;
import jpetpage.SigninPage;

public class Valid_Login extends SetupClass  {

	
	
	HomePage homepage;
	SigninPage signinpage;

	
	@Given("^the user should launch the application as first task$")
public void the_user_lauch_application_3nd_time() {
		
		launchApplication("chrome", "https://petstore.octoperf.com/actions/Catalog.action");
		
	}
	
	
	@When("^the user enter valid username and password$")
	public void the_user_enter_valid_details() throws IOException, InterruptedException {
signinpage=new SigninPage(driver);//signin page object 
homepage=new HomePage(driver);//homepage object
homepage.click_Signin();//click signin 

		signinpage.send_User2();
		Thread.sleep(3000);
		signinpage.click_login();
		Thread.sleep(3000);
	}

	@Then("^check the first name$")
	public void check_the_first_name() {
		//Assert first name 
		String firstname = driver.findElement(By.id("WelcomeContent")).getText();
		Assert.assertTrue(firstname.equalsIgnoreCase("Welcome Kalapatapu Lakshmi Narasimha!"), "Invalid login");
		homepage.click_logout();//click logout
		quit();//close the driver
	}
	
}
