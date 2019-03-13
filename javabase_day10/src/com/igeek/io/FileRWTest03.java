package com.igeek.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zx
 * @date 2019年3月13日
 * @version 1.0 @description： 缓冲流复制文本 BufferedWriter和BufferedReader
 *          把项目路径下的FileReaderDemo.java中的内容复制到项目路径下的Copy.java中
 */
public class FileRWTest03 {

	public static void main(String[] args) throws IOException {
		// 拿到对象
		BufferedReader fileReader = new BufferedReader(new FileReader("d:\\FileReaderDemo.java"));
		BufferedWriter fileWriter = new BufferedWriter(new FileWriter("d:\\Copy.java"));

		// 读写数据
//		int ch;
//		while ((ch = fileReader.read()) != -1) {
//			fileWriter.write(ch);
//		}
		char[] chs = new char[1024];
		int len;
		while((len=fileReader.read(chs)) != -1) {
			fileWriter.write(chs,0,len);
		}

		// 释放资源
		fileReader.close();
		fileWriter.close();

	}

}
