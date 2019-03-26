package com.igeek;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		
		Calendar calendar2 = new GregorianCalendar(2029, 10, 9,22,10,50);
		
		System.out.println(calendar);
		
		System.out.println(calendar2);
		System.out.println("#################");
		int year = calendar2.get(Calendar.YEAR);
		int month = calendar2.get(Calendar.MONTH);
		int date = calendar2.get(Calendar.DATE);//DAY_OF_MONTH
		int weekend = calendar.get(Calendar.DAY_OF_WEEK);//星期几: 周日1，周一2，周二3.......
		System.out.println(year);
		System.out.println(month);//0-11表示对于的月份      0:1月份   1:2月份  .........
		System.out.println(date);
		System.out.println(weekend);
		System.out.println("#################");
		//设置日期的相关元素
		Calendar calendar3 = new GregorianCalendar();
		calendar3.set(Calendar.YEAR, 8055);
		System.out.println(calendar3.get(Calendar.YEAR));
		System.out.println("#################");
		//日期的计算
		Calendar calendar4 = new GregorianCalendar();
		calendar4.add(Calendar.MONTH, 2);
		System.out.println(calendar4.get(Calendar.MONTH));
		System.out.println("#################");
		//日期对象和时间对象转化
		Date date2 = calendar4.getTime();
		System.out.println(date2);
		System.out.println("#################");
		Calendar calendar5 = new GregorianCalendar();
		calendar5.setTime(date2);
		System.out.println(calendar5);
		System.out.println("#################");
		Calendar calendar6 = new GregorianCalendar(2019,3,26,10,20,43);
		printCalendar(calendar6);
	}
	
	public static void printCalendar(Calendar calendar) {
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int date = calendar.get(Calendar.DATE);
		int week = calendar.get(Calendar.DAY_OF_WEEK)-1;
		String wString = week == 0? "日" : week+"";
		
		int hour = calendar.get(Calendar.HOUR);
		int min = calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND);
		
		System.out.println(year+"年"+(month+1)+"月"+date+"日"
		+hour+"时"+min+"分"+sec+"秒"+"周"+wString);
		
	}

}
