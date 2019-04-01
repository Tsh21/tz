package com.igeek;

import java.util.ArrayList;

/**
 * @author zx
 * @date 2019年4月1日
 * @version 1.0
 * @description:
 * 	
 * ? extends E代表只要是E类型的子类即可
 */
public class GenericDemo {
	public static void main(String[] args) {
		// 定义集合b,包含3个元素
		ArrayList<String> listB = new ArrayList<String>();
		listB.add("Jack");
		listB.add("Rose");
		listB.add("Trump");
		
		//listB中的元素类型String必须是listA中元素类型Object的子类
		ArrayList<Object> listA = new ArrayList<Object>(listB);
		listA.add("Obama");
		
		System.out.println(listA);
		

	}
}
