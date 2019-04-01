package com.igeek;

import java.util.ArrayList;

/**
 * @author zx
 * @date 2019年4月1日
 * @version 1.0
 * @description:
 * 测试泛型
 */
public class TestGeneric {

	public static void main(String[] args) {
		//MyCollection is a raw type. 
		//References to generic type MyCollection<E> should be parameterized
		
		//ArrayList is a raw type.
		//References to generic type ArrayList<E> should be parameterized
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("String");
		//The method add(int, String) in the type 
		//ArrayList<String> is not applicable for the arguments (int)
//		arrayList.add(888);
		
		MyCollection<String> myCollection = new MyCollection<String>();
		//The method set(String, int) in the type 
		//MyCollection<String> is not applicable for the arguments (int, int)
		myCollection.set("张恒", 0);
//		myCollection.set(888, 1);
		myCollection.set("蔡雯静", 2);
		
//		Integer i = (Integer)myCollection.get(1);
		String j = (String) myCollection.get(0);
//		System.out.println(i);
		System.out.println(j);
		System.out.println(myCollection.get(2));

	}
}

class MyCollection<E> {
	
	//对象数组
	Object[] objs = new Object[5];
	
//	int[] intes = new int[10];
//	String[] strings = new String[10];
	
	public void set(E obj,int index) {
		objs[index] = obj;
	}
	
	public E get(int index) {
		return (E) objs[index];
	}
	
}
