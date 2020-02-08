package com.qa.FreeCrm.StepSpecifications;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginCheckerStepSpec {

	@Given("^I am on the login page$")
	public void i_am_on_the_login_page() throws Throwable {
	    System.out.println("This is in the Given method - Step1AA");
	}

	@When("^I enter details$")
	public void i_enter_details() throws Throwable {
		System.out.println("This is in the When method - Step2BB");
	}

	@Then("^I see the logged in page$")
	public void i_see_the_logged_in_page() throws Throwable {
	    System.out.println("This is in the Then method - StepCC");
	}


	
	
	
}
