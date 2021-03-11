package com.vm.javaPractice;

public class PolyMTestA extends PloyMTestB{
	public static PloyMTestB ployMTestB;
	
	public void calculate(int a, int b, int d, int e) {
		int c = a+b+d+e;
		int f = a+e;
		System.out.println("total value int ======"+ (c + f));
	}
	
//	public float sum(int a, float b) {
//		float c = a+b;
//		System.out.println("total value float ======"+ c);
//		return c;
//	}
	
	public int sum(int a, int b) {
		int c= a+b;
		System.out.println("total value long =======" + c);
		return c;
	}
	
	public long sum(int a, long b) {
		long c= a+b;
		System.out.println("total value long =======" + c);
		return c;
	}
	
	public void sum(int a, int b, int d) {
		int c= a+b+d;
		System.out.println("total value int 3 =======" + c);
	}
	
	public static void main(String[] args) {
		PolyMTestA pa = new PolyMTestA();
		PloyMTestB ployMTestB = new PolyMTestA();
		pa.calculate(10, 26,40,100);
		ployMTestB.calculate(10, 26,40,100);
	}

}
