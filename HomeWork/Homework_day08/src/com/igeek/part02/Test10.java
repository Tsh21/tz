package com.igeek.part02;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author zx
 * @date 2019年4月8日
 * @version 1.0
 * @description:
 * 有2个ArrayList,元素如下: 
 * array1 = "a","b","a","c","d",
 * array2 = "e","f","a","d","g",
 * 将两个集合重复项去除后合并成一个集合
 */
public class Test10 {

	public static void main(String[] args) {
		ArrayList<String> array1 = new ArrayList<>();
		ArrayList<String> array2 = new ArrayList<>();
		
		array1.add("a");
		array1.add("b");
		array1.add("a");
		array1.add("c");
		array1.add("d");
		
		array2.add("e");
		array2.add("f");
		array2.add("a");
		array2.add("d");
		array2.add("g");
		
		HashSet<String> hashSet = new HashSet<>();
		hashSet.addAll(array1);
		hashSet.addAll(array2);
		
//		for(String s1 : array1) {
//			hashSet.add(s1);
//		}
//		for(String s2 : array2) {
//			hashSet.add(s2);
//		}
//		
		System.out.println(hashSet);

	}

}
