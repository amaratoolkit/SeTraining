package com.vm.SeAutomationPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vm.SeAutomation.CommonActionFunctions;

public class AddRemoveElementsPage {
	CommonActionFunctions commonActionFunctions;

	public AddRemoveElementsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		commonActionFunctions = new CommonActionFunctions(driver);
	}
	
	@FindBy(xpath = "//h3[text()='Add/Remove Elements']") 
	private WebElement addRemoveHHeading;
	
	@FindBy(xpath = "//*[@onclick='deleteElement()']")  
	private List<WebElement> deleteButtons;
	
	@FindBy (xpath = "")
	WebElement sourceElement;
	
	@FindBy (xpath = "")
	WebElement destinationElement;
	
	public boolean verifyAddRemoveHeading() {
		//deleteButtons.get(0).click();
		return addRemoveHHeading.isDisplayed();
	}
	
	public void verifySomething() {
		commonActionFunctions.mouseHoverAndClick(sourceElement, destinationElement);
	}
}
