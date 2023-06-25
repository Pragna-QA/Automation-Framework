package com.learnautomation.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomation.helper.FacebookBaseClass;
import com.learnautomation.pages.FacebookActivitiesPage;


public class FacebookActivitiesTest2 extends FacebookBaseClass
{

	@Test
	public void loginFacebook()
	{
		FacebookActivitiesPage page = new FacebookActivitiesPage(driver);
		page.loginToFacebook("pragnaa@gmail.com", "Pragna123@gmail.com");
		String FBerrorMSG=page.captureErrorMessage();
		boolean status = FBerrorMSG.contains("The email you entered isn’t connected to an account. Find your account and log in.");
		Assert.assertTrue(status, "Error Message is displayed as Expected");	
	}
	
	@Test
	public void signUpFacebook() 
	{
		FacebookActivitiesPage page1 = new FacebookActivitiesPage(driver);
		page1.newUserLink();
		
	}
	
	
}
