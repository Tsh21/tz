package com.igeek;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("abcdefg");
		StringBuilder sb2 = new StringBuilder();
		
		System.out.println(sb);
		sb.setCharAt(0, '中');
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		//append();
		sb.append('H');
		System.out.println(sb);
		System.out.println("#################");
		System.out.println(sb2);
		for (int i = 0; i < 26; i++) {
			char temp = (char) ('a'+i);
			sb2.append(temp);
		}
		System.out.println(sb2);
		sb2.reverse();
		System.out.println(sb2);
		System.out.println("#################");
		StringBuilder sb4 = new StringBuilder();
		System.out.println("sb:"+sb4);
		System.out.println("sb.capacity():"+sb4.capacity());
		System.out.println("sb.length():"+sb4.length());
		//链式
		sb4.append("Hello").append("nihao");
		System.out.println(sb4);

	}

}
