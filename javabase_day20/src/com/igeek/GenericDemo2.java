package com.igeek;

import java.util.ArrayList;

/**
 * 
 * @author zx
 * @date 2019年4月1日
 * @version 1.0
 * @description:
 * 
 * 提高程序的安全性
* 将运行期问题转移到了编译期
* 省去了类型强转的麻烦    
*    

 */
public class GenericDemo2 {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList();
		
//		list.add("Jack");
//		list.add("Rose");
//		list.add("Trump");
//		list.add("Obama");
//		list.add(123);
		list.add(new Person("李子贤"));
		
//		System.out.println(list);
		
		//java.lang.ClassCastException
//		for (Object object : list) {
//			//java.lang.Integer cannot be cast to java.lang.String
//			String name = (String) object;
//			System.out.println(name);
//		}
		
		//存入的Object类型取出也是Object类型,使用String特有方法必须强转,非常麻烦
//		for (String string : list) {
//			System.out.println(string);
//		}
		
		for (Person person : list) {
			System.out.println(person);
		}

	}
}
