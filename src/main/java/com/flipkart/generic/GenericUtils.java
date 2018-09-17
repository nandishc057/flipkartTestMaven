package com.flipkart.generic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GenericUtils {
	public static void getScreenShot(WebDriver driver, String name)
	{
		try {
			  TakesScreenshot t = (TakesScreenshot) driver;
			  File src = t.getScreenshotAs(OutputType.FILE);
			  FileUtils.copyFile(src, new File("./Screenshots/"+name+".png"));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void mouseOverActions(WebDriver driver, WebElement element)
	{
		try {
			Actions act = new Actions(driver);
			act.moveToElement(element).perform();
			} catch (Exception e) {
			// TODO: handle exception
			
		}
	}

}
