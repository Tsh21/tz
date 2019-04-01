package com.igeek;

/**
 * 在类中使用泛型
 * @author zx
 * @date 2019年4月1日
 * @version 1.0
 * @description:
 * 定义：类名<变量>  MyClassType<T>
 * 使用：创建对象后使用
 */
public class MyClassTypeDemo {

	public static void main(String[] args) {
		
		MyClassType<String> classType = new MyClassType<String>();
		classType.setMyField("Jack");
		
		String name = classType.getMyField();
		System.out.println(name);
		
		MyClassType<Integer> classType2 = new MyClassType<>();
		classType2.setMyField(88);
		System.out.println(classType2.getMyField());
		
	}

}
