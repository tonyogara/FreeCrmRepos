package com.qa.FreeCrm.StepSpecifications;

import cucumber.api.java.en.Given;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.FreeCrm.TestBase.*;
import com.qa.FreeCrm.pages.ContactPage;
import com.qa.FreeCrm.pages.HomePage;
import com.qa.FreeCrm.pages.LoginPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit; 

public class CreateContactStepSpec extends TestBase 
{
	
	HomePage hpg;
	ContactPage contactPage;
	String savedContactName;
	Boolean nameFlag;
	
	
	
	
	@Given("^I am on the login page$")
	public void i_am_on_the_login_page() throws Throwable 
	{
	    initialization();
	    String actualLoginPageTitle = driver.getTitle();
	    String expectedLoginPageTitle = "Cogmento CRM";
	    Assert.assertEquals(expectedLoginPageTitle, actualLoginPageTitle);
	}
	
	
	@Given("^I enter login details$")
	public void i_enter_details() throws Throwable 
	{
		LoginPage lpge = new LoginPage();
		lpge.signIn(prop.getProperty("username"), prop.getProperty("password"));	    
	}

	@Given("^I see the logged in page$")
	public void i_see_the_logged_in_page() throws Throwable 
	{
		hpg = new HomePage();
	    Boolean checkContactActivityIsDisplayed = hpg.contactActivityIsDisplayed();
		Assert.assertTrue(checkContactActivityIsDisplayed);
	}

	@When("^I select the contact link$")
	public void i_select_the_contact_link() throws Throwable 
	{
	    hpg.selectContactPageLink();
	}

	@When("^select the New button$")
	public void select_the_New_button() throws Throwable 
	{
		contactPage = new ContactPage();
		contactPage.selectNewButton();
	}

	
	
	//@When("^user enters first name {fName} and last name {lName} and middle name {mName} and company name {comName}$")
	@When("^user enters first name \\\"(.*)\\\" and last name \\\"(.*)\\\" and middle name \\\"(.*)\\\" and company name \\\"(.*)\\\"$")
	public void user_enters(String fName, String lName, String mName, String comName) throws Throwable {
		contactPage = new ContactPage();
		contactPage.setFirstName(fName);
		contactPage.setLastName(lName);
		contactPage.setMiddleName(mName);
		//contactPage.setCompanyName(comName);
		//contactPage.selectFirstOptionCompanyName();
	}
	
	
	//@When("^user enters first name {fName} and last name {lName} and middle name {mName}$")
		@When("^user enters first name \\\"(.*)\\\" and last name \\\"(.*)\\\" and middle name \\\"(.*)\\\"$")
		public void user_enters(String fName, String lName, String mName) throws Throwable {
			contactPage = new ContactPage();
			contactPage.setFirstName(fName);
			contactPage.setLastName(lName);
			contactPage.setMiddleName(mName);
			//contactPage.setCompanyName(comName);
			//contactPage.selectFirstOptionCompanyName();
		}
	
	
	@When("^select save button$")
	public void select_save_button() throws Throwable 
	{
		contactPage = new ContactPage();
		contactPage.selectSaveBtn();
	}

	
	
	@Then("^the contact is saved successfully as saved \"([^\"]*)\"$")
	public void the_contact_is_saved_successfully_as_saved(String expectedFirstLastName) throws Throwable {
		contactPage = new ContactPage();	
		//savedContactName = contactPage.getSavedContactName();
		//Try to insert an explicit wait for the text to change..probably use an explicit wait
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[1]"), "Create New Contact")); 	
		savedContactName = contactPage.getSavedContactName();
		Assert.assertEquals(expectedFirstLastName, savedContactName);
	}

		
	
	
}
