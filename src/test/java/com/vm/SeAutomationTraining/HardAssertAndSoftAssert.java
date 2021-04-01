package com.vm.SeAutomationTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertAndSoftAssert extends LaunchApplication {

	@Test
	public void verifySoftAssert() {
		SoftAssert sa = new SoftAssert();
		

		sa.assertTrue(driver.findElement(By.cssSelector(".logo.img-responsive")).isDisplayed());
		// verify
		sa.assertEquals(driver.findElement(By.tagName("b")).getText(), "Cart");
		//verify
		sa.assertEquals(driver.findElement(By.xpath("//*[@title='Contact Us']")).getText(), "Contact");
		
		//boolean ele = driver.findElement(By.linkText("Cart")).isDisplayed();
		//sa.assertFalse(ele);
		//sa.assertFalse(driver.findElement(By.partialLinkText("Contact")).isDisplayed());
		//Assert.assertTrue(false);
		sa.assertAll();
	}
}
