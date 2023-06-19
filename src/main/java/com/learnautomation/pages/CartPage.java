package com.learnautomation.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;

public class CartPage 
{
	
	protected WebDriver driver;
	
	public CartPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By cart = By.className("cartBtn");
		
	private By address = By.id("thumbnail");
	private By phnumber = By.id("name");

	public void clickOnCart()
	{
		Utility.waitForElement(driver, cart).click();
	}
	
	
	public void information(String add, CharSequence[] number)
	{
		Utility.waitForElement(driver, address).sendKeys(add);
		Utility.waitForElement(driver, phnumber).sendKeys(number);
	}
}
