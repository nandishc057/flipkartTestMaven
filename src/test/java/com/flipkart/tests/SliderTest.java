package com.flipkart.tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.flipkart.generic.BaseTest;
import com.flipkart.generic.ExeclData;
import com.flipkart.pages.HomePage;
import com.flipkart.pages.LoginHiddenDivPage;
import com.flipkart.pages.SamsungPage;

public class SliderTest extends BaseTest{
	

	  
	@Test
	public void testSliderA50axis() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  String logintitle = ExeclData.getData(file_path, "Sheet1", 1, 2);
		  String username = ExeclData.getData(file_path, "Sheet1", 1, 0);
		  String password = ExeclData.getData(file_path, "Sheet1", 1, 1);
		  LoginHiddenDivPage lp = new LoginHiddenDivPage(driver);
		  lp.enterUserName(username);
		  Reporter.log("Username: "+username, true);
		  lp.enterpassword(password);
		  Reporter.log("password:"+password, true);
		  lp.clickLogin();
		  
		  HomePage smsg = new HomePage(driver);
		  Thread.sleep(10000);
		  boolean elementDisplayed = smsg.verifyElement();
		  System.out.println(elementDisplayed);
		  smsg.moveMouseToElement(driver);
		  System.out.println("Before click");
		  smsg.clickSamsung();
		  System.out.println("After click");
		  SamsungPage sp = new SamsungPage(driver);
		  Thread.sleep(10000);
		  sp.moveSliderA(50);
		  Thread.sleep(10000);
		
	}
}


