package com.igeek;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression03 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[0-9]");

		Matcher m = p.matcher("aa234**ssdaf34**shh9934");
		
		//替换
		String str = m.replaceAll("#");
		
		System.out.println(str);

	}

}
