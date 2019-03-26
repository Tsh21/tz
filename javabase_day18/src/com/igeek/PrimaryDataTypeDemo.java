package com.igeek;

/**
 * @author zx
 * @date 2019年3月26日
 * @version 1.0
 * @description:基本类型对应的包装器类
 */
public class PrimaryDataTypeDemo {

	public static void main(String[] args) {
		// 定义基本数据类型
		int i = 10;
		// 定义引用类型10
		Integer i2 = new Integer(10);
		
		Integer i3 = 10;
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		//整数10的二进制
		String str = Integer.toBinaryString(12);
		System.out.println(str);

	}

}
