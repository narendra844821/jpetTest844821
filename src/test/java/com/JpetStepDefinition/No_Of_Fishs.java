package com.JpetStepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import buildpack.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jpetpage.FishPage;
import jpetpage.HomePage;

public class No_Of_Fishs extends SetupClass {
	HomePage homepage;
	FishPage fishpage;
	
	@Given("^the userrr launch the appliationn$")
	public void the_userrr_launch_the_appliationn() {
	   //launch the browser
		launchApplication("chrome", "https://petstore.octoperf.com/actions/Catalog.action");
	}

	@When("^the userrr click on Fish$")
	public void the_userrr_click_on_Fish()  {	
		homepage=new HomePage(driver);//home page object 
		homepage.click_fish_link();//click on fish link in home page
	}

	@Then("^the userrr should get no of  types of Fish$")
	public void the_userrr_should_get_no_of_types_of_Fish()  {
		
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int number=links.size();
		System.out.println((number-11)+":no of fishs");//print no of fish available
	quit();//close the browser
	}


	
}
