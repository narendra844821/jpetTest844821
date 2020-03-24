package com.JpetStepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import buildpack.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jpetpage.HomePage;

public class No_Of_Dogs extends SetupClass {
	HomePage homepage;
	@Given("^the userr launch the appliation$")
	public void the_userr_launch_the_appliation() {
	    // lauch the application
		launchApplication("chrome", "https://petstore.octoperf.com/actions/Catalog.action");
	}

	@When("^the userr click Dogs$")
	public void the_userr_click_Dogs()  {
	    homepage=new HomePage(driver);//homepage object
	    homepage.click_Dogs();//cick dogs
	}

	@Then("^the userr should get no of  types of dogs$")
	public void the_userr_should_get_no_of_types_of_dogs()  {
	    // Write code here that turns the phrase above into concrete actions
	    
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int number=links.size();
		System.out.println((number-11)+":no of dogs");//print no of dogs available
		
		quit();
	}
	
}
