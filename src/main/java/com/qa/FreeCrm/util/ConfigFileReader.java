package com.qa.FreeCrm.util;

import com.qa.FreeCrm.TestBase.TestBase;

public class ConfigFileReader extends TestBase 
{

	
	public ConfigFileReader()
	{
	}
	
	
	public String getReportConfigPath(){
		String reportConfigPath = prop.getProperty("reportConfigPath");
		if(reportConfigPath!= null)
		{	
			return reportConfigPath;
		}	
		else
		{	
			throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
		}	
	}
}
