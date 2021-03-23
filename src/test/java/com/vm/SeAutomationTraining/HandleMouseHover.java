package com.vm.SeAutomationTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandleMouseHover extends LaunchApplication{
	public WebDriverWait wait;
	@Test
	public void mouseHoverAndClickOnEleemnt() {
		wait = new WebDriverWait(driver, 5);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/");
		
		WebElement jsLink = driver.findElement(By.cssSelector("a[href='/hovers']"));
		wait.until(ExpectedConditions.elementToBeClickable(jsLink)).click();
		
		WebElement sourceElement = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
		WebElement destinationElement = driver.findElement(By.xpath("(//img[@alt='User Avatar']/../div/a)[2]"));
		mouseHoverAndClick(sourceElement, destinationElement);
		
		sum(100, 120);
		sum(4, 5);
	}
	
	
	public void mouseHoverAndClick(WebElement sourceElement, WebElement destinationElement) {
		Actions mouseACtions = new Actions(driver);
		
		
		mouseACtions.moveToElement(sourceElement).build().perform();
		mouseACtions.moveToElement(destinationElement).click().build().perform();
		//destinationElement.click();
		//mouseACtions.moveToElement(destinationElement).click();
		System.out.println("Test");
	}
	
	public void sum(int a, int b) {
		
		int c;
		c= a+b;
		System.out.println("C value ======" + c);
	}

}
