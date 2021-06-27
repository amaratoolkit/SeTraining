package com.vm.SeAutomationTraining;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class TestNGParameterization extends LaunchApplication {

	@Test
	@Parameters({ "url", "searchText"})
	//public void testinParameters(@Optional("http://automationpractice.com/index.php")String appUrl, @Optional("Testing Selenium")String text) {
		public void testinParameters(String appUrl, String text) {
		driver.get(appUrl);

		driver.findElement(By.name("search_query")).sendKeys(text);

	}

}
