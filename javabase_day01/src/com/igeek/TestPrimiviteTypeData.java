package com.igeek;

/**
 * @author zx
 * @date 2019年2月27日
 * @version 1.0
 * @description：基本数据类型
 * 
 * 8进制：以0开头
 * 16进制：以0x开头
 * 2进制：以0b开头
 */
public class TestPrimiviteTypeData {

	public static void main(String[] args) {
		//测试整型变量
		int a = 15;
		int b = 015;
		int c = 0x15;
		int d = 0b1101;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		byte age =30;
		short salary = 30000;
		int population = 2000000000;//整型常量默认是int
		
		long goalPopulation = 7400000000L;//后面加L(l)就是Long型
		
	}

}
