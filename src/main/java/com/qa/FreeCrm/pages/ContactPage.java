package com.qa.FreeCrm.pages;

import java.util.concurrent.TimeUnit;

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
	
	//THIS SEEMS TO BE IDENTIFYING THE CORRECT ELEMENT BUT IS NOT GETTING THE UPDATED TEXT OF THE NAME
	
				//--/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]
					//--/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]	
						//--/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[1]
	//*[@id="dashboard-toolbar"]/div[1]
				   
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[1]")
	WebElement savedContact;
		
	
	
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
		companyNameFirstElement.click();
	}
	
	public void selectSaveBtn()
	{
		saveBtn.click();
	}
	
	
	public String getSavedContactName()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return savedContact.getText();
	}
	
	
	public void selectFirstOptionCompanyName()
	{
		/*
		System.out.println("In the selectFirstOptionCompanyName method");
		Boolean chkIfEnabled = companyNameFirstElement.isEnabled();
		System.out.println("Check if the option in the company name search is ENABLED: " + chkIfEnabled);
		if (chkIfEnabled)
		{
			companyNameFirstElement.click();
		}
		else
		{
			System.out.println("Item has not been selected");
		}
		*/
		
		System.out.println("Got to end");
		
		
	}	
	
	
	
	
}
