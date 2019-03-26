package com.igeek;

import java.util.Calendar;

/**
 * @author zx
 * @date 2019年3月26日
 * @version 1.0
 * @description:
 * 	创建Calendar对象,不使用构造方法,使用一下方法,支持语言敏感的问题,
 * 	静态方法getInstance,获取当前时间
*  	Calendar rightNow = Calendar.getInstance();
 */
public class CalendarDemo {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);

	}

}
