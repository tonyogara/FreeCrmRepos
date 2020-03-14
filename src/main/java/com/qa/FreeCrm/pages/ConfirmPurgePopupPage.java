package com.qa.FreeCrm.pages;

import org.openqa.selenium.support.PageFactory;
import com.qa.FreeCrm.TestBase.TestBase;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;




public class ConfirmPurgePopupPage extends TestBase{
	
	
	@FindBy(xpath="/html/body/div[3]/div/div[3]/button[2]")
	private WebElement deleteForeverBtn;
	
	
	public ConfirmPurgePopupPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void selectDeleteForeverBtn()
	{
		deleteForeverBtn.click();	
	}

}
