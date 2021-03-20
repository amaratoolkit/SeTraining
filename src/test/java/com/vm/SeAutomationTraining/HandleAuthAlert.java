package com.vm.SeAutomationTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandleAuthAlert extends LaunchApplication{
	
	public WebDriverWait wait;
	public Alert jsAlert;
	@Test
	public void acceptJavaScriptAlert() {
		wait = new WebDriverWait(driver, 5);
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/");
		
		WebElement jsLink = driver.findElement(By.cssSelector("a[href='/digest_auth']"));
		wait.until(ExpectedConditions.elementToBeClickable(jsLink)).click();
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/digest_auth");
		
		System.out.println("Test");
		
	}

}
