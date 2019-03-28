package com.itheima.level1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test10 {
	
	public static void main(String[] args) {
		
		Date d = new Date();
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String date = sf.format(d);
		
		System.out.println(date);
		
	}

}
