package com.igeek.io;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author zx
 * @date 2019年3月13日
 * @version 1.0
 * @description：
 * 读数据一次读取一个字符数组的数据
 */
public class FileReaderDemo02 {

	public static void main(String[] args) throws IOException {
		//创建FileReader对象
		FileReader reader = new FileReader("d:\\e.txt");
		char[] ch = new char[6];
//		int len = reader.read(ch);
//		System.out.println(len);
//		System.out.println(new String(ch));
//		
//		len = reader.read(ch);
//		System.out.println(len);
//		System.out.println(new String(ch));
		int len;
		while((len=reader.read(ch)) != -1) {
			System.out.println(new String(ch,0,len));
		}
		reader.close();

	}

}
