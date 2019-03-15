package com.igeek;

/**
 * @author zx
 * @date 2019年3月15日
 * @version 1.0
 * @description：
   *   继承
 1. 子类 extends 父类  
 2. 父类 超类，基类
 3. java中只有单继承，接口是可以多继承的
 4. 子类继承父类的时候，可以的到父类的属性和方法；并不一定可以使用
 5. 当定义一个类的时候，没有显性的继承则他的父类是Object
  
 6.instanceof
 */
public class TestExtends {

	public static void main(String[] args) {
		Student student = new Student();
		student.name ="陈哲";
		student.height=180;
		student.major="计算机应用";
		student.rest();
		System.out.println(student.name+";"+student.height+";"+student.major);
		
		System.out.println(student instanceof Student);
		System.out.println(student instanceof Person);
		System.out.println(student instanceof Object);
		System.out.println(new Person() instanceof Student);
		System.out.println(new Person() instanceof Person);
	}

}


