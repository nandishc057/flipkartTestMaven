package com.flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginHiddenDivPage extends BasePage{

	//Declaration
	@FindBy(xpath = "//input[@class=\"_2zrpKA\"]") private WebElement unNme;
	@FindBy(xpath = "//input[@class=\"_2zrpKA _3v41xv\"]")private WebElement pswd;
	@FindBy(xpath = "//button[.=\"Login\"]")private WebElement login;
	@FindBy(xpath = "//span[contains(text(),'password is incorrect')]")private WebElement errMsg;
	
	
	//Initialization
	public LoginHiddenDivPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void validTitle(String etitle)
	{
		verifyTitle(etitle);
	}
	
	public void enterUserName(String username)
	{
		unNme.sendKeys(username);
	}

	public void enterpassword(String password)
	{
		pswd.sendKeys(password);
	}
	
	public void clickLogin()
	{
		login.submit();
	}
	public String verifyErrorMessage()
	{
		verifyElement(errMsg);
		String aErrMsg = errMsg.getText();
		return aErrMsg;	
	}
	public boolean vloginElement()
	{
		verifyElement(login);
		boolean present = login.isDisplayed();
		return present;
	}

}
