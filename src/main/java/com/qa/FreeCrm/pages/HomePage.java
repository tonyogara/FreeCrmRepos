package com.qa.FreeCrm.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.FreeCrm.TestBase.TestBase;
import com.qa.FreeCrm.pages.ContactPage;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

//class='trash icon
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
	public void searchForContactToDelete(String contactToDelete) throws InterruptedException
	{
		System.out.println("In searchForContactToDelete");
		//searchResultToBeDeleted.click();	
		
		//1. Loop through the list looking for contactToDelete
		//2. When found select the name
		//3. Then select the delete icon on the contact details page
		
		int tdCount = 1;
		int rowCount = 0;
		System.out.println("After counts initialised");
		List <WebElement> contactList = driver.findElements(By.xpath(
				"//table[@class='ui celled selectable top attached table']//tbody//tr"));  
		System.out.println("After List <WebElement>");
		for (WebElement ele : contactList) 
		{
			System.out.println("Start of For loop");
			rowCount++;
			tdCount++;    
			System.out.println("Before If");
			String contact = ele.getText();
		    if(contact.equalsIgnoreCase(contactToDelete));
		    {
		    	System.out.println("Start of If");
		    	
		    	//getText
		    	//a[contains(text(),'bob_first bob_middle bob_last')]
		    	//WebElement chkBoxEle = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr["+rowCount+"]/td["+tdCount+"]"));
		    	WebElement chkBoxEle = driver.findElement(By.xpath(
		    			"//a[contains(text(),'bob_first bob_middle bob_last')]"));
		    	System.out.println("Before Thread");
		    	//Thread.sleep(3000);
		    	System.out.println("After Thread");
		    	System.out.println("Before Thread");
		    	chkBoxEle.click();	
		    	System.out.println("After click");
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
	
	public void deleteContactEntry() throws InterruptedException
	{
		
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOf(deleteBtn));
		//Thread.sleep(3000);
		
		deleteBtn.click();
	}
	
}
