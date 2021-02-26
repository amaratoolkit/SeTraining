package com.vm.SeAutomationTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LauchApplication {
	public WebDriver driver;
	
	@BeforeSuite
	public void openBrowser() {
		//WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "/Users/sivareddyk/eclipse-workspace-Android/SeAutomationTraining/browserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication");
		
		// we should not use in the frameworks
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//make it zero
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		
	}

}
