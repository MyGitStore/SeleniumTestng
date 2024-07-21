package com.training.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.LoginPage;
	public class LoginTest extends BaseTest {
		
		WebDriver driver;
		LoginPage loginpage;
		@BeforeMethod
		public void BeforeMethod() {
			driver=getDriver();
			driver.get("https://login.salesforce.com/");
			loginpage=new LoginPage(driver);
		}
		@Test(priority=1)
		public void LoginintoApplication() {
			loginpage.EnterUserName_Email();
			loginpage.EnterPassword();
			loginpage.ClickOnLogin();
		}
		
		
		
	 
		@AfterMethod
		public void AfterMethod() {
			driver.close();
		}
}
