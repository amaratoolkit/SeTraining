package com.vm.javaPractice;

public class PloyMTestB {
	
	public void calculate(int a, int b, int d, int e) {
		int c = a+b+d+e;
		System.out.println("total value int ======"+ c);
	}

	public static void main(String[] args) {
		PloyMTestB pa = new PloyMTestB();
		pa.calculate(10, 26,40,100);
	}
}
