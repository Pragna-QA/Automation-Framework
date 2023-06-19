package com.learnautomation.sample;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport 
{

	@Test
	public void test1()
	{
		/*
		 * 	ExtentSparkReporter- FileName,Path,Config > Theme,Chart,ReportName,Title
		 * 
		 *  ExtentReports - Maintain Single Report- Main Class To Generate Report
		 *  
		 *  ExtentTest - Responsible to maintain test within report
		 * 				 logs
		 * 					PASS,FAIL,SKIP,FATAL,ERROR,Warning etc
		 * 					
		 *  flush()- ExtentReport- Writes to report
		 *  
		 *  MediaEntityBuilder - Screenshot
		 */
		
		
		//ExtentSparkReporter - This will be used once in a program
		ExtentSparkReporter reporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/AutomationReport.html");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("Automation Report");
		reporter.config().setDocumentTitle("Sprint1 Report");
		
		
		
		//Extentreports object we will use throughout the program
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		
		//Every time , we need test which is the reference of ExtentTest
		ExtentTest test1 = extent.createTest("Login");
		test1.log(Status.INFO, "User is able to enter emai");
		test1.log(Status.INFO, "User is able to enter pass");	
		test1.log(Status.INFO, "User is click on login button");	
		test1.log(Status.PASS, "User is not able to see dashboard");
		
		//If we have 100 steps, and one logevent is failing then the complete test is marked as FAILED 
		
		ExtentTest test2 = extent.createTest("Payment");
		test2.info("User is able to enter card details");
		test2.info("User is able to enter CVV details");
		test2.pass("OTP not Received");
		test2.fail("OTP not received", MediaEntityBuilder.createScreenCaptureFromPath("\\Users\\saipr\\OneDrive\\Desktop\\ImageWorking.jpg", "Current Status").build());
		
		
		ExtentTest test3 = extent.createTest("Logout");
		test3.info("User Clicked on LogOut");
		test3.skip("User is not able to see login page");
		
		
		
		extent.flush();
		
		
		
		/*
		 * test name - We need to take name dynamically- testMethod name will be our test name 
		 * log event - automatically - based on that we will call method 
		 * report name - report name should be with timestamp
		 * screenshot - If get the test status if fails then only call screenshot- screenshot of last event
		 */
		
		
		
		
}
}
