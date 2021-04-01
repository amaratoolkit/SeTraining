package com.vm.SeAutomationTraining;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UsingDataProvider extends LaunchApplication{
	
	@Test(dataProvider = "automation1", dataProviderClass = DataProviderTest.class)
	public void dataProviderTest2(String name) {
		System.out.println("Data Provider driving the test and passing the values from Data Provider === " + name);
	}
	
	@Test(dataProvider = "automation2", dataProviderClass = DataProviderTest.class)
	public void dataProviderTest1(String name) {
		System.out.println("Data Provider driving the test and passing the values from Data Provider === " + name);
	}
	
	@Test(dataProvider = "automation3", dataProviderClass = DataProviderTest.class)
	public void dataProviderTest3(String email, String password) {
		driver.findElement(By.cssSelector(".login")).click();
		driver.findElement(By.cssSelector("#email")).sendKeys(email);
		driver.findElement(By.cssSelector("#passwd")).sendKeys(password);
	}
}
