package com.qa.FreeCrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.FreeCrm.TestBase.TestBase;




public class ContactPage extends TestBase
{
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")
	WebElement newButton;
	
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="last_name")
	WebElement lastName;
	
	@FindBy(name="middle_name")
	WebElement middleName;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	WebElement companyName;
	
	//--old html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]
	//--/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]")
	WebElement companyNameFirstElement;
	
	//Save button
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/button[2]")
	WebElement saveBtn;
	
	
	
	public ContactPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void selectNewButton()
	{
		newButton.click();
	}
	
	
	
	public void selectSaveButton()
	{
		saveBtn.click();
	}
	
	public void setFirstName(String fname)
	{
		firstName.sendKeys(fname);		
	}
	
	public void setLastName(String lname)
	{
		lastName.sendKeys(lname);		
	}
	
	public void setMiddleName(String mname)
	{
		middleName.sendKeys(mname);		
	}
	
	
	public void setCompanyName(String cname)
	{
		companyName.sendKeys(cname);
		companyName.click();
		companyName.click();
	}
	
	public void selectSaveBtn()
	{
		saveBtn.click();
	}
	
	
	public void selectFirstOptionCompanyName()
	{
		System.out.println("In the selectFirstOptionCompanyName method");
		Boolean chkIfSelected = companyNameFirstElement.isDisplayed();
		System.out.println("Check if the option in the company name search is selected: " + chkIfSelected);
		if (chkIfSelected)
		{
			companyNameFirstElement.click();
		}
		else
		{
			System.out.println("Item has not been selected");
		}
		
		
		
	}	
	
	
	
	
}
