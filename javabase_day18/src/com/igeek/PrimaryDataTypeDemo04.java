package com.igeek;

import java.util.ArrayList;

/**
 * @author zx
 * @date 2019年3月26日
 * @version 1.0
 * @description:
   *   装箱和拆箱测试
 */
public class PrimaryDataTypeDemo04 {

	public static void main(String[] args) {
		int i = 10;
		int i2 = 20;
		System.out.println(i + i2);
		
		//自动拆箱
		//运算符只能操作基本类型
		Integer i3 = new Integer(100);
		Integer i4 = new Integer(200);
		System.out.println(i3 + i4);
		
		//自动装箱
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);

	}

}
