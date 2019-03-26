package com.igeek;

import java.util.Properties;

public class TestSystem {
	
	public static void main(String[] args) {
		//标准输出
		System.out.println("hello java");
		//错误输出
		System.err.println("java");
		//operation system
		String os = System.getProperty("os.name");
		System.out.println(os);
		System.out.println(System.getProperty("sun.jnu.encoding"));
		
		Properties properties = System.getProperties();
		
		//终止程序
		System.out.println("hi!~~~");
		System.exit(0);
		System.out.println("hello");
		
	}

}
