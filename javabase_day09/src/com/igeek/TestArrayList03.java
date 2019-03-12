package com.igeek;

import java.util.ArrayList;

/**
 * @author zx
 * @date 2019年3月11日
 * @version 1.0 @description：
 *  集合的遍历思想和数组的遍历思想相同 
 *  循环遍历容器,依次取出里面的元素即可
 */
public class TestArrayList03 {

	public static void main(String[] args) {
		// 创建集合对象
		ArrayList<String> array = new ArrayList<String>();

		// 添加元素
		array.add("hello");
		array.add("world");
		array.add("java");
		
		System.out.println(array.get(0));
		System.out.println(array.get(1));
		System.out.println(array.get(2));
		System.out.println("###############");
		
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}

	}

}
