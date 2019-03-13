package com.igeek.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zx
 * @date 2019年3月13日
 * @version 1.0
 * @description：
 * void write(String str):写一个字符串数据
 * void write(String str,int index,int len):写一个字符串中的一部分数据
 * void write(int ch):写一个字符数据,这里写int类型的好处是既可以写char类型的数据，也可以写char对应的int类型的值。'a',97
 * void write(char[] chs):写一个字符数组数据
 * void write(char[] chs,int index,int len):写一个字符数组的一部分数据

 */
public class FileWriterDemo03 {
	
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("d:\\a.txt");
		//写一个字符串数据
		fw.write("hello");
		//写一个字符串中的一部分数据
		fw.write("java", 1, 3);
		fw.write("world");
		//写一个字符数据
		fw.write('a');
		fw.write(97);
		fw.write(65);
		//写一个字符数组数据
		char[] chs = {'e','f','g'};
		fw.write(chs);
		//写一个字符数组的一部分数据
		fw.write(chs,0,1);
		fw.flush();
		fw.close();
		
	}
}
