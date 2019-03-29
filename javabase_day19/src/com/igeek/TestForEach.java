package com.igeek;

import java.util.ArrayList;

/**
 * @author zx
 * @date 2019年3月29日
 * @version 1.0
 * @description:
 * for(元素的数据类型变量   : Collection集合or数组){
 * 
	}

 */
public class TestForEach {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
		list.add(10);
		list.add(100);
		list.add(2000);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		System.out.println("###########");
		
		String[] strings = {"zs","lisi","we"};
		for(String str :strings) {
			System.out.println(str);
		}
		
		System.out.println("###########");
		ArrayList<Person> list2 = new ArrayList<Person>();
		
		Person p = new Person("Jack",18);
		Person p2 = new Person("Rose",16);
		Person p3 = new Person("Trump",62);
		
		list2.add(p);
		list2.add(p2);
		list2.add(p3);
		
		for(Person person : list2) {
			System.out.println(person);
		}

	}

}
