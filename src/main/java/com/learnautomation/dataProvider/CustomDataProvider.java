package com.learnautomation.dataProvider;

import org.testng.annotations.DataProvider;

public class CustomDataProvider 
{

	//Use the Data provider in order to access the login credentials
	@DataProvider(name = "users")
	public static Object[][] getLoginData()
	{
		Object arr[][] = ExcelReader.getDataFromSheet("Credentials");
		return arr;
		
	}
	
	@DataProvider(name = "new")
	public static Object[][] getSignUpData()
	{
		Object arr[][] = ExcelReader.getDataFromSheet("UserSignUp");
		return arr;	
	}
	
	@DataProvider(name = "signup")
	public static Object[][] getUserSignUp()
	{
		Object arr[][] = ExcelReader.getDataFromSheet("Testing");
		return arr;	
	}
	
	
	
	@DataProvider(name = "useractivities")
	public static Object[][] getActivities()
	{
		Object arr[][] = UserActivitiesExcelReader2.getDataFromSheet("Activities");
		return arr;
		
	}
	
	
	@DataProvider(name = "useraddress")
	public static Object[][] getAddress()
	{
		Object arr[][] = UserActivitiesExcelReader2.getDataFromSheet("Address");
		return arr;
		
	}
	
	
	
}
