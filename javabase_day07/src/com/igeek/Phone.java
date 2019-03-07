package com.igeek;

/**
 * @author zx
 * @date 2019年3月7日
 * @version 1.0
 * @description：
  *   手机类
 */
public class Phone {
	//成员属性可以不初始化
	int price;
	String color;
	String brand;
	String opSys;
	
	void call() {
		System.out.println("打电话......");
	}
	
	void sendMessage() {
		System.out.println("发短信......");
	}

}
