package com.qa.FreeCrm.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.FreeCrm.TestBase.TestBase;
import com.qa.FreeCrm.pages.ContactPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends TestBase 
{

	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div[1]/div")
	WebElement contactActivity;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/a[3]/span[1]")
	WebElement contactLink;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean contactActivityIsDisplayed()
	{
		return contactActivity.isDisplayed();
	}
	
	
	public ContactPage selectContactPageLink()
	{
		contactLink.click();
		return new ContactPage();
	}
	
	
	
	
}
