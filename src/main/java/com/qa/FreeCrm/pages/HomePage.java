package com.qa.FreeCrm.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.FreeCrm.TestBase.TestBase;
import com.qa.FreeCrm.pages.ContactPage;
import org.openqa.selenium.WebElement;
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
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/button[2]")
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
	{
		String searchBoxText = searchBox.getText();
		System.out.println("Search box text is " + searchBoxText);
		searchBox.sendKeys(entryDetails);
		searchBox.sendKeys(Keys.ENTER);
	}
	
	
	public void selectSearchResultForAdam()
	{
		System.out.println("Before searchResultToBeDeleted");
		searchResultToBeDeleted.click();	
	}
	
	
	
	public void deleteContactEntry()
	{
		deleteBtn.click();
	}
	
}
