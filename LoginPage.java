package com.testqaci.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	
	@FindBy(xpath="//*[@id=\"username\"]")
	@CacheLookup
	private WebElement UN;
	@FindBy(xpath="//*[@id=\"password\"]")
	@CacheLookup
	private WebElement PA;
	@FindBy(xpath="//input[@id='Login']")
	@CacheLookup
	private WebElement LoginButton;
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void username() {

		UN.sendKeys("automation.testing@mckesson.com.cgatqa");
	}

	public void Password() {
		PA.sendKeys("newuser@1990");

	}
	public void LoginBTW() {
		LoginButton.click();

	}

}