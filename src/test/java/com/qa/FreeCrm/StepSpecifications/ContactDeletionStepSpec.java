package com.qa.FreeCrm.StepSpecifications;


import cucumber.api.java.en.Given;

import org.junit.Assert;

import com.qa.FreeCrm.TestBase.*;
import com.qa.FreeCrm.pages.ConfirmPurgePopupPage;
import com.qa.FreeCrm.pages.ContactPage;
import com.qa.FreeCrm.pages.HomePage;
import com.qa.FreeCrm.pages.LoginPage;
import com.qa.FreeCrm.pages.RubbishBinPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ContactDeletionStepSpec extends TestBase{

	HomePage hpg;
	RubbishBinPage rbpg;
	ConfirmPurgePopupPage cppp;
	//HomePage hpg = new HomePage();
	
	
	
	@Given("^I am on the homepage page$")
	public void i_am_on_the_homepage_page() throws Throwable 
	{
		System.out.println("Start of login");
		initialization();
	    String actualLoginPageTitle = driver.getTitle();
	    String expectedLoginPageTitle = "Cogmento CRM";
	    Assert.assertEquals(expectedLoginPageTitle, actualLoginPageTitle);
	    System.out.println("End of login");
	}

	
	@When("^I retrieve contact detail \"([^\"]*)\"$")
	public void i_retrieve_contact_detail(String nameToBeSearched) throws Throwable {
		System.out.println("Start of retrieve contact");
		hpg = new HomePage();
		hpg.searchBoxEntryActivation(nameToBeSearched);
		System.out.println("End of retrieve contact");
	}

	@Then("^I can delete the contact details successfully$")
	public void i_can_delete_the_contact_details_successfully() throws Throwable 
	{
		System.out.println("Start of delete");
		hpg = new HomePage();
		cppp = new ConfirmPurgePopupPage();
		hpg.selectSearchResultForAdam();
		hpg.deleteContactEntry();
		System.out.println("End of delete");
		rbpg = new RubbishBinPage();
		rbpg.purgeFirstElementInRubishBinTable();
		rbpg.selectPurgeSelectButton();
		cppp.selectDeleteForeverBtn();
		System.out.println("User should be successfully purged");
	}
	
	
	
}
