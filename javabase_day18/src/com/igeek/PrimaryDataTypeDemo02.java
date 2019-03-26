package com.igeek;

public class PrimaryDataTypeDemo02 {
	
	public static void main(String[] args) {
		//基本类型转成Integer对象
		//构造一个新分配的 Integer 对象，它表示指定的 int 值。
		Integer i1 = new Integer(10);
		//返回一个表示指定的 int 值的 Integer 实例
		Integer i2 = Integer.valueOf(10);
		
		//Integer对象转成int
		int a = i1.intValue();
		
		//字符串转成Integer对象
		Integer b1 = Integer.parseInt("334");
		Integer b2 = new Integer("233");
		
		//Integer对象转成字符串
		String str = b1.toString();
		
	}
}
