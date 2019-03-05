package com.igeek;

/**
 * @author zx
 * @date 2019年3月5日
 * @version 1.0
 * @description：
 * 需求：比较两个数据是否相等。
 * 		参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型，
 *     	并在main方法中进行测试

 */
public class TestChongzai03 {

	public static void main(String[] args) {
		System.out.println(compare(20, 20));
		System.out.println("-------------");
		System.out.println(compare((byte)10, (byte)20));
		System.out.println("-------------");
		System.out.println(compare((short)10, (short)20));
		System.out.println("-------------");
		//System.out.println(compare((long)10, (long)20));
		System.out.println(compare(10L, 20L));

	}
	
	static boolean compare(byte a,byte b){
		System.out.println("byte");
		return a==b;
	}
	
	static boolean compare(short a,short b){
		System.out.println("short");
		return a==b;
	}
	
	static boolean compare(int a,int b){
		System.out.println("int");
		return a==b;
	}
	
	static boolean compare(long a,long b){
		System.out.println("long");
		return a==b;
	}

}
