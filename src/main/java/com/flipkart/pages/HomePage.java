package com.flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.generic.GenericUtils;

public class HomePage extends BasePage{
	//Declaration
	@FindBy(xpath ="//span[.='Electronics']")private WebElement SelElectronics;
	@FindBy(xpath= "//a[@href='/samsung-mobile-store?otracker=nmenu_sub_Electronics_0_Samsung']")private WebElement selSamsung;
	
	//Initialization
	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void moveMouseToElement(WebDriver driver)
	{
	 GenericUtils.mouseOverActions(driver, SelElectronics);
	 
	}
	
	public void clickSamsung()
	{
		selSamsung.click();
	}

	public boolean verifyElement() {
		// TODO Auto-generated method stub
		verifyElement(SelElectronics);
		boolean displayed = SelElectronics.isDisplayed();
		return displayed;
	}
	
	
}
