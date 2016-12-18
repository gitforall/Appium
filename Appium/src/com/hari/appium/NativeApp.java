package com.hari.appium;

import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.jetty.html.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

 public class NativeApp{
	// private static AndroidDriver<WebElement> driver;

	
	@Test
	 public void whatsapp() throws MalformedURLException, InterruptedException{
		 
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		 capabilities.setCapability("deviceName", "My New Phone");
		 capabilities.setCapability("platformVersion", "6.0.1");
		 capabilities.setCapability("platformName", "Android");
		 capabilities.setCapability("appPackage", "io.selendroid.testapp");
		 capabilities.setCapability("appActivity", ".HomeScreenActivity");
		 AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		// driver = new AndroidDriver(new URL("http://127.0.0.1:4727/wd/hub"), capabilities);
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration")).click();
		 
		 driver.findElement(By.id("io.selendroid.testapp:id/inputUsername")).sendKeys("harinath");
		 //driver.findElement(By.id("io.selendroid.testapp:id/inputEmail")).sendKeys("harinath@gmail.com");
		// driver.findElement(By.id("io.selendroid.testapp:id/inputPassword")).sendKeys("harinath");
		 //driver.findElement(By.id("io.selendroid.testapp:id/inputName")).clear();
		 //driver.findElement(By.id("io.selendroid.testapp:id/inputName")).sendKeys("harinath");
		 Thread.sleep(5000L);
		 //org.openqa.selenium.support.ui.Select sel = new org.openqa.selenium.support.ui.Select(driver.findElement(By.className("android.widget.Spinner")));
		 //sel.selectByValue("Java");
		 driver.findElement(By.id("input_preferedProgrammingLanguage")).click();
		 driver.findElement(By.id("io.selendroid.testapp:id/input_adds")).click();
	 }
	 
 }