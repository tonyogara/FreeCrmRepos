package com.qa.FreeCrm.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import java.io.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
//@CucumberOptions(features="src/main/resources/Features/ContactCreation.feature", glue="StepSpecs", 
@CucumberOptions(features="src/main/resources/Features/ContactCreation.feature", glue="com.qa.FreeCrm.StepSpecifications",
							plugin = {"pretty", "html:target/cucumber"})

//Plugin={“com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html“})
///Users/tony/FreeCrmWS/FreeCrmArId/src/test/java/com/qa/FreeCrm/StepSpecifications


public class TestRunnerFreeCrm 
{
	
	
	
}

