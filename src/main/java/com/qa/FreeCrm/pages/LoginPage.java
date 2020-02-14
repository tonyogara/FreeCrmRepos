package com.qa.FreeCrm.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.FreeCrm.TestBase.TestBase;
import com.qa.FreeCrm.util.TestUtil;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPage extends TestBase 
{
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]")
	WebElement loginBtn;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/p[1]")
	WebElement invalidLoginMsg;

	

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void launchLoginPage()
	{
		initialization();
	}
	
	
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	
	public HomePage signIn(String emailDetails, String pwd)
	{
		email.sendKeys(emailDetails);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
	
	
	public void invalidSignIn(String emailDetails, String pwd)
	{
		email.sendKeys(emailDetails);
		password.sendKeys(pwd);
		loginBtn.click();
	}
	
	
	public String checkInvalidSignInMsg()
	{
		return invalidLoginMsg.getText();
	}
	
	
}
