package com.flipkart.generic;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConstant{
	 public WebDriver driver;
	 static {
		 System.setProperty(gecko_key, gecko_value);
		
	 }
	 @BeforeMethod
	public void preCondition() throws MalformedURLException
	 {
		 driver = new FirefoxDriver();
//		URL url = new URL("http://localhost:4444/wb/hub/");
//		DesiredCapabilities dc = new DesiredCapabilities();
//		dc.setBrowserName("gecko");
//		driver = new RemoteWebDriver(url, dc);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.flipkart.com/");
	 }
	 @AfterMethod
	 public void postCondition(ITestResult test)
		 {
			int sts = test.getStatus();
			if(sts == 2)
			{
				GenericUtils.getScreenShot(driver, test.getName());
				
			}
			 driver.close();

		 }


}
