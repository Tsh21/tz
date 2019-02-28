package com.igeek;

/**
 * 
 * @author zx
 * @date 2019年2月27日
 * @version 1.0
 * @description：char的使用
 */
public class TestPrimiviteTypeData3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 'a';
		char b = '家';
		char c = '\u0061';
		char d = 'b';
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a+d);
		System.out.println(""+a+d);
		System.out.println("###############");
		System.out.println(""+'a'+'\n'+'b');
		System.out.println(""+'a'+'\t'+'b');
		System.out.println(""+'a'+'\''+'b');
		System.out.println(""+'a'+'\"'+'b');
		System.out.println(""+'a'+'\\'+'b');
	}

}
