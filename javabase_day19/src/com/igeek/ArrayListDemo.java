package com.igeek;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		
		Person p = new Person("Jack",18);
		Person p2 = new Person("Rose",16);
		Person p3 = new Person("Trump",62);
		
		list.add(p);
		list.add(p2);
		list.add(p3);
		
		Iterator<Person> iterator = list.iterator();
		
		int sum=0;
		
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person);
			sum+=person.getAge();
		}
		System.out.println("总年龄："+sum);
		
	}

}
