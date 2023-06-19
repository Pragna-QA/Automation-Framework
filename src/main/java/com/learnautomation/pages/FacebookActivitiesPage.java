package com.learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookActivitiesPage 
{
	protected WebDriver driver;
	
	public FacebookActivitiesPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	
	private By username = By.id("email");
	private By password = By.id("pass");
	private By loginButton = By.name("login");
	private By errorMessage=By.className("_9ay7");
	private By newUserLink=By.linkText("Create new account");
	private By FirstName = By.name("firstname");
	private By LastName = By.name("lastname");
	private By email = By.name("reg_email__");
	private By signuppwd = By.id("password_step_input");
	private By month = By.name("birthday_month");
	private By day = By.name("birthday_day");
	private By year = By.name("birthday_year");
	private By gender = By.name("sex");
	private By signup = By.name("websubmit");
	
	
	public void newUserLink()
	{
		driver.findElement(newUserLink).click();
		driver.findElement(FirstName).sendKeys("Pragna");
		driver.findElement(LastName).sendKeys("Rajesh");
		driver.findElement(email).sendKeys("rajeshpragna@gmail.com");
		driver.findElement(signuppwd).sendKeys("Daddy@123");
		driver.findElement(month).sendKeys("Feb");
		driver.findElement(day).sendKeys("10");
		driver.findElement(year).sendKeys("2023");
		driver.findElement(gender).sendKeys("Female");
		driver.findElement(signup).click();
	}
	
	public void loginToFacebook(String uname, String passwrd)
	{
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(passwrd);
		driver.findElement(loginButton).click();
	}
		
	
	public String captureErrorMessage()
	{
		String error_msg=driver.findElement(errorMessage).getText();
		
		return error_msg;
	}
	
	
}
