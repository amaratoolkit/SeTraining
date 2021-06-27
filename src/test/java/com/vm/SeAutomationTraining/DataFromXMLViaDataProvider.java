package com.vm.SeAutomationTraining;

import org.testng.annotations.Test;

public class DataFromXMLViaDataProvider {
	
	@Test(dataProvider = "automation1", dataProviderClass = DataProviderToXML.class)
	public void dataProviderTest2(String name) {
		System.out.println("Data Provider driving the test and passing the values from Data Provider === " + name);
	}
	
	@Test(dependsOnMethods = "dataProviderTest2", dataProvider = "automation1", dataProviderClass = DataProviderToXML.class)
	public void dataProviderTest3(String name) {
		System.out.println("Data Provider driving the test and passing the values from Data Provider === " + name);
	}

}
