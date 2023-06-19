package com.learnautomation.helper;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.learnautomation.dataProvider.FaceBookConfigReader2;
import com.learnautomation.factory.BrowserFactory;

public class FacebookBaseClass 
{
	public WebDriver driver;
	
	
	@BeforeClass
	public void setupApplication()
	{
		System.out.println("LOG:INFO - Running  Before Class - Setting up application");
		driver=BrowserFactory.startBrowser(FaceBookConfigReader2.getProperty("browser"), FaceBookConfigReader2.getProperty("url"));
	}
	
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("LOG:INFO - Running  After Class - Terminating the session");
		driver.quit();
	}

}
