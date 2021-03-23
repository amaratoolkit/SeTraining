package com.vm.SeAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonActionFunctions {
	WebDriver driver;
	
	public CommonActionFunctions(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void mouseHoverAndClick(WebElement sourceElement, WebElement destinationElement) {
		Actions mouseACtions = new Actions(driver);
		mouseACtions.moveToElement(sourceElement).build().perform();
		mouseACtions.moveToElement(destinationElement).click().build().perform();
	}

}
