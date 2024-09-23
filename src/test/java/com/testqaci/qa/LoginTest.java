package com.testqaci.qa;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import java.io.File;
import org.openqa.selenium.TakesScreenshot;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
 
  
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import com.testqaci.qa.BaseClass;
import com.testqaci.qa.LoginPage;

public class LoginTest extends BaseClass {
	private static Logger Logger = LogManager.getLogger(LoginTest.class);

//	public void browserlaunch() throws InterruptedException {
//
//		BaseClass.openbrowser();
//		Thread.sleep(5000);
//		extent.flush();
//
//	}

	@Test
	public void loginprocess() throws InterruptedException {
		BaseClass.openbrowser();
		Thread.sleep(5000);
		extent.attachReporter(spark); 
		ExtentTest test = extent.createTest("Login Process Verification");
		
		LoginPage LP = new LoginPage(BaseClass.driver);
		Logger.info("Add  credentials");

		LP.username();
		LP.Password();
		LP.LoginBTW();
     		test.pass("PASS"); 

		Logger.info("Login done now ");
		Thread.sleep(4000);
		extent.flush();
	}
	@AfterMethod
	public void Capturescreenshot() throws IOException {
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		system.out.println(system.getenv());
   	        System.out.println("Working Directory = " + System.getProperty("user.dir"));
		File dest=new File("/home/runner/work/qa-test/qa-test/screenshot/screenshot1.png");
		FileHandler.copy(source, dest);
		Logger.info("Taken Screenshot of Intake Page");
	}
 

}
