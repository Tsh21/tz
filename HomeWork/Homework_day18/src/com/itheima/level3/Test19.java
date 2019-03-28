package com.itheima.level3;

/**
 * @author zx
 * @date 2019年3月28日
 * @version 1.0
 * @description:
 * 
 */
public class Test19 {

	public static void main(String[] args) {
		//系统的开始时间
		long start = System.currentTimeMillis();
//		testString();
		testStringBuilder();
		//系统的结束时间
		long end = System.currentTimeMillis();
		System.out.println("花费了："+(end-start));

	}
	
	public static void testString() {
		String str = "hello";
		for (int i = 0; i < 100000; i++) {
			str += "world";
		}
	}
	
	public static void testStringBuilder() {
		StringBuilder sb = new StringBuilder("hello");
		for (int i = 0; i < 100000; i++) {
			sb.append("world");
		}
		String newStr = sb.toString();
	}
	
	

}
