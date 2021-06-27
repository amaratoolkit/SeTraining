package com.vm.SeAutomationTraining;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadOTP {
	
	@Test
	public void readOTP() throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://google.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open();");
		String parentWindowId = driver.getWindowHandle();
		Set<String> numberOfWindows = new HashSet<String>();

		numberOfWindows = driver.getWindowHandles();
		
		for (String window : driver.getWindowHandles()) {
			driver.switchTo().window(window);
		}
		
		driver.get("https://yopmail.com/");
		driver.findElement(By.cssSelector("#login")).sendKeys("testauto");
		driver.findElement(By.cssSelector("button.md")).click();
		driver.findElement(By.cssSelector("#refresh")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.cssSelector("#ifinbox")));
		driver.findElement(By.xpath("(//*[text()='qa@teledentistry.com'])[1]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.cssSelector("#ifmail")));
		Thread.sleep(5000);
		String otp = driver.findElement(By.xpath("//*[text()='Your Login OTP is:']/following-sibling::h3")).getText().trim();
		System.out.println("OTP ===== " + otp);
		driver.close();
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys(otp);
		
	}

}
