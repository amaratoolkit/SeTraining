package com.vm.SeAutomationTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vm.SeAutomation.BaseSeAutomation;
import com.vm.SeAutomationPages.AddRemoveElementsPage;
import com.vm.SeAutomationPages.HomePage;

public class AddRemoveElementsTest extends BaseSeAutomation{
	
	public HomePage homePage;
	public AddRemoveElementsPage addRemoveElementsPage;
	
	@BeforeClass
	public void initilizePages() {
		homePage = new HomePage(driver);
		addRemoveElementsPage = new AddRemoveElementsPage(driver);
	}
	
	@Test
	public void verifyAddRemoveHeading() {
		homePage.clickOnAddRemoveLink();
		addRemoveElementsPage.verifyAddRemoveHeading();
		
	}

}
