package com.igeek;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author zx
 * @date 2019年3月26日
 * @version 1.0
 * @description:
   *     模拟日历
 */
public class CalendarModel {
	
	public static void main(String[] args) throws ParseException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请用户输入日期：（格式：2019-3-26）");
		String dateString = scanner.nextLine();
		System.out.println("您刚刚输入的时期："+dateString);
		
		String[] str = dateString.split("-");
		int year = Integer.parseInt(str[0]) ;
		int month = Integer.parseInt(str[1]);
		int dayOfMonth = Integer.parseInt(str[2]);
		
		//month 从 0-11开始 ，以此类推
		Calendar c = new GregorianCalendar(year, month-1, dayOfMonth);
		
//		String str = "2019-03-26";
//		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//		Date date = df.parse(str);
//		
//		Calendar c = new GregorianCalendar();
//		c.setTime(date);
		
		c.set(Calendar.DAY_OF_MONTH, 1);
		
		int maxDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
//		System.out.println(maxDate);
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		//判断当月的1号是周几来打印制表符
		for(int i=0;i<c.get(Calendar.DAY_OF_WEEK)-1;i++) {
			System.out.print("\t");
		}
		
		for(int i=1;i<=maxDate;i++) {
			
			//标记出几号
			if(c.get(Calendar.DATE) == dayOfMonth) {
				System.out.print("["+c.get(Calendar.DAY_OF_MONTH)+"]\t");
			}else {
				System.out.print(c.get(Calendar.DAY_OF_MONTH)+"\t");
			}
			//每到周六换行输出
			if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
				System.out.println();
			}
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
	}
}
