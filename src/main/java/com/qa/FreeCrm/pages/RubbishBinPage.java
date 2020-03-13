package com.qa.FreeCrm.pages;

import org.openqa.selenium.support.PageFactory;
import com.qa.FreeCrm.TestBase.TestBase;
import org.openqa.selenium.support.FindBy;
import com.qa.FreeCrm.pages.ContactPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;


public class RubbishBinPage extends TestBase
{

	public RubbishBinPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//--/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/button[1]
		
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div/button[1]")
	WebElement purgeSelectButton;
	
						
	//@FindBy(linkText = "adam_first adam_middle adam_last")
	//WebElement adamLink;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]")
	WebElement adamLink;
	

	//--/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]
	//--/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div[3]/table/tbody/tr/td[2]
	//--/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div[3]/table/tbody/tr/td[2]/a
	//--	/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]
				   
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div[3]/table/tbody/tr[1]")
	WebElement selectFirstElementInTable;
	
	//--/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]
	//--/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[2]/td[2]
	
	
	public void selectPurgeSelectButton()
	{
		purgeSelectButton.click();	
	}
	
	
	public void purgeFirstElementInRubishBinTable()
	{
		selectFirstElementInTable.click();
	}
	
	
}
