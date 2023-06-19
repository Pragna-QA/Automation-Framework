package com.learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;

public class HomePage 
{
	protected  WebDriver driver;

	public  HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By username=By.id("email1");

	private By password=By.id("password1");
	
	private By loginButton=By.className("submit-btn");
	
	



	public void UserActivities(String uname,String pass)
	{

		//driver.findElement(username).sendKeys(uname);
		Utility.waitForWebElement(driver, username).sendKeys(uname);
		//driver.findElement(password).sendKeys(pass);
		Utility.waitForWebElement(driver, password).sendKeys(pass);
		//driver.findElement(loginButton).click();
		Utility.waitForWebElement(driver, loginButton).click();		
		
	}
}