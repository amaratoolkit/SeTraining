package com.vm.SeAutomationTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitVsExplicitWaits {
	public WebDriver driver;
	//@Test
	public void imPlicitWaitTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		// we should not use in the frameworks
		// If Element not found then it will wait 30secs and then it will through "NoSuchElementException"
		// If element found then it will continue execution
		// This command is applicable for all findElement method - this command will execute for every findElement method
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Title of the Page =====" + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("test")).click();
	}
	
	
	@AfterTest
	public void killSession() {
		driver.quit();
	}
	
	
	@Test 
	public void explicitWaitTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("test")));
		wait
		.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.name("username"))))
		.sendKeys("test@yopmail.com");
		
		String attributeOfEle = driver.findElement(By.cssSelector("div.login input[name='username']")).getAttribute("type");
		System.out.println("attributeOfEle =======" + attributeOfEle);
		
		//wait.until(ExpectedConditions.attributeContains(locator, attribute, value))
		wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//ul[@class='leftmenu']/li"), 5));
		
		System.out.println("Test");
		
	}
}
