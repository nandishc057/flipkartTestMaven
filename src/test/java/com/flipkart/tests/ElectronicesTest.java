package com.flipkart.tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.flipkart.generic.BaseTest;
import com.flipkart.generic.ExeclData;
import com.flipkart.pages.HomePage;
import com.flipkart.pages.LoginHiddenDivPage;

public class ElectronicesTest extends BaseTest{
	@Ignore
	public void testSamsungElec() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		  String logintitle = ExeclData.getData(file_path, "Sheet1", 1, 2);
		  String username = ExeclData.getData(file_path, "Sheet1", 1, 0);
		  String password = ExeclData.getData(file_path, "Sheet1", 1, 1);
			 LoginHiddenDivPage lp = new LoginHiddenDivPage(driver);
			 Reporter.log(logintitle, true);
			 lp.verifyTitle(logintitle);
			 Reporter.log(logintitle, true);
			 lp.enterUserName(username);
			 Reporter.log("Username: "+username, true);
			 lp.enterpassword(password);
			 Reporter.log("password:"+password, true);
//			 boolean st = lp.vloginElement();
//			 System.out.println(st);
//			 Thread.sleep(2000);
			 lp.clickLogin();
			 Thread.sleep(1000);
	HomePage smsg = new HomePage(driver);
	boolean elementDisplayed = smsg.verifyElement();
	System.out.println(elementDisplayed);
	smsg.moveMouseToElement(driver);
	Thread.sleep(5000);
	smsg.clickSamsung();
	Thread.sleep(5000);
	}

}
