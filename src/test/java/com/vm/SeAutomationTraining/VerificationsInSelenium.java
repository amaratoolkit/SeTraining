package com.vm.SeAutomationTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerificationsInSelenium extends LaunchApplication{
	
	String mrTitle = "Mr.";
	String mrsTitle = "Mrs.";
	
	@Test
	public void verifyElementsIsSelected() {
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("email_create")).sendKeys("test1234216@yopmail.com");
		
		driver.findElement(By.cssSelector(".icon-user.left")).click();
		
		//click on Mr
		
		driver.findElement(By.xpath("//div[normalize-space()='"+mrTitle+"']/label/div/span")).click();
		
		boolean mrTitleValue = driver.findElement(By.xpath("//div[normalize-space()='"+mrTitle+"']/label/div/span/input")).isSelected();
		boolean mrsTitleValue = driver.findElement(By.xpath("//div[normalize-space()='"+mrsTitle+"']/label/div/span/input")).isSelected();
		
		System.out.println("Is Selected ====== output value of tile ==== " + mrTitleValue + "  \n and Mrs tile value is ====" + mrsTitleValue);
		
		Assert.assertTrue(mrTitleValue, "Mr. radio is not selected");
		Assert.assertFalse(mrsTitleValue, "Mrs. radio is selected");
		//click on Mrs
		
		driver.findElement(By.xpath("//div[normalize-space()='"+mrsTitle+"']/label/div/span")).click();
		
		boolean mrTitleValue2 = driver.findElement(By.xpath("//div[normalize-space()='"+mrTitle+"']/label/div/span/input")).isSelected();
		boolean mrsTitleValue2 = driver.findElement(By.xpath("//div[normalize-space()='"+mrsTitle+"']/label/div/span/input")).isSelected();
		
//		boolean mrTitleValue1 = driver.findElement(By.xpath("//div[normalize-space()='"+mrTitle+"']/label/div/span")).isDisplayed();
//		boolean mrsTitleValue1 = driver.findElement(By.xpath("//div[normalize-space()='"+mrsTitle+"']/label/div/span")).isDisplayed();
		
		System.out.println("Is Selected ====== output value of tile ==== " + mrTitleValue2 + "  \n and Mrs tile value is ====" + mrsTitleValue2);
		
		
		
		
		//System.out.println("Is Displayed ====== output value of tile ==== " + mrTitleValue1 + "  \n and Mrs tile value is ====" + mrsTitleValue1);
		
		
		
	}
	
	
	@Test
	public void verifyCheckbox() {
		driver.get("https://www.salesforce.com/uk/form/signup/freetrial-sales-pe/");
		boolean checkboxStatus = driver.findElement(By.xpath("//*[starts-with(@aria-describedby,'SubscriptionAgreement')]/preceding-sibling::input")).isSelected();
		System.out.println("Initail status==========="+ checkboxStatus);
		Assert.assertFalse(checkboxStatus);
		
		driver.findElement(By.xpath("//*[starts-with(@aria-describedby,'SubscriptionAgreement')]")).click();
		
		boolean checkboxStatus1 = driver.findElement(By.xpath("//*[starts-with(@aria-describedby,'SubscriptionAgreement')]/preceding-sibling::input")).isSelected();
		
		System.out.println("after checked status======="+ checkboxStatus1);
		
		Assert.assertTrue(checkboxStatus1);
	}

}
