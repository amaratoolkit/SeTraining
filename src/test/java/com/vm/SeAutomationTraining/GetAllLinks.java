package com.vm.SeAutomationTraining;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GetAllLinks extends LaunchApplication{
	
	@Test
	public void verifyAllLinks() {
		driver.get("http://the-internet.herokuapp.com/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		//System.out.println("allLinks =======" + allLinks);
		System.out.println("allLinks Size =======" + allLinks.size());
		
	
		
		List<String> links = new ArrayList<String>();	
		for (int i=0; i<allLinks.size(); i++ ) {
		links.add(allLinks.get(i).getAttribute("href"));
		
		}
		
		System.out.println("links ===" + links);
	}

}
