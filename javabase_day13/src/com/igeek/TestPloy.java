package com.igeek;

/**
 * @author zx
 * @date 2019年3月18日
 * @version 1.0
 * @description：
   * 多态
   * 1.继承
   * 2.方法重写
   * 3.父类引用指向子类
   * 
 */
public class TestPloy {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animalShout(animal);
		Dog dog = new Dog();
		animalShout(dog);
		Cat cat = new Cat();
		animalShout(cat);
		
		Animal d = new Dog();//向上造型
//		d.sleep();
		Dog d2 = (Dog)d;//强制向下造型
		d2.sleep();
	}
	
	//动态绑定
	static void animalShout(Animal animal) {
		animal.shout();
	}
	
//	static void animalShout(Dog dog) {
//		dog.shout();
//	}
//	
//	static void animalShout(Cat cat) {
//		cat.shout();
//	}

}
