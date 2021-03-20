package com.vm.SeAutomationTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandleFileUpload extends LaunchApplication{
	
	public WebDriverWait wait;
	public Alert jsAlert;
	@Test
	public void acceptJavaScriptAlert() throws InterruptedException {
		wait = new WebDriverWait(driver, 5);
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/");
		
		WebElement jsLink = driver.findElement(By.cssSelector("a[href='/upload']"));
		wait.until(ExpectedConditions.elementToBeClickable(jsLink)).click();
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("file-upload"))).click();
		Thread.sleep(5000);
		driver.findElement(By.name("file")).sendKeys("/Users/sivareddyk/Downloads/Lenox Test summary.xls.xlsx");
		
		System.out.println("Test");
		
	}

}
