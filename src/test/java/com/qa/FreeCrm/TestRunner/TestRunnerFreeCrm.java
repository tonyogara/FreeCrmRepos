package com.qa.FreeCrm.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Features1", glue="com.qa.FreeCrm.StepSpecifications1", tags = {"@SmokeTest"},
							plugin = {"pretty", "html:target/cucumber"})

//Plugin={“com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html“})
///Users/tony/FreeCrmWS/FreeCrmArId/src/test/java/com/qa/FreeCrm/StepSpecifications


public class TestRunnerFreeCrm 
{
/*
	@AfterClassA
	public static void setup()
	{
		Reporter.loadXMLConfig(new File("src/main/resources/extent-config.xml"));
		//Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
		//Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
		Reporter.setSystemInfo("User Name", "Tony");
		Reporter.setSystemInfo("Application Name", "Test App ");
		Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
		Reporter.setSystemInfo("Environment", "Production");
		Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	}
*/		
	
	
}

