package com.igeek;

/**
 * 
 * @author zx
 * @date 2019��2��27��
 * @version 1.0
 * @description��char��ʹ��
 */
public class TestPrimiviteTypeData3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 'a';
		char b = '��';
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
