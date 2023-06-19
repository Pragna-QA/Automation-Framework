package com.learnautomation.testcases;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomation.dataProvider.CustomDataProvider;
import com.learnautomation.helper.BaseClass;
import com.learnautomation.pages.CartPage;
import com.learnautomation.pages.HomePage;


public class UserActivitiesTest extends BaseClass
{
	
	@Test(dataProvider = "useractivities", dataProviderClass = CustomDataProvider.class)
	public void UserActiviesList(String uname, String pass)
	{
		HomePage page = new HomePage(driver);
		page.UserActivities(uname, pass);	
		
		
	}
	
	@Test
	public void cartActivities() throws InterruptedException
	{
		CartPage cart1 = new CartPage(driver);
		cart1.clickOnCart();
		
		String ExpectedCartURL = "https://freelance-learn-automation.vercel.app/cart";
		
		String ActualURL = driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(ActualURL, ExpectedCartURL);
		driver.findElement(By.xpath("//button[normalize-space()='Shop Now']")).click();
		System.out.println(driver.findElement(By.id("cardChip")).getText());		
		driver.findElement(By.xpath("(//button[contains(text(),'Add to Cart')])[1]")).click();
		cart1.clickOnCart();
		driver.findElement(By.xpath("//button[normalize-space()='Enroll Now']")).click();
		Thread.sleep(2000);	
	}
	
	
	@Test(dataProvider = "useraddress", dataProviderClass = CustomDataProvider.class)
	public void userDetails(String add, CharSequence[] number) throws InterruptedException
	{
		CartPage page1 = new CartPage(driver);
		page1.information(add, number);
		String ExpectedPrice = "200000";
		//driver.findElement(By.tagName("200000"));
		Assert.assertEquals(driver.findElement(By.tagName("200000")), ExpectedPrice);
		driver.findElement(By.xpath("//button[@class='action-btn']")).click();
		driver.findElement(By.xpath("//h4[@class='uniqueId']")).getText();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
	}

}
