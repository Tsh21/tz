package com.igeek;

/**
 * @author zx
 * @date 2019年3月5日
 * @version 1.0
 * @description： 求阶乘n!
 * 5！=1*2*3*4*5=120
 * 5！= 4!*5
 * 
 * 考虑什么时候不调用自己！
 */
public class TestRecurison01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}
	
	public static long factorial(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n*factorial(n-1); //n* (n-1)!
		}
	}

}
