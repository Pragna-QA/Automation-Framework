package com.learnautomation.testcases;

import org.testng.annotations.Test;
import com.learnautomation.dataProvider.CustomDataProvider;
import com.learnautomation.helper.BaseClass;
import com.learnautomation.pages.RegistrationPage;

public class RegistrationTest  extends BaseClass
{
	@Test
	public void newUserlink() 
	{
		RegistrationPage page = new RegistrationPage(driver);
		
		page.clickOnNewUserLink();		
	}
	
	@Test(dataProvider = "signup", dataProviderClass = CustomDataProvider.class)
	public void signUp(String fname,String mail,String paswrd1,String interests,String gen,String states,String hobby) throws InterruptedException
	{
		RegistrationPage register = new RegistrationPage(driver);
		//register.clickOnNewUserLink();
		//Thread.sleep(3000);
		register.createNewUser(fname, mail, paswrd1, interests, gen, states, hobby);
			
	}

}
