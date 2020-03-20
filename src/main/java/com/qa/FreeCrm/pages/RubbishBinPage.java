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

	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]")
	private WebElement adamLink;
					
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]")
	private WebElement selectFirstElementInTable;
	
	
	public void selectPurgeSelectButton()
	{	
		purgeSelectButton.click();	
	}
		
	public void purgeSpecifiedContact(String contactForPurging)
	{		
		HomePage hopg = new HomePage();
		//hopg.searchForContactToDelete(contactForPurging);
		
		int checkBoxCount = 0;
		int rowCount = 0;
		List <WebElement> contactList = driver.findElements(By.xpath(
				"//table[@class='ui celled selectable top attached table']//tbody/tr"));  
		
		for (WebElement ele : contactList) 
		{
			rowCount++;
			checkBoxCount++;    
		    if(ele.getText().equalsIgnoreCase(contactForPurging))
		    {
		    	WebElement chkBoxEle = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr["+rowCount+"]/td["+checkBoxCount+"]"));
				chkBoxEle.click();		
		    }		    	
		}		
	}
	
	
}
