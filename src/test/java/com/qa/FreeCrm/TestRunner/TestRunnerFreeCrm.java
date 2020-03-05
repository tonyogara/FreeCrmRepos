package com.qa.FreeCrm.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import java.io.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import com.qa.FreeCrm.util.ConfigFileReader;
import com.qa.FreeCrm.util.TestUtil;
import com.qa.FreeCrm.TestBase.TestBase;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/main/resources/Features/ContactCreation.feature", glue="com.qa.FreeCrm.StepSpecifications",
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
		//Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		Reporter.loadXMLConfig(reportConfigurationPath);
		
	}
	
}

