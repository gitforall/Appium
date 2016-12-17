package com.hari.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class test {

	
	@Test
	public void test1() throws MalformedURLException, InterruptedException{

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "NexusOne");
		capabilities.setCapability("version", "6.0.1");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.get("http://www.facebook.com");

		//driver.quit();
	}
	
}
