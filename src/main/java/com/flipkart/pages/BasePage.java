package com.flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	
	public WebDriver driver;
	
	public BasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public void verifyTitle(String etitle)
	{	
	WebDriverWait	wait = new WebDriverWait(driver, 10);
	try {
		wait.until(ExpectedConditions.titleIs(etitle));
		Reporter.log("Title is Matching:"+etitle);
	} catch (Exception e) {
		// TODO: handle exception
		Reporter.log("Title is not matching;Expected condition is:"+driver.getTitle(), true);
		Assert.fail();
	}
	}
	
	public void verifyElement(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is present:"+element, true);
			}
		catch (Exception e) {
			// TODO: handle exception
			Reporter.log("Element is Not present", true);
			Reporter.log("Msg is:"+element.getText(), true);
			Assert.fail();
		}
	}

}
