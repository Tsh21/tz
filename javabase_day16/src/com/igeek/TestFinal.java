package com.igeek;

/**
 * @author zx
 * @date 2019年3月22日
 * @version 1.0
 * @description：
 * 1.final修饰的变量无法被再次赋值。
 * 2.final修饰的类无法被继承。
 * 3.final修饰的方法无法被重写。
 */
public class TestFinal {
	
	public static void main(String[] args) {
		
	}

}

class Animal{
	public void shout() {
		System.out.println("shout....");
	}
	
}
//The type Dog cannot subclass the final class Animal
//Cannot override the final method from Animal
class Dog extends Animal{

	@Override
	public void shout() {
		System.out.println("汪汪汪");
		
	}
	
}
