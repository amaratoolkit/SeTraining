package com.vm.SeAutomationTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {
	public WebDriver driver;
	
	@BeforeSuite
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "/Users/sivareddyk/eclipse-workspace-Android/SeAutomationTraining/browserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://automationpractice.com/");
		driver.manage().deleteAllCookies();
		// we should not use in the frameworks
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//make it zero
		//driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		System.out.println("");
		
		
	}
	
	@AfterSuite
	public void killsession() {
	driver.quit();
	}

}
