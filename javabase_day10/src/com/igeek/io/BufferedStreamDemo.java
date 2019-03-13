package com.igeek.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zx
 * @date 2019年3月13日
 * @version 1.0
 * @description：
 * 缓冲流BufferedWriter、BufferedReader的基本使用
 * 
 * BufferedWriter:将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。 
 * BufferedReader:从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。
 */
public class BufferedStreamDemo {

	public static void main(String[] args) throws IOException {
		
//		BufferedWriter bWriter = new BufferedWriter(new FileWriter("d:\\f.txt"));
//		bWriter.write("hellojava");
//		bWriter.flush();
//		bWriter.close();
		
		BufferedReader bReader = new BufferedReader(new FileReader("d:\\f.txt"));
//		int ch;
//		while((ch = bReader.read()) != -1) {
//			System.out.print((char)ch);
//		}
		
		char[] chs = new char[1024];
		int len;
		while((len = bReader.read(chs)) != -1) {
			System.out.println(new String(chs,0,len));
		}
		
		//释放资源
		bReader.close();
		
		
	}

}
