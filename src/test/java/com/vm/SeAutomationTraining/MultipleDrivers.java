package com.vm.SeAutomationTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDrivers {
	WebDriver firefoxDriver;
	WebDriver chromeDriver;
	
	@BeforeSuite
	public void lauchBrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
		firefoxDriver = new FirefoxDriver();
		chromeDriver = new ChromeDriver();
	}
	
	
	@Test
	public void test() {
		chromeDriver.get("http://automationpractice.com/index.php");
		firefoxDriver.get("http://the-internet.herokuapp.com/");
	}

}
