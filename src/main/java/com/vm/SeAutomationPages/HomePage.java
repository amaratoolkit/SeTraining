package com.vm.SeAutomationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Add/Remove Elements']")
	private WebElement addRemoveLink;
	
	@FindBy(xpath = "//a[text()='A/B Testing']")
	private WebElement abTestLink;
	
	public void clickOnAddRemoveLink() {
		addRemoveLink.click();
	}
	
	public void clickOnABTestLink() {
		abTestLink.click();
	}

}
