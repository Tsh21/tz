package com.igeek;

import java.util.ArrayList;

/**
 * @author zx
 * @date 2019年3月29日
 * @version 1.0
 * @description:
   *  集合
 * A:导包：import java.util.ArrayList;
 * B：指定数据类型
 * 
 * 
 */
public class Test01 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
		list.add(10);
		list.add(100);
		list.add(2000);
		//集合的长度
		int integer = list.size();
		
		System.out.println(integer);
		
		//遍历
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}


	}

}
