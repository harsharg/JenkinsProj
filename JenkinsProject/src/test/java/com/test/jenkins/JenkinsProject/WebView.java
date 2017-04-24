package com.test.jenkins.JenkinsProject;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.*;



/**
 * Unit test for simple App.
 */
public class WebView 

{
	
	 DesiredCapabilities capabilities = new  DesiredCapabilities();
	 AndroidDriver driver;
	 
	@Test(priority=1)
	 public void run()
	 {
		// TODO Auto-generated method stub
		

		 capabilities.setCapability("automationName", "Appium");
		 capabilities.setCapability("platformName", "Android");
		 capabilities.setCapability("deviceName", "Android Emulator");
		 capabilities.setCapability("platformVersion", "6.0");
		 capabilities.setCapability("--override-session",true);
		 capabilities.setCapability("newCommandTimeout",1200);
		 capabilities.setCapability("appPackage","io.selendroid.testapp");
         capabilities.setCapability("appActivity","io.selendroid.testapp.HomeScreenActivity"); 
         

	}
	
	@Test(priority=2)
	 public void execute() throws MalformedURLException
	 {
		// TODO Auto-generated method stub
		
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		 driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.EditText\")").sendKeys("harsha");
		// (By.xpath("[@class ='android.widget.EditText']")).sendKeys("harsha");
	//	 driver.findElement(By.cssSelector(".android.widget.EditText")).sendKeys("harsha");
		 
        

	}
	
	@AfterTest
	public void shutdown()
	{
		driver.quit();
	}
}
