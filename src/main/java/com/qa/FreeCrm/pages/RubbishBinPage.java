package com.qa.FreeCrm.pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.FreeCrm.TestBase.TestBase;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class RubbishBinPage extends TestBase
{

	public RubbishBinPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//--/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/button[1]
	//i[@class='red trash alternate outline icon']
	//i[@class='trash alternate outline icon']']
	//i[@class='trash alternate outline icon']
	//i[@class='trash alternate outline icon']
	//button[contains(text(),'Purge Selected')]
	@FindBy(xpath="//button[contains(text(),'Purge Selected')]")
	private WebElement purgeSelectButton;

	
//	driver.findElement(By.xpath(
//			"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/button[2]")).click();
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/button[2]")
	private WebElement rubbishBinIcon;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]")
	private WebElement adamLink;
					
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]")
	private WebElement selectFirstElementInTable;
	
	
	public void selectPurgeSelectButton()
	{	
		purgeSelectButton.click();	
	}
	
	
	public void selectRubbishBinIcon()
	{
		rubbishBinIcon.click();
		//Assertion here to check that the red rubbis bin icon is displayed
		WebDriverWait wait = new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.visibilityOf(purgeSelectButton));
		System.out.println("Purged Select button should now be displayed");
	}
	
	
	public void purgeSpecifiedContact(String contactForPurging) throws InterruptedException
	{		
		HomePage hopg = new HomePage();
		//hopg.searchForContactToDelete(contactForPurging);
		
		int checkBoxCount = 0;
		int rowCount = 0;
		Thread.sleep(3000); //Works with this...need a wait statement here
		List <WebElement> contactList = driver.findElements(By.xpath(
				"//table[@class='ui celled selectable top attached table']//tbody/tr"));  
		//Thread.sleep(3000); // Does not work when here
		for (WebElement ele : contactList) 
		{
			System.out.println("Value of contactList count is : " + contactList.size());
			rowCount++;
			System.out.println("Value of rowcount is : " + rowCount);
			checkBoxCount++;  
			System.out.println("Value of checkBoxCount is : " + checkBoxCount);
			String contactElement = ele.getText();
			System.out.println("Value of contactElement is :" + contactElement);
	    	System.out.println("Value of contactForPurging is :" + contactForPurging);
		    if(contactElement.equalsIgnoreCase(contactForPurging))
		    {
		    	System.out.println("Inside if statement");
		    	WebElement chkBoxEle = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr["+rowCount+"]/td["+checkBoxCount+"]"));
		    	System.out.println("Before selecting the row checkbox");
		    	chkBoxEle.click();	
		     	System.out.println("After selecting the row checkbox");
		    }		    	
		}		
	}
	
	
}
