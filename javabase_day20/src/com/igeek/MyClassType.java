package com.igeek;

/**
 * @author zx
 * @date 2019年4月1日
 * @version 1.0
 * @description:
 * 自定义类中的使用泛型
 * 
 * 在该类中定义一个成员变量,使用泛型
* 
* 不指定其数据类型,是一个不确定的数据类型.
* 创建不同的对象时,指定不同的数据类型

 */
public class MyClassType<T> {
	
	private T myField;

	public T getMyField() {
		return myField;
	}

	public void setMyField(T myField) {
		this.myField = myField;
	}
	
}
