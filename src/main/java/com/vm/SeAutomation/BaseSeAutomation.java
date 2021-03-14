package com.vm.SeAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseSeAutomation {
	public static WebDriver driver;
	
	@BeforeSuite
	public void launchBrowser() throws MalformedURLException, InterruptedException {
		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
		DesiredCapabilities dc = new DesiredCapabilities().chrome();
		
		dc.setCapability("platform", Platform.UNIX);
		
		try {
			driver = new RemoteWebDriver(new URL("http://13.233.229.77:4444/wd/hub"), dc);
		} catch(UnreachableBrowserException e) {
			Thread.sleep(20000);
			driver = new RemoteWebDriver(new URL("http://13.233.229.77:4444/wd/hub"), dc);
		}
		
		
//		dc.setPlatform(Platform.WINDOWS);
//		driver = new RemoteWebDriver(new URL("http://siva266:7Wfwz8qNKAn9X4XyNTXE@hub.browserstack.com:80/wd/hub"), dc);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@BeforeTest
	public void launchApplication() {
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void killSession() {
		driver.quit();
	}

}
