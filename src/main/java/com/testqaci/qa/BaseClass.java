package com.testqaci.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {

	static ExtentSparkReporter spark = new ExtentSparkReporter("Extentreport.html");
	public static ExtentReports extent = new ExtentReports();

	protected static WebDriver driver;

	public static void openbrowser() {



		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--headless=new");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		try {

			driver.get("https://ability-data-1503--cgatqa.sandbox.my.salesforce.com/");

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
