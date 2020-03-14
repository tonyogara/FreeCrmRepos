package com.qa.FreeCrm.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.FreeCrm.TestBase.TestBase;




public class ContactPage extends TestBase
{
	

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")
	private WebElement newButton;
	
	
	@FindBy(name="first_name")
	private WebElement firstName;
	
	@FindBy(name="last_name")
	private WebElement lastName;
	
	@FindBy(name="middle_name")
	private WebElement middleName;
				   
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	private WebElement companyName;
				   	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]")
	WebElement companyNameFirstElement;
	
	//Save button
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/button[2]")
	WebElement saveBtn;	
				   
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
		return savedContact.getText();
	}
	
	
	public void selectFirstOptionCompanyName()
	{
		System.out.println("Got to end");
	}	
	
	
	
	
}
