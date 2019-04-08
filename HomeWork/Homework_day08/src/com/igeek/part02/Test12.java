package com.igeek.part02;

import java.util.ArrayList;

/**
 * @author zx
 * @date 2019年4月8日
 * @version 1.0
 * @description:
 * 定义一个方法filterChars(ArrayList<String> list)
 * 将传入的ArrayList<String>集合中的每个元素中的字母过滤掉,
 * 比如list有2个元素{"hello123java", "11world555java"}，返回结果{"123", "11555"}
 */
public class Test12 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("hello123java");
		arrayList.add("11world555java");
		
		ArrayList<String> arr = filterChars(arrayList);
		System.out.println(arr);

	}
	
	
	public static ArrayList<String> filterChars(ArrayList<String> list){
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0;i < list.size() ;i++) {
			String str = list.get(i);
			String newStr = str.replaceAll("[a-zA-Z]", "");
			arr.add(newStr);
		}
		return arr;
	}

}
