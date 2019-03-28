package com.itheima.level3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zx
 * @date 2019年3月28日
 * @version 1.0
 * @description:
 * 使用SimpleDateFormat类,把2016-12-18转换为2016年12月18日. 
提示: SimpleDateFormat对象的日期格式字符串可以通过applyPattern(String pattern)进行修改
要求:异常处理使用throws的方式

 */
public class Test18 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date  =df.parse("2019-03-28");
		df.applyPattern("yyyy年MM月dd日");
		String nString = df.format(date);
		System.out.println(nString);

	}

}
