package com.qa.FreeCrm.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.FreeCrm.TestBase.TestBase;
import com.qa.FreeCrm.pages.ContactPage;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class HomePage extends TestBase 
{

	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div[1]/div")
	private WebElement contactActivity;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/a[3]/span[1]")
	private WebElement contactLink;
				   
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/input[1]")
	private WebElement searchBox;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]")
	private WebElement searchResultCheckBox;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
	private WebElement searchResultToBeDeleted;
	
	
	@FindBy(xpath="//i[@class='trash icon']")
	private WebElement deleteBtn;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")
	private WebElement savedContact;
	
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
	{		String searchBoxText = searchBox.getText();		
		System.out.println("Search box text is " + searchBoxText);
		searchBox.sendKeys(entryDetails);
		searchBox.sendKeys(Keys.ENTER);
		
		
	}
	
	//Need to do a search for the contact to be deleted
	//At the moment it is just deleting a specific row
	//It needs to search for the row depending on the contact that was passed in through  
	//the feature file
	//public void selectSearchResultForAdam()
	public void searchForContactToDelete(String contactToDelete)
	{
		//System.out.println("Before searchResultToBeDeleted");
		//searchResultToBeDeleted.click();	
		
		//1. Loop through the list looking for contactToDelete
		//2. When found select the name
		//3. Then select the delete icon on the contact details page
		
		int tdCount = 1;
		int rowCount = 0;
		List <WebElement> contactList = driver.findElements(By.xpath(
				"//table[@class='ui celled selectable top attached table']//tbody//tr"));  
		
		for (WebElement ele : contactList) 
		{
			rowCount++;
			tdCount++;    
		    if(ele.getText().equalsIgnoreCase(contactToDelete))
		    {
		    	
		    	//a[contains(text(),'bob_first bob_middle bob_last')]
		    	//WebElement chkBoxEle = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr["+rowCount+"]/td["+tdCount+"]"));
		    	WebElement chkBoxEle = driver.findElement(By.xpath(
		    			"//a[contains(text(),'bob_first bob_middle bob_last')]"));
		    	chkBoxEle.click();	
		    	System.out.println("Got to here");
		    }		    	
		}
		
		
		
		
	}
	
	
	
	/*
	//Something like this
	public void purgeSpecifiedContact(String contactForDeletion)
	{		
		int checkBoxCount = 0;
		int rowCount = 0;
		List <WebElement> contactList = driver.findElements(By.xpath(
				"//table[@class='ui celled selectable top attached table']//tbody/tr"));  
		
		for (WebElement ele : contactList) 
		{
			rowCount++;
			checkBoxCount++;    
		    if(ele.getText().equalsIgnoreCase(contactForDeletion))
		    {
		    	WebElement chkBoxEle = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr["+rowCount+"]/td["+checkBoxCount+"]"));
				chkBoxEle.click();		
		    }		    	
		}		
	}
	*/
	
	public void deleteContactEntry()
	{
		deleteBtn.click();
	}
	
}
