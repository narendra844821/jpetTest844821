package com.JpetStepDefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import buildpack.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jpetpage.HomePage;

public class Test_Help_Link extends SetupClass {
HomePage homepage;
	@Given("^the user should launch the application jpet$")
	public void the_user_should_launch_the_application_jpet()  {
		//launch the application
		launchApplication("chrome", "https://petstore.octoperf.com/actions/Catalog.action");
	}

	@When("^the user click on help$")
	public void the_user_click_on_help()  {
		homepage=new HomePage(driver);//homepage object
		homepage.click_help();//clcik help link in homepage
	  
	}

	@Then("^the user should able to get the link page$")
	public void the_user_should_able_to_get_the_link_page()  {
	   //Assert the help link
		String match=driver.findElement(By.xpath("//*[@id='Content']/h1")).getText();
		
		Assert.assertTrue(match.equalsIgnoreCase("JPetStore Demo"), "link page not working");
		quit();//close the driver
		
	}
	
	
	
}
