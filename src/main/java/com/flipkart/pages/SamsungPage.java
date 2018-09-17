package com.flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class SamsungPage extends BasePage{
	
	//Declaration
	@FindBy(xpath="//h2[.='Latest Samsung mobiles ']//..//span[.='VIEW ALL']")private WebElement latestViewAll; 
	@FindBy(xpath="(//div[@class='_3aQU3C'])[1]")private WebElement sliderA;
	@FindBy(xpath="(//div[@class='_3aQU3C'])[2]")private WebElement sliderB;
	
	//Initialization
	public SamsungPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public void clickViewAllLatestPage()
	{
		latestViewAll.click();
		
	}
	public void moveSliderA(int xAxis)
	{
		Actions act = new Actions(driver);
		try {
			Thread.sleep(5000);
			act.clickAndHold(sliderA).moveByOffset(xAxis, 0).release(sliderA).perform();
			Reporter.log("Slider A Point is moved by:"+xAxis+" axis", true);
		} catch (Exception e) {
			// TODO: handle exception
			Reporter.log("Slider A Not moved to any Point", true);
			Assert.fail();
		}

	}

}
