package com.qa.FreeCrm.pages;

import org.openqa.selenium.support.PageFactory;
import com.qa.FreeCrm.TestBase.TestBase;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class RubbishBinPage extends TestBase
{

	public RubbishBinPage()
	{
		PageFactory.initElements(driver, this);
	}
	
				   
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/button[1]")
	private WebElement purgeSelectButton;

	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]")
	private WebElement adamLink;
					   
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]")
	private WebElement selectFirstElementInTable;
	
	
	public void selectPurgeSelectButton()
	{
		purgeSelectButton.click();	
	}
	
	
	public void purgeFirstElementInRubishBinTable()
	{
		selectFirstElementInTable.click();
		selectFirstElementInTable.sendKeys(Keys.RETURN);
	}
	
	
}
