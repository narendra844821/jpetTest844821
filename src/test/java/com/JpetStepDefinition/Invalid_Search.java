package com.JpetStepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import buildpack.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jpetpage.HomePage;

public class Invalid_Search extends SetupClass {
	HomePage homepage;

	@Given("^the user should launch browsser$")
	public void the_user_should_launch_browsser() {
		// to launch the application in chrome browser
		launchApplication("chrome", "https://petstore.octoperf.com/actions/Catalog.action");
	}

	@When("^the user should Search for the (.+)$")
	public void the_user_should_Search_for_the_set1(String arg1) {

		homepage = new HomePage(driver);// home page object
		homepage.send_Search_Keys(arg1);// send invalid search keys

		homepage.search_button();// to click search button

	}

	@Then("^check the items sholud not display$")
	public void check_the_items_sholud_not_display() {
		List<WebElement> links = driver.findElements(By.xpath("//a"));// list of links we got after search
		int number = links.size();
		if ((number - 11) == 0) {

			System.out.println("Invalid searach");// print Invalid search if it is invalid search

		} else {
			System.out.println("valid searach");// print valid search if it is valid search
		}

		quit();// to close the driver

	}

}
