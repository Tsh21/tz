package com.igeek;

/**
 * @author zx
 * @date 2019年3月8日
 * @version 1.0
 * @description：
	 * 去除字符串两端空格	
	*		String trim()
	* 按照指定符号分割字符串	
	*		String[] split(String str)

 */
public class TestString09 {

	public static void main(String[] args) {
		String s1 = "helloworld";
		String s2 = "  helloworld  ";
		String s3 = "  hello  world  ";
		System.out.println(s2);
		System.out.println(s2.trim());
		System.out.println(s3);
		System.out.println(s3.trim());
		
		String str = "a,b,c";
		String[] strArray = str.split(",");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}


	}

}
;