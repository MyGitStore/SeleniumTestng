package com.training.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

WebDriver driver;
	
	public WebDriver getDriver() {
		
		if(driver==null) {
			driver=new ChromeDriver();
		}
		return driver;
	}
	
	
	public void closebrowser(WebDriver driver) {
		driver.close();
	}
	
	

}
