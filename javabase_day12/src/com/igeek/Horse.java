package com.igeek;

/**
 * @author zx
 * @date 2019年3月15日
 * @version 1.0
 * @description：
   *     方法重写
   *     方法名，形参列表相同
 *     
   *   返回值的类型  子类小于等于父类     
 */
public class Horse extends Vehicle{

	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		System.out.println("马儿跑......");
	}

	@Override
	public Student passenger() {
		// TODO Auto-generated method stub
		return new Student();
	}
	
	

}
