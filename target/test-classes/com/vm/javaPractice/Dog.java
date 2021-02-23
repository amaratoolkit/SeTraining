package com.vm.javaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dog {

	int height;
	String colour;
	WebDriver driver;

	public static void main(String args[]) {
		Dog dogObject = new Dog();

//		Dog dogObject;
//		dogObject = new Dog();

		dogObject.dogBarking();
		dogObject.dogRunnig();

//		dogBarking();
//		dogRunnig();
		int heightOfDog = dogObject.dogHeight();
		String colourOfDog = dogObject.dogColour();

		System.out.println("Dog Height = " + heightOfDog);
		System.out.println("Dog Colour = " + colourOfDog);
		
		dogObject.element().click();
	}

	public static void dogBarking() {
		System.out.println("Dog bark ");
	}

	public static void dogRunnig() {
		System.out.println("Dog run ");
	}

	public int dogHeight() {
		height = 2;
		return height;
	}

	public String dogColour() {
		colour = "Black";
		return colour;

	}
	
	public boolean rightOrWrong() {
		boolean flag = false;
		return flag;
	}
	
	public WebElement element() {
		return driver.findElement(By.id("SomeID"));
	}

}
