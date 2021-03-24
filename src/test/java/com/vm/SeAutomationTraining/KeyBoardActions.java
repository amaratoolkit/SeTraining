package com.vm.SeAutomationTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class KeyBoardActions extends LaunchApplication{
	
	@Test
	public void keyBoardActionTest() {
		WebElement searchBox = driver.findElement(By.cssSelector("input[value='search'] + input + input + input"));
		searchBox.sendKeys("Test");
		searchBox.sendKeys(Keys.ENTER);
		
		searchBox.submit();
		System.out.println("Test");
	}
	

}
