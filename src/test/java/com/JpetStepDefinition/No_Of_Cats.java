package com.JpetStepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import buildpack.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jpetpage.HomePage;

public class No_Of_Cats extends SetupClass {

	HomePage homepage;
	@Given("^the userr launch the appliationn$")
	public void the_userr_launch_the_appliation() {
	    // To lunch the browser
		launchApplication("chrome", "https://petstore.octoperf.com/actions/Catalog.action");
	}

	@When("^the userr click on cats$")
	public void the_userr_click_cats()  {
	    homepage=new HomePage(driver);//home page object
	    homepage.click_Cats();//to click on cats in home page 
	}

	@Then("^the userr should get no of  types of cats$")
	public void the_userr_should_get_no_of_types_of_cats()  {
	    
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int number=links.size();
		System.out.println((number-11)+":no of cats");//print no of cats available 
		quit();//close the driver
		
	}
	
}


