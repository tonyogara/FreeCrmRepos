package com.qa.FreeCrm.pages;

import org.openqa.selenium.support.PageFactory;

import com.qa.FreeCrm.TestBase.TestBase;
import org.openqa.selenium.support.FindBy;
import com.qa.FreeCrm.pages.ContactPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;



public class ConfirmPurgePopupPage extends TestBase{
	
	
		//-- 			/html[1]/body[1]/div[3]/div[1]/div[3]/button[2]
		//--		   /html/body/div[3]/div/div[3]/button[2]
	@FindBy(xpath="/html/body/div[3]/div/div[3]/button[2]")
	WebElement deleteForeverBtn;
	
	
	public ConfirmPurgePopupPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void selectDeleteForeverBtn()
	{
		deleteForeverBtn.click();	
	}

}
