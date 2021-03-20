package com.vm.SeAutomationTraining;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleDropDown extends LaunchApplication{
	
	@Test
	public void verifyDropDown() {
		driver.get("https://www.salesforce.com/in/form/sem/crm-demo_b/?d=70130000000t1oC&DCMP=KNC-Google&Brand=yes&ef_id=Cj0KCQiAhP2BBhDdARIsAJEzXlF0JK5_J26we2KiexWMEbe-lUvf-5JyLbMD8Aw3gZ0Hhq-fJlfxgqsaAtvkEALw_wcB:G:s&s_kwcid=AL!4720!3!175755181402!e!!g!!salesforce&gclid=Cj0KCQiAhP2BBhDdARIsAJEzXlF0JK5_J26we2KiexWMEbe-lUvf-5JyLbMD8Aw3gZ0Hhq-fJlfxgqsaAtvkEALw_wcB");
		
		WebElement jobTitle = driver.findElement(By.name("UserTitle"));
		
		jobTitle.isDisplayed();
		
		assertTrue(jobTitle.isDisplayed());
		
		Select selctJobTilte = new Select(jobTitle);
		
//		selctJobTilte.selectByIndex(5);
//		
//		selctJobTilte.selectByValue("Developer");
		
		selctJobTilte.selectByVisibleText("Others");
		
		String actualSelctedOption = selctJobTilte.getFirstSelectedOption().getText();
		
		System.out.println("actualSelctedOption======" + actualSelctedOption);
		
		Assert.assertEquals(actualSelctedOption, "Others");
		
		List<WebElement> ele = driver.findElements(By.xpath("Test"));
		//[]
	}
	
	@Test
	public void test() {
		System.out.println("Test");
	}
	
	

}
