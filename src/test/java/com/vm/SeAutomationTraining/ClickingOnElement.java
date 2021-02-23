package com.vm.SeAutomationTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ClickingOnElement extends LauchApplication{
	
	@Test
	public void verifyABTest() {
		//driver.findElement(By.id("email")).sendKeys("SIva@yopmail.com");
		
		//driver.findElement(By.name("email")).sendKeys("SIva@yopmail.com");
		
		//driver.findElement(By.cssSelector(".is_required.validate.account_input.form-control")).sendKeys("SIva@yopmail.com");
		
		//driver.findElement(By.cssSelector(".icon-user.left")).click();
		
		driver.
		findElement(
				By.xpath("//span[normalize-space()='Create an account']"))
		.click();
		
	}
	

		

}
