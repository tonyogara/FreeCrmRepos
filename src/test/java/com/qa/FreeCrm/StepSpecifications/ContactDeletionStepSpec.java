package com.qa.FreeCrm.StepSpecifications;


import cucumber.api.java.en.Given;

import org.junit.Assert;

import com.qa.FreeCrm.TestBase.*;
import com.qa.FreeCrm.pages.ContactPage;
import com.qa.FreeCrm.pages.HomePage;
import com.qa.FreeCrm.pages.LoginPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class ContactDeletionStepSpec extends TestBase{

	HomePage hpg = new HomePage();
	HomePage hpg1 = new HomePage();
	
	
	
	@Given("^I am on the homepage page$")
	public void i_am_on_the_homepage_page() throws Throwable 
	{
		initialization();
	    String actualLoginPageTitle = driver.getTitle();
	    String expectedLoginPageTitle = "Cogmento CRM";
	    Assert.assertEquals(expectedLoginPageTitle, actualLoginPageTitle);
	}

	@When("^I retrieve contact detail \"([^\"]*)\"$")
	public void i_retrieve_contact_detail(String arg1) throws Throwable {
		hpg = new HomePage();
		hpg.searchBoxEntryActivation(arg1);
	}

	@Then("^I can delete the contact details successfully$")
	public void i_can_delete_the_contact_details_successfully() throws Throwable 
	{
		System.out.println("At second new Homepage reference");
		hpg1 = new HomePage();
		System.out.println("After second new Homepage reference");
		hpg1.selectSearchResultForAdam();
		System.out.println("After selectSearchResultForAdam");
		hpg1.deleteContactEntry();
		System.out.println("After deleteContactEntry");
	}
	
	
	
}
