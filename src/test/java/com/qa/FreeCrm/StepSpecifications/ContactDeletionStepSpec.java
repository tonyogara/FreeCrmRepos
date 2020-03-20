package com.qa.FreeCrm.StepSpecifications;


import cucumber.api.java.en.Given;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.FreeCrm.TestBase.*;
import com.qa.FreeCrm.pages.ConfirmDeletePopupPage;
import com.qa.FreeCrm.pages.ConfirmPurgePopupPage;
import com.qa.FreeCrm.pages.HomePage;
import com.qa.FreeCrm.pages.RubbishBinPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ContactDeletionStepSpec extends TestBase
{

	HomePage hpg;
	RubbishBinPage rbpg;
	ConfirmDeletePopupPage cdpupg;
	ConfirmPurgePopupPage cppp;
	
	
	/*
	@Given("^I am on the login page$")
	public void i_am_on_the_homepage_page() throws Throwable 
	{
		System.out.println("Start of login");
		initialization();
	    String actualLoginPageTitle = driver.getTitle();
	    String expectedLoginPageTitle = "Cogmento CRM";
	    Assert.assertEquals(expectedLoginPageTitle, actualLoginPageTitle);
	    System.out.println("End of login");
	}
	*/
	
	@When("^I search contact details for \"([^\"]*)\"$")
	public void i_retrieve_contact_detail(String nameToBeSearched) throws Throwable {
		System.out.println("Start of retrieve contact");
		hpg = new HomePage();
		hpg.searchBoxEntryActivation(nameToBeSearched);
		System.out.println("End of retrieve contact");
	}
	
	@Then("^I can purge the contact \"([^\"]*)\" details successfully$")
	public void i_can_delete_the_contact_details_successfully(String contactToBeDeleted) throws Throwable
	{
		hpg = new HomePage();
		cppp = new ConfirmPurgePopupPage();
		rbpg = new RubbishBinPage();
		cdpupg = new ConfirmDeletePopupPage();
		hpg.searchForContactToDelete(contactToBeDeleted);
		hpg.deleteContactEntry();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement we = driver.findElement(By.xpath("//button[@class='ui red button']"));
		wait.until(ExpectedConditions.visibilityOf(we));
		
		cdpupg.selectContfirmDeleteBtn();
		//Need to select the rubbish bin icon
		//--/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/button[2]
		
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/button[2]")).click();
		
		//rbpg.purgeSpecifiedContact(contactToBeDeleted);
		//rbpg.selectPurgeSelectButton();
		rbpg.purgeSpecifiedContact(contactToBeDeleted);
		rbpg.selectPurgeSelectButton();
		cppp.selectDeleteForeverBtn();
	}
	
	
	
}
