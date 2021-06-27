package com.vm.SeAutomationTests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class Time {

	@Test
	public void test() throws InterruptedException {
		long startTime = System.nanoTime();
		System.out.println(startTime);

		Thread.sleep(3500);
		long endTime = System.nanoTime();
		System.out.println(endTime);

		long totalTime = endTime - startTime;
//        System.out.println("nano seconds " + totalTime);
//        float seconds = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
//        System.out.println("Time  -- Seconds ------ " + seconds);
		// convert to nanoseconds
		float seconds = (float) totalTime / 1000000000;
		System.out.println(totalTime + " in seconds is " + seconds);
	}

}
