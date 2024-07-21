package com.training.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage 
{
    protected WebDriver driver;
    
	public BasePage(WebDriver driver)
	{
		this.driver= driver;
		// to initialize the elements : pagefactory
		PageFactory.initElements(driver, this);
	}
	
	public void  explicitwait(int time, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}