package com.igeek;

import java.util.Date;

import com.igeek.util.SimpleFormatPattern;

/**
 * @author zx
 * @date 2019年3月26日
 * @version 1.0
 * @description:
 * public Date()			//返回当前时间
 * public Date(long date)	//返回指定毫秒值的日期对象
 * public long getTime()    //获取当前时间对象的毫秒值
 */
public class TestDate {

	public static void main(String[] args) {
		// 1000毫秒=1s
		Date date = new Date(2000);
		System.out.println(date);
		
		System.out.println(date.getTime());
		
		Date date2 = new Date();
		System.out.println(date2);
		//测试此日期是否在指定日期之后。
		System.out.println(date2.after(date));
		//过时的方法
		Date date3 = new Date(2020-1900, 3, 10);
		System.out.println(date3);
		
	}

}
