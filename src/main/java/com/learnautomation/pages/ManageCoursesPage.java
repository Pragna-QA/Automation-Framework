package com.learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;

public class ManageCoursesPage 
{
	
	protected WebDriver driver;
	public ManageCoursesPage(WebDriver driver)
	{
		this.driver = driver;
	}

	
	By shopNow = By.linkText("Shop Now");
	By addButton = By.className("course-card row");
			
//(//div[@class='course-card row'])[1]
	
	
	public void ManageCourse()
	
	{
		Utility.waitForElement(driver, addButton);
	}
}
