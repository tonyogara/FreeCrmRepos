package com.qa.FreeCrm.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.FreeCrm.TestBase.TestBase;
import com.qa.FreeCrm.pages.ContactPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;


public class HomePage extends TestBase 
{

	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div[1]/div")
	WebElement contactActivity;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/a[3]/span[1]")
	WebElement contactLink;
	
				   
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/input[1]")
	WebElement searchBox;
	
	//--/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]
	//--/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]")				
	//--/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]")
	WebElement searchResultCheckBox;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/button[2]")
	WebElement deleteBtn;
	
	
	//--/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")
	WebElement savedContact;
	
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
	
	
	public void searchBoxEntryActivation(String entryDetails)
	{
		String searchBoxText = searchBox.getText();
		System.out.println("Search box text is " + searchBoxText);
		searchBox.sendKeys(entryDetails);
		//driver.findElement(By.id("Value")).sendKeys(Keys.ENTER); 
		//driver.findElement(By.id("Value")).sendKeys(Keys.RETURN);
		searchBox.sendKeys(Keys.ENTER);
	}
	
	
	public void selectSearchResultForAdam()
	{
		
		Boolean chkSelected = searchResultCheckBox.isDisplayed();
		System.out.println("Check if searchResultCheckBox is displayed: " + chkSelected);
		Boolean checkIfBoxIsSelected = searchResultCheckBox.isSelected();
		System.out.println("Check if box is selected :" + checkIfBoxIsSelected);
		searchResultCheckBox.click();
		Boolean chkSelectedNow = searchResultCheckBox.isSelected();
		System.out.println("Check box selected is: " + chkSelectedNow);
	}
	
	
	
	public void deleteContactEntry()
	{
		deleteBtn.click();
	}
	
}
