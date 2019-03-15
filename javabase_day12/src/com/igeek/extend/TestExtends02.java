package com.igeek.extend;

/**
 * @author zx
 * @date 2019年3月15日
 * @version 1.0
 * @description：
 * 继承关系:类与类之间的关系
 *
 * 人:定义一些共性内容定义为父类
 * 
 * 		共性的成员变量:年龄,姓名
 * 		共性的成员方法:吃饭,睡觉
 * 
  * 程序员、老师、工人定义为人类的子类,子类可以在父类的基础上扩展新的成员变量与成员方法
 * 
 * 当有了子父类关系后,子类拥有了父类的成员,可以直接访问父类的非私有成员
 * 继承通过这样的方式,提高了代码的复用性,让类与类之间产生了关系
 * 继承关系必须符合is a的关系,即我是你的一种

 */
public class TestExtends02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer programmer = new Programmer();
		programmer.setName("wb");
		programmer.setAge(20);
		programmer.setHair("fake hair");
		System.out.println(programmer.getAge()+";"+programmer.getHair()+";"+programmer.getName());
		programmer.code();
	}

}
