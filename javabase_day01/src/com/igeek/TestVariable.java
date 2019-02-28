package com.igeek;

/**
 * 
 * @author zx
 * @date 2019年2月27日
 * @version 1.0
 * @description：
  *  变量（局部变量）
 * 1.局部变量，使用时初始化
 * 2.生命周期：声明的位置到方法或者语句块的执行结束为止
 * 
  *  变量（成员变量）
 * 1.类内部定义的变量，方法外面的
 * 2.生命周期：伴随着对象
 * 
  * 变量（静态变量）
 * 1.生命周期：从属于类
 */
public class TestVariable {
	
	boolean salary;//成员变量
	
	static int size;//静态变量

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int age= 8;//局部变量,语句块
		}
//	    System.out.println(age);
		int i = 0;   //局部变量,方法
		int j = i+5;
		System.out.println(j);
		TestVariable testVaruable = new TestVariable();
		System.out.println(testVaruable.salary);
		System.out.println(TestVariable.size);
	}

}
