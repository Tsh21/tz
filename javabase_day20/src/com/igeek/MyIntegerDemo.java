package com.igeek;
/**
 * @author zx
 * @date 2019年4月1日
 * @version 1.0
 * @description:
 * class 类名<T> implements 接口名<T>{
		//由于没有指定接口中具体的数据类型,所以方法中仍然使用这种不确定的数据类型
		@Override
		public void method(T t) {
			
		}
	}
 */
public class MyIntegerDemo<T> implements MyIntegerDemo2<T> {

	@Override
	public void method(T t) {
		System.out.println(t);
	}

}
