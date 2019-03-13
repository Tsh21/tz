package com.igeek.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zx
 * @date 2019年3月13日
 * @version 1.0
 * @description：
 * 利用字符数组拷贝文件
 */
public class FileRWTest02 {

	public static void main(String[] args) throws IOException {
		// 拿到对象
		FileReader fileReader = new FileReader("d:\\FileReaderDemo.java");
		FileWriter fileWriter = new FileWriter("d:\\Copy.java");
		
		//读写数据
		char[] chs = new char[1024];
		int len;
		while((len=fileReader.read(chs)) != -1) {
			fileWriter.write(chs,0,len);
		}
		
		//释放资源
		fileReader.close();
		fileWriter.close();

	}

}
