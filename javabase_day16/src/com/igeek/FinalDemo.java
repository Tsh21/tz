package com.igeek;

/**
 * final修饰变量
 * @author zx
 * @date 2019年3月22日
 * @version 1.0
 * @description：
 * final是最终修饰符，可以修饰类、成员方法、变量
*  
*  final修饰的类无法被继承。
*  final修饰的方法无法被重写。
*  final修饰的变量无法被再次赋值,必须被赋值。(包括局部变量与成员变量)
*  
*  现实开发过程中遇到的最常见成员常量的情况,连续使用public static final在一个类中定义一个常量,采取直接给常量赋值的方式.
*  注意常量的命名规则:所有字母均大写,用_连接

 */
public class FinalDemo {
	
	//静态常量
	public static final double PI = 3.1415926;

	public static void main(String[] args) {
		 //final修饰的变量无法被再次赋值
		int a = 10;
		a = 9;
		//The final local variable b cannot be assigned. 
		//It must be blank and not using a compound assignment
		final int b = 20;
//		b = 30;
		
		// 使用静态常量
		double r = 2.5;
		double area = r*r*FinalDemo.PI;
		System.out.println(area);
		System.out.println("##############");
		final Person p = new Person();
		p.setName("zwj");
		System.out.println(p.getName());
		// 为引用变量二次赋值,指p这个变量只能指向一个地址,不能指向第二个地址
		//The final local variable p cannot be assigned. 
		//It must be blank and not using a compound assignment
//		p = new Person();
		
	}

}
