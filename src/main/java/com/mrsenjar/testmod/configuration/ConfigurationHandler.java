package com.mrsenjar.testmod.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler 
{
	public static void init(File configFile)
	{
		
		//Create the configuration object from the given file
		Configuration configuration = new Configuration(configFile);
		boolean testConfigValue = false;
		
		try
		{
			//Load the configuration File
			configuration.load();
			
			//Read in properties from File
			testConfigValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an exaple config value").getBoolean(true);
			
		}
		catch (Exception c)
		{
			//Log the exception
			
		}
		finally
		{
			//save the configuration file
			configuration.save();
		}
		//System.out.println(testConfigValue);
	}
}
