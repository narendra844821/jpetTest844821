package com.JpetStepDefinition;

import buildpack.SetupClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jpetpage.HomePage;
import jpetpage.RegisterPage;
import jpetpage.SigninPage;

public class RegistrationPageTest extends SetupClass {
	HomePage homepage;
	SigninPage signinpage;
	RegisterPage registerpage;
	
	@Given("^the user one launch the application$")
	public void the_user_launch_the_application()  {
		//To Luanch browser 
		launchApplication("chrome", "https://petstore.octoperf.com/actions/Catalog.action");
		
	}

	@When("^the user click login icon$")
	public void the_user_click_login_icon()  {
		signinpage=new SigninPage(driver);//signin page object
		homepage=new HomePage(driver);//homepage object
		homepage.click_Signin();	//to click sign in in homepage
		
	}

	@And("^the user should click registernow$")
	public void the_user_should_click_registernow() {
	
		signinpage.click_register();//to click register in sign in page 
	}

	@And("^fill the details$")
	public void fill_the_details() throws InterruptedException  {
	 registerpage=new RegisterPage(driver); //registration page object
		registerpage.registration_Data();// to fill registration details in regisration page 
	}

	@Then("^click the Submit button$")
	public void click_the_Submit_button()  {
	    registerpage.submitInfo();//to click submit info after filling details
	quit();//to cose the driver 
	}
	
	
	
}
