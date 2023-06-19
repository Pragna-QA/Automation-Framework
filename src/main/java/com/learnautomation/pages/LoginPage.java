package com.learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.learnautomation.helper.Utility;
//import org.openqa.selenium.support.PageFactory;

//import pages.RegisterPage;



public class LoginPage {
	
	protected WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	private By newUserLink=By.linkText("New user? Signup");
	
	
	private By errorMessage=By.className("errorMessage");

	private By username=By.id("email1");

	private By password=By.id("password1");
	
	private By loginButton=By.className("submit-btn");
	
	private By firstName = By.id("name");
	private By email = By.id("email");
	private By pwd = By.id("password");
	//private By courses = By.id("63d176c7129d0b808b9bee8e");
	//private By courses = By.xpath("//label[normalize-space()='App Development']");
	private By interests = By.xpath("//input[@type='checkbox']");
	private By gender = By.id("gender2");
	private By state1 = By.id("state");
	private By hobbies1 = By.id("hobbies");
	
	
	public void loginToApplication(String uname,String pass)
	{

		//driver.findElement(username).sendKeys(uname);
		Utility.waitForWebElement(driver, username).sendKeys(uname);;
		//driver.findElement(password).sendKeys(pass);
		Utility.waitForWebElement(driver, password).sendKeys(pass);
		//driver.findElement(loginButton).click();
		Utility.waitForWebElement(driver, loginButton).click();		
	}
	
	
	public RegistrationPage clickOnNewUserLink() 
	{
		Utility.waitForElement(driver, newUserLink).click();
		RegistrationPage page = new RegistrationPage(driver);
		return page;
		
	}
	
	
	
	public String captureErrorMessage()
	{
		String error_msg=Utility.waitForWebElement(driver, errorMessage).getText();
		
		return error_msg;
	}
	
	
	public void createNewUser(String fname,String mail,String paswrd1,String course,String gen,String states,String hobby)
	{
		//driver.findElement(newUserLink).click();
		
		Utility.waitForElement(driver, firstName).sendKeys(fname);
		Utility.waitForElement(driver, email).sendKeys(mail);
		Utility.waitForElement(driver, pwd).sendKeys(paswrd1);
		Utility.waitForElement(driver, interests).sendKeys(course);
		Utility.waitForElement(driver, gender).click();
		Utility.waitForElement(driver, state1).sendKeys(states);
		Utility.waitForElement(driver, hobbies1).sendKeys(hobby);
	}

}
