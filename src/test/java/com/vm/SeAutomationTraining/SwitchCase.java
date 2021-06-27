package com.vm.SeAutomationTraining;

public class SwitchCase {

	public static void main(String[] args) {

		String month = "seven";
		String monthString = "";

		switch (month) {

		case "one":
			monthString = "1 - January";
			break;
		case "seven":
			monthString = "2 - February";
			break;
		}
		
		System.out.println(monthString);
	}

}
