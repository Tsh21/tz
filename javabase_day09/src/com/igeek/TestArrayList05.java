package com.igeek;

import java.util.ArrayList;

/**
 * @author zx
 * @date 2019年3月11日
 * @version 1.0 @description： 
 * 给定一个字符串数组：{“张三丰”,“宋远桥”,“张无忌”,“殷梨亭”,“张翠山”,“莫声谷”}，
 * 将数组中的元素添加到集合中，并把所有姓张的人员打印到控制台上
 */
public class TestArrayList05 {

	public static void main(String[] args) {
		
		//定义字符串数组
		String[] strArray = {"张三丰","宋远桥","张无忌","殷梨亭","张翠山","莫声谷"};
		
		// 创建集合对象
		ArrayList<String> array = new ArrayList<String>();
		
		for (int i = 0; i < strArray.length; i++) {
//			String temp = strArray[i];
			array.add(strArray[i]);
		}

		// 添加字符串元素
//		array.add("向问天");
//		array.add("刘正风");
//		array.add("左冷禅");
//		array.add("风清扬");
//		array.add("张无忌");

		// 遍历集合
		for (int x = 0; x < array.size(); x++) {
			String s = array.get(x);
			if(s.startsWith("张")) {
				System.out.println(s);
			}
		}

	}

}
