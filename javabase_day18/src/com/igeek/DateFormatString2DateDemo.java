package com.igeek;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.igeek.util.SimpleFormatPattern;

/**
 * @author zx
 * @date 2019年3月26日
 * @version 1.0
 * @description: public Date parse(String source) throws ParseException
 */
public class DateFormatString2DateDemo {

	public static void main(String[] args) throws ParseException {
		
		DateFormat format = new SimpleDateFormat(SimpleFormatPattern.rule1);

		// 准备日期字符串
		String sTime = "2017年11月06日  14:10:28";
		// 转换生成Date对象
		Date dTime = format.parse(sTime);

		// 打印Date对象
		System.out.println(dTime);

	}

}
