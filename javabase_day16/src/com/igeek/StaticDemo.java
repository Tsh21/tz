package com.igeek;

/**
 * @author zx
 * @date 2019年3月22日
 * @version 1.0
 * @description：static 测试 static是静态修饰符，一般修饰成员。 被static修饰的成员属于类，不属于单个这个类的某个对象。
 * 
 *                     static修饰的成员被多个对象共享。 static修饰的成员属于类，但是会影响每一个对象。
 *                     被static修饰的成员又叫类成员，不叫对象的成员。
 * 
 *                     所有中国人国籍均应该为中国，不应各自定义各自的国籍，所以可以将国籍定义为static，属于类，被多个对象共享。
 *                     国籍,姓名,年龄,职业 其中,国籍应该被共享 姓名,年龄,职业各个对象有各个对象的值
 * 
 *                     一般static修饰的成员,直接赋值
 * 
 *                     当多个对象共享使用同一个类中静态成员时,只要该值改变,就会影响所有的对象
 */
public class StaticDemo {

	public static void main(String[] args) {
		// 创建人类对象,验证静态static修饰的成员被多个对象共享
		Chinese c = new Chinese("王宝强", 34, "演员");
		
		//The static field Chinese.nationality should be accessed in a static way
		System.out.println(c.getAge() + "岁的" + c.getName() + "是" + Chinese.nationality + "人");

		Chinese c2 = new Chinese("周星驰", 48, "演员或导演或制片");
		System.out.println(c2.getAge() + "岁的" + c2.getName() + "是" + Chinese.nationality + "人");

		Chinese.nationality = "中华人名共和国";
		System.out.println("================================");

		System.out.println(c.getAge() + "岁的" + c.getName() + "是" + c.nationality + "人");

		System.out.println(c2.getAge() + "岁的" + c2.getName() + "是" + c2.nationality + "人");

	}

}
