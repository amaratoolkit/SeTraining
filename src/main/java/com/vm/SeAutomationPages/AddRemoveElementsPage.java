package com.vm.SeAutomationPages;

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
	
	
	public boolean verifyAddRemoveHeading() {
		return addRemoveHHeading.isDisplayed();
	}
}
