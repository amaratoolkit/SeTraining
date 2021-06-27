package com.vm.SeAutomationTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGParameterizingMultiple {
	WebDriver driver;
	@Test
	@Parameters({"url"})
	public void launchInternetPage(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	@AfterTest
	public void killSesion() {
		driver.quit();
	}

}
