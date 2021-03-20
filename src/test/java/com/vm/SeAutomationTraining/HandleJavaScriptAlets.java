package com.vm.SeAutomationTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandleJavaScriptAlets extends LaunchApplication{
	public WebDriverWait wait;
	public Alert jsAlert;
	@Test
	public void acceptJavaScriptAlert() {
		wait = new WebDriverWait(driver, 5);
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/");
		
		WebElement jsLink = driver.findElement(By.cssSelector("a[href='/javascript_alerts']"));
		wait.until(ExpectedConditions.elementToBeClickable(jsLink)).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[onclick='jsAlert()']"))).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		jsAlert = driver.switchTo().alert();
		//Alert alert = 
		
		jsAlert.accept();
		

	}
	
	@Test(dependsOnMethods = "acceptJavaScriptAlert")
	public void cancelAlert() {
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[onclick='jsConfirm()']"))).click();
		jsAlert.dismiss();
	}
	
	@Test(dependsOnMethods = "cancelAlert")
	public void enterValueInThePromt() {
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[onclick='jsPrompt()']"))).click();
		jsAlert.sendKeys("TestAutomation");
		jsAlert.accept();
	}

}
