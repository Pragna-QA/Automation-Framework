package com.learnautomation.helper;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.learnautomation.dataProvider.ConfigReader;

import com.learnautomation.factory.BrowserFactory;

public class BaseClass 
{
	public WebDriver driver;
	
	@BeforeClass
	public void setupApplication()
	{
		System.out.println("LOG:INFO - Running  Before Class - Setting up application");
		
		driver=BrowserFactory.startBrowser(ConfigReader.getProperty("browser"), ConfigReader.getProperty("url"));
	}
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("LOG:INFO - Running  After Class - Terminating the session");
		try 
		{
			driver.quit();
		} catch (Exception e) {
			
			System.out.println("Could not release the socket"+e.getMessage());
		}
	}
	
}
