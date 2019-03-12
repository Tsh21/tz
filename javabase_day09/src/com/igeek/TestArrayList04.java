package com.igeek;

import java.util.ArrayList;

/**
 * @author zx
 * @date 2019年3月11日
 * @version 1.0 @description： 
 * 向集合中添加任意四个字符串,遍历集合,依次打印取出的字符串
 */
public class TestArrayList04 {

	public static void main(String[] args) {
		// 创建集合对象
		ArrayList<String> array = new ArrayList<String>();

		// 添加字符串元素
		array.add("向问天");
		array.add("刘正风");
		array.add("左冷禅");
		array.add("风清扬");

		// 遍历集合
		for (int x = 0; x < array.size(); x++) {
			String s = array.get(x);
			System.out.println(s);
		}

	}

}
