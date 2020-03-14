package com.qa.FreeCrm.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import org.junit.AfterClass;
import com.cucumber.listener.Reporter;
//import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import com.qa.FreeCrm.util.ConfigFileReader;


@RunWith(Cucumber.class) 
//{"classpath:features"},
@CucumberOptions(features={"src/main/resources/Features/ContactCreation.feature", "src/main/resources/Features/ContactDeletion.feature"},
//@CucumberOptions(features={"src/main/resources/Features/ContactCreation.feature"},
//@CucumberOptions(features={"src/main/resources/Features/ContactDeletion.feature"},
							glue="com.qa.FreeCrm.StepSpecifications",
							plugin = {"pretty", "html:target/cucumber",
									"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
							})




public class TestRunnerFreeCrm
{
	
	@AfterClass
	public static void writeExtentReport()
	{
		ConfigFileReader cfr = new ConfigFileReader();
		String reportConfigurationPath = cfr.prop.getProperty("reportConfigPath");
		Reporter.loadXMLConfig(reportConfigurationPath);
		
	}
	
}

