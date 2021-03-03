package com.vm.SeAutomationTests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vm.SeAutomation.BaseSeAutomation;
import com.vm.SeAutomationPages.HomePage;



public class HomeTest extends BaseSeAutomation {
	
	public HomePage homePage;
	
	@BeforeClass
	public void initializePages() {
		homePage = new HomePage(driver);
	}
	
	@Test
	public void verifyHomePage() {
		String actualTitle = homePage.getTitleOfHomePage();
		
		Assert.assertEquals("The Internet", actualTitle);
		Assert.assertEquals("The Internet", actualTitle, "Title is incorrect");
	}

}
