package com.igeek.thisSuper;

/**
 * @author zx
 * @date 2019年3月18日
 * @version 1.0
 * @description：
 *     调用普通成员：
	this.成员变量       可以访问本类对象的成员变量
	super.成员变量     可以访问父类的成员变量
	this.成员方法()     可以访问本类对象的成员方法
	super.成员方法()    可以访问父类的成员方法
	子类方法中
		访问子类自身的成员用this.
		访问父类的成员super.

 */
public class ThisSuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chinese chinese = new Chinese();
//		chinese.testAccess();
	}

}
