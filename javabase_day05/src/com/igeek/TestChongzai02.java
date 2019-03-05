package com.igeek;

/**
 * @author zx
 * @date 2019年3月5日
 * @version 1.0
 * @description：
 */
public class TestChongzai02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		// 求和
		int result = (int) sum(a, b);
		System.out.println("result:" + result);

		int c = 30;
		// 求和
		//int result2 = sum2(a,b,c);
		//System.out.println("result2:"+result2);
		result = sum(a,b,c);
		System.out.println("result:"+result);


	}
	
	public static float sum(float a,float b) {
		return a + b;
	}

	public static int sum(int a,int b,int c) {
		return a + b + c;
	}


}
