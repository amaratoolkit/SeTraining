package com.vm.SeAutomationTraining;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreensotIfTestFails extends LaunchApplication {
	public TakeSceenshotTest takeSceenshotTest;
	@Test
	public void test() {
		driver.get("http://the-internet.herokuapp.com/");
		Assert.assertEquals(driver.getTitle(), "The Interne");
	}
	
	@AfterMethod
	public void getScreenshotIfTestFails(ITestResult iresult) throws IOException {
		takeSceenshotTest = new TakeSceenshotTest();
		if(ITestResult.FAILURE == iresult.getStatus()) {
			takeSceenshotTest.getScreenshotWhenTestFails(driver);
		}
	}
	

}
