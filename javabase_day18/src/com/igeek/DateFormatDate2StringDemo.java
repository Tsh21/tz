package com.igeek;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author zx
 * @date 2019年3月26日
 * @version 1.0
 * @description: public final String format(Date date) 将日期格式化成字符串
 */
public class DateFormatDate2StringDemo {

	public static void main(String[] args) {
		// 定义日期规则字符串
		String rule = "yyyy年MM月dd日HH:mm:ss";
		// 使用日期转换规则,创建日期格式化类对象
		DateFormat format = new SimpleDateFormat(rule);
		// 准备要转换的日期对象
		Date dNow = new Date();
		// 转换Date对象为String字符串
		String sNow = format.format(dNow);

		// 打印结果
		System.out.println(sNow);
		System.out.println(dNow);

	}

}
