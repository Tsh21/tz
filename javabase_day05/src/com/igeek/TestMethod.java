/**
 * 
 */
package com.igeek;

/**
 * @author zx
 * @date 2019年3月5日
 * @version 1.0
 * @description：
 * 修饰符 返回值类型 方法名(参数类型 参数名1，参数类型 参数名2…) {
			方法体;
			return 返回值;
	}
	
	修饰符 目前记住 public static
	返回值类型 用于限定返回值的数据类型
	方法名 一个名字，为了方便我们调用方法
	参数类型 用于接收调用方法时传入的数据的类型
	参数名  用于接收调用方法时传入的数据的变量
	方法体 完成功能的代码
	return 结束方法，把返回值带给调用者
	
	
	案例：求两个数和的案例。

 */
public class TestMethod {
	
	public static void main(String[] args) {
		//通过对象调用方法
		TestMethod testMethod = new TestMethod();
		// 赋值调用
//		int sum = testMethod.add(2, 3) +100;
		int a=10,b=30;
		int sum2 = testMethod.add(a, b); 
		System.out.println("sum2="+sum2);
		//形参的值是一个copy的操作，基本数据类型和引用数据类型
		System.out.println(a);
		System.out.println(b);
//		System.out.println(sum);
	}
	
	int add(int a,int b){
		a++;
		b++;
		int c = a+b;
//		System.out.println(c);
		return c;
	}
}
