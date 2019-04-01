package com.igeek;

/**
 * @author zx
 * @date 2019年4月1日
 * @version 1.0
 * @description:
 * 
 * interface 接口名<Q,E,R……>{
	public abstract void method(T t);//假设定义一个方法
   }
	
	class 类名 implements 接口<实际类型>{
 		@Override
		public void method(实际类型t) {
			System.out.println(t);
		}
	}

 */
public interface MyInterType<T> {
	void method(T t);
}
