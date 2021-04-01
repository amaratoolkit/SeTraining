package com.vm.SeAutomationTraining;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@DataProvider(name = "automation1")
	public Object[][] dataProvider1() {
		return new Object[][] {{"Test Automation"}, {"Selenium Automation"}, {"Appium Automation"}};
	}

	@DataProvider(name = "automation2")
	public Object[][] dataProvider2() {
		return new Object[][] {{"Azure Automation"}, {"AWS Automation"}, {"GCP Automation"}};
	}
	

	@DataProvider(name = "automation3")
	public Object[][] dataProvider3() {
		return new Object[][] {{"siva@yopmail.com","Azure Automation"}, {"siva@yopmail.com", "AWS Automation"}, {"siva@yopmail.com", "GCP Automation"}};
	}

}
