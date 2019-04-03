package com.igeek.exe03;

public class Test02 {
	
	public static void main(String[] args) {
		double x = 10.5;
		double y = 2.5;
		
		double sum = sum(x, y);
		System.out.println(sum);
		
		int a = 10;
		int b = 20;
		System.out.println(sum(a,b));
	}
	
	public static <T extends Number> double sum(T a,T b) {
		return a.doubleValue()+b.doubleValue();
	}
	
}
