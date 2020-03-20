package com.qa.FreeCrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.FreeCrm.TestBase.TestBase;

public class ConfirmDeletePopupPage extends TestBase
{

	@FindBy(xpath = "//button[@class='ui red button']")
	WebElement deletionBtn;
	
	
	public ConfirmDeletePopupPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void selectContfirmDeleteBtn()
	{
		//wait until the elemet is visible
		
		
		deletionBtn.click();
	}
	
	
}
