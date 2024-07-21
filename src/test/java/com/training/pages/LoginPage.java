package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends BasePage {
public LoginPage(WebDriver driver) {
		super(driver);
	}
 
	@FindBy(id="username")
	WebElement Email;
	@FindBy(id="password")
	WebElement Password;
	@FindBy(id="Login")
	WebElement LoginButoon;

	public void EnterUserName_Email() {
		Email.sendKeys("sathyahariram@tekarch.com");
	}
	public void EnterPassword() {
		Password.sendKeys("Hellojuly@123");
	}
	public void ClickOnLogin() {
		LoginButoon.click();
	}
	

}
