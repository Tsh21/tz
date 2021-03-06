package com.igeek;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zx
 * @date 2019年3月28日
 * @version 1.0
 * @description:
 *     补充：
 *     String.matches(String regex);
 *     告知此字符串是否匹配给定的 正则表达式。
 * public boolean matches(String regex)；    
 *       
 */
public class TestRegularExpression02 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("([a-z]+)([0-9]+)");
		
		Matcher m = p.matcher("aa234**ssdaf34**shh9934");
		
		while(m.find()) {
//			System.out.println(m.group());
			System.out.println(m.group(0));
			System.out.println(m.group(1));
			System.out.println(m.group(2));
		}

	}

}
