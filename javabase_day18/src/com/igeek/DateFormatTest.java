package com.igeek;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {

	public static void main(String[] args) throws ParseException {
		DateFormat dFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		// 将一个 Date 格式化为日期/时间字符串。
		//把时间对象按照 格式字符串指定的格式 转换成相应的字符串
		String str = dFormat.format(new Date());
		
		System.out.println(str);
//		System.out.println(new Date());
		
		//从给定字符串的开始解析文本，以生成一个日期。
		DateFormat dFormat2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		Date date = dFormat2.parse("2019年03月26日 10时45分20秒");
		System.out.println(date);
		
	}

}
