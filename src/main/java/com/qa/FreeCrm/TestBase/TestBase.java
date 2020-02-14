package com.qa.FreeCrm.TestBase;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.FreeCrm.util.TestUtil;


public class TestBase 
{

	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase()
	{
		try 
		{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/tony/FreeCrmWS/FreeCrmArId/src/main/java/com/qa/FreeCrm/config/config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();	
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}	
		
	
	public void initialization()
	{
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/tony/FreeCrmWS/FreeCrmArId/src/chromedriver-2");
			driver = new ChromeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("loginUrl"));
		
	}
	
	
	
	
}
