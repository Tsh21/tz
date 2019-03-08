package com.igeek;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符串数据：");
		//nextLine()接受字符串 
		String tmp = scanner.nextLine();
		System.out.println(tmp);
	}

}
