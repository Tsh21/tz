package com.igeek.innerClass;

/**
 * @author zx
 * @date 2019年3月22日
 * @version 1.0
 * @description：
 * 访问格式  
 *  Outer.Inner  x = new Outer().new Inner();
 *  
 *  
 */
public class TestInnerClass {

	public static void main(String[] args) {
		NestedClass.InnerClass inner = new NestedClass().new InnerClass();
		inner.innerMethod();
	}

}

