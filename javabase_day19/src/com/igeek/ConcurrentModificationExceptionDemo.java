package com.igeek;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationExceptionDemo {

	public static void main(String[] args) {
		// 创建集合对象
		ArrayList<Person> list = new ArrayList<Person>();
		// 向集合中添加元素
		Person p = new Person("Jack", 18);
		Person p2 = new Person("Rose", 16);
		Person p3 = new Person("Trump", 62);
		Person p4 = new Person("Obama", 56);
		Person p5 = new Person("Castro", 90);

		list.add(p);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		//获取迭代器
		Iterator<Person> iterator = list.iterator();
		//遍历
		while(iterator.hasNext()) {
			Person person = iterator.next();
			//当遇到16岁的人时,就添加一个90岁的人
			//java.util.ConcurrentModificationException 并发修改异常
			if(person.getAge() == 16) {
				list.add(p5);
				break;
			}
		}
		
		//重新获取
		Iterator<Person> iterator2 = list.iterator();
		
		while(iterator2.hasNext()) {
			Person person = iterator2.next();
			System.out.println(person);
		}

	}

}
