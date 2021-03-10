package com.vm.SeAutomationPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveElementsPage {

	public AddRemoveElementsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h3[text()='Add/Remove Elements']") 
	private WebElement addRemoveHHeading;
	
	@FindBy(xpath = "//*[@onclick='deleteElement()']")  
	private List<WebElement> deleteButtons;
	
	
	public boolean verifyAddRemoveHeading() {
		//deleteButtons.get(0).click();
		return addRemoveHHeading.isDisplayed();
	}
}
