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
 * 缓冲流的特有方法复制文件
 * 需求：
 * 	把项目路径下的FileWriterDemo.java中的内容复制到项目路径下的Copy.java中

 */
public class FileRWTest04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("d:\\FileReaderDemo.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\Copy.java"));
		
		// 读写数据
		String line;
		while((line= br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		// 释放资源
		br.close();
		bw.close();

	}

}
