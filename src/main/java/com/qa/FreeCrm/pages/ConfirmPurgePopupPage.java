package com.qa.FreeCrm.pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.FreeCrm.TestBase.TestBase;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;




public class ConfirmPurgePopupPage extends TestBase{
	//--/html/body/div[3]/div/div[3]/button[2]
	//--//button[text()='Delete Forever']
	@FindBy(xpath="//button[text()='Delete Forever']")
	private WebElement deleteForeverBtn;
	
	
	public ConfirmPurgePopupPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void selectDeleteForeverBtn()
	{
		//ISSue seems to be with this button wait
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(deleteForeverBtn));
		deleteForeverBtn.click();	
	}

}
