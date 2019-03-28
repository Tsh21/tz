package com.itheima.level2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test13 {

	public static void main(String[] args) {
		
		try {
			//a)把你生日的字符串,转换为日期对象
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sf.parse("1997-03-28");
			//b)把日期对象转换为对应的毫秒值
			long birthTime = date.getTime();
			//c)获取当前系统的毫秒值
			long sysTime = System.currentTimeMillis();
			//d)当前系统毫秒值-出生时间对于的毫秒值计算你活的毫秒值
			long liveTime = sysTime-birthTime;
			//e)把你活毫秒值转换为天
			long day = liveTime/1000/60/60/24;
			//f)输出天数
			System.out.println("活了"+day+"天");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
