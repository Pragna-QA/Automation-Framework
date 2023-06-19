package com.learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.learnautomation.helper.Utility;


public class RegistrationPage 
{
	

protected WebDriver driver;
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver = driver;
	}

	private By firstName = By.id("name");
	private By email = By.id("email");
	private By pwd = By.id("password");
	private By course = By.className("interest");
	private By gender = By.id("gender2");
	private By state1 = By.id("state");
	private By hobbies1 = By.id("hobbies");
	private By newUserLink=By.linkText("New user? Signup");
	private By submitButton = By.className("submit-btn");
	
	
	public  void clickOnNewUserLink() 
	{
		Utility.waitForElement(driver, newUserLink).click();		
	}

	public void createNewUser(String fname,String mail,String paswrd1,String interests,String gen,String states,String hobby) throws InterruptedException
	{
		
		Utility.waitForElement(driver, firstName).sendKeys(fname);
		Utility.waitForElement(driver, email).sendKeys(mail);
		Utility.waitForElement(driver, pwd).sendKeys(paswrd1);
		WebElement course=driver.findElement(By.xpath("//label[normalize-space()='"+interests+"']"));
		course.click();
		Utility.waitForElement(driver, gender).click();
		Utility.waitForElement(driver, state1).sendKeys(states);
		Utility.waitForElement(driver, hobbies1).sendKeys(hobby);
		driver.findElement(submitButton).click();
		Thread.sleep(3000);
	}

	public By getCourse() {
		return course;
	}

	public void setCourse(By course) {
		this.course = course;
	}

}
