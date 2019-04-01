package com.igeek;

/**
 * @author zx
 * @date 2019年4月1日
 * @version 1.0
 * @description:
 * 
 * 	interface 接口名<Q,E,R……>{
		public abstract void method(T t);//假设定义一个方法
	}
	class 类名<T> implements 接口名<T>{
		//由于没有指定接口中具体的数据类型,所以方法中仍然使用这种不确定的数据类型
		@Override
		public void method(T t) {
			
		}
	}

 */
public interface MyIntegerDemo2<T> {
	void method(T t);
}
