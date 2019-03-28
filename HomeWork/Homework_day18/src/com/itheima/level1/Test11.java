package com.itheima.level1;

import java.util.Calendar;

public class Test11 {

	public static void main(String[] args) {
		//获取当前日历对象
		Calendar c = Calendar.getInstance();
		
		c.add(Calendar.DATE, 500);
		
		System.out.println(c.get(Calendar.YEAR)+";"+c.get(Calendar.MONTH)+";"+c.get(Calendar.DAY_OF_MONTH));

	}

}
