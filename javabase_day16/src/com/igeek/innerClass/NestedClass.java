package com.igeek.innerClass;

/**
 * @author zx
 * @date 2019年3月22日
 * @version 1.0
 * @description：
 * 
 * 定义在成员位置的内部类
	定义格式
	public class Outer{
		class Inner{
			//其他代码
		}
	}
	访问格式：
		Outer.Inner  x = new Outer().new Inner();
 */
public class NestedClass {
	
	private String name = "wb";
	
	//成员内部类
	public class InnerClass{
		
		public void innerMethod() {
			System.out.println("InnerClass的innerMethod()被调用了");
			System.out.println("NestedClass的成员变量name:"+name);
		}
		
	}
	
	

}
