package com.igeek.innerClass;

/**
 * @author zx
 * @date 2019年3月22日
 * @version 1.0
 * @description：
 * 定义在局部位置的内部类
	定义格式
	public class Outer{
		public void method{
			class Inner{
				//其他代码
			}
		}
	}
 */
public class TestLocalClass {
	
	private String name = "朱雯静";
	
	public void outerMethod() {
		
		//局部位置的内部类
		class InnerClass {
			public void innerMethod() {
				System.out.println("内部类的方法被调用了");
				System.out.println("外部类的成员变量："+name);
			}
		}
		
		InnerClass innerClass = new InnerClass();
		innerClass.innerMethod();
	}

}
