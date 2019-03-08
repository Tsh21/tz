package com.igeek;

public class TestStringBuilder02 {

	public static void main(String[] args) {
		
		String str = "";
		long num = Runtime.getRuntime().freeMemory();
		long time = System.currentTimeMillis();
		for (int i = 0; i < 5000; i++) {
			str += i;
		}
		long num2 = Runtime.getRuntime().freeMemory();
		long time2 = System.currentTimeMillis();
		System.out.println("String占用内存："+(num-num2));
		System.out.println("String占用时间:"+(time2-time));
		System.out.println("##############################");
		StringBuilder sb = new StringBuilder("");
		long num3 = Runtime.getRuntime().freeMemory();
		long time3 = System.currentTimeMillis();
		for (int j = 0; j < 5000; j++) {
			sb.append(j);
		}
		long num4 = Runtime.getRuntime().freeMemory();
		long time4 = System.currentTimeMillis();
		System.out.println("String占用内存："+(num3-num4));
		System.out.println("String占用时间:"+(time4-time3));

	}

}
