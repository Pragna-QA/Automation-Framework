package com.learnautomation.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomation.contsants.Constants;
import com.learnautomation.dataProvider.CustomDataProvider;
//import com.learnautomation.factory.BrowserFactory;
import com.learnautomation.helper.BaseClass;
import com.learnautomation.pages.LoginPage;


public class LoginTest  extends BaseClass
{
	
	//1 - Local Data Provider
	//2 - Keep Data Provoder in Seperate Class
	@Test(dataProvider = "users", dataProviderClass = CustomDataProvider.class)
	public void loginToApp(String uname, String pass)
	{
		
		LoginPage page = new LoginPage(driver);
		driver.manage().window().maximize();
		page.loginToApplication(uname, pass);
		//String errorMSG = page.captureErrorMessage();
		//boolean status = errorMSG.contains(Constants.userDoesNotExist);
		//Assert.assertTrue(status, "Error Message is displayed as Expected");
		Assert.assertTrue(page.captureErrorMessage().contains(Constants.userDoesNotExist), "Error Message is displayed as Expected");
	}
	
	
}
