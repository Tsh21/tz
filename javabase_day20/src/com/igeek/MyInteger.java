package com.igeek;

//The type MyInteger must implement 
//the inherited abstract method MyInterType<T>.method(T)

//T cannot be resolved to a type

//定义类的时候，就指定接口中的数据类型的定义
public class MyInteger implements MyInterType<String> {

	@Override
	public void method(String t) {
		// TODO Auto-generated method stub
		
	}


}
