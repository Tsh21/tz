package com.igeek;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		// 创建当前时间的Date对象
		Date date = new Date();

		System.out.println(date);

		long time = date.getTime();
		System.out.println(time);

		// 制定毫秒值创建Date对象
		Date date2 = new Date(0L);
		System.out.println(date2);

		// 修改日期毫秒值
		date2.setTime(14962627904L);
		System.out.println(date2);

	}
}
