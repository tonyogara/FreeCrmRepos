package com.qa.FreeCrm.StepSpecifications;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.qa.FreeCrm.TestBase.TestBase;
import com.qa.FreeCrm.pages.LoginPage;
import com.qa.FreeCrm.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import org.junit.Assert;
//import junit.framework.Assert;


public class LoginCheckerStepSpec extends TestBase{

	
	
public LoginCheckerStepSpec()
{		
	PageFactory.initElements(driver, this);
}
	
	//Valid login page
	@Given("^I am on the login page$")
	public void i_am_on_the_login_page() throws Throwable {
	    initialization();
	    String actualLoginPageTitle = driver.getTitle();
	    String expectedLoginPageTitle = "Cogmento CRM";
	    Assert.assertEquals(expectedLoginPageTitle, actualLoginPageTitle);
	}

	@When("^I enter details$")
	public void i_enter_details() throws Throwable {
		LoginPage lpge = new LoginPage();
		lpge.signIn(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("Have entered login/password and hit login button");
	}

	@Then("^I see the logged in page$")
	public void i_see_the_logged_in_page() throws Throwable {
	    HomePage hpg = new HomePage();
	    Boolean checkContactActivityIsDisplayed = hpg.contactActivityIsDisplayed();
	    System.out.println(checkContactActivityIsDisplayed);
	    //Boolean checkContactActivityIsDisplayed = false;
		Assert.assertTrue(checkContactActivityIsDisplayed);
		System.out.println("This is in the Then method - StepCCccccc");
	}
	
	
	
	
	//Invalid login page
	@When("^I enter incorrect details$")
	public void i_enter_incorrect_details() throws Throwable {
		LoginPage lpge = new LoginPage();
		lpge.signIn(prop.getProperty("invalid_username"), prop.getProperty("invalid_password"));
		System.out.println("Have entered incorrect login/password and hit login button");
	}

	@Then("^I see the failed login message$")
	public void i_see_the_failed_login_message() throws Throwable 
	{
		System.out.println("In the Then failed login msg method");
		LoginPage lpge2 = new LoginPage();
		String actualFailedLoginMsg = lpge2.checkInvalidSignInMsg();
		String expectedFailedLoginMsg = "Invalid login";
		Assert.assertEquals(expectedFailedLoginMsg, actualFailedLoginMsg);
		System.out.println("At the end of the Then login message" + actualFailedLoginMsg);
	}


	
	
}
