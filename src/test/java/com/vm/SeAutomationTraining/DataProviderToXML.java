package com.vm.SeAutomationTraining;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

public class DataProviderToXML {

	@DataProvider(name = "automation1")
	public Object[][] dataProvider1() {
		return new Object[][] {{"Test Automation"}, {"Selenium Automation"}, {"Appium Automation"}};
	}
	
//	@Factory(dataProvider = "d")
//	public Object[] createInstances(String sIndex, String sData) {
//	return new Object[] {new TestKlazz(sIndex,sData)};
//	}

}
