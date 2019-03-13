package com.igeek.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zx
 * @date 2019年3月13日
 * @version 1.0
 * @description：
 * 需求：
 * 把项目路径下的FileReaderDemo.java中的内容复制到项目路径下的Copy.java中
 * 
 * 读取FileReaderDemo.java  ---》 FileReader
 * 写入Copy.java			   ---》 FileWriter 
 */
public class FileRWTest {

	public static void main(String[] args) throws IOException {
		// 拿到对象
		FileReader fileReader = new FileReader("d:\\FileReaderDemo.java");
		FileWriter fileWriter = new FileWriter("d:\\Copy.java");
		
		//读写数据
		int ch;
		while((ch = fileReader.read()) != -1) {
			fileWriter.write(ch);
		}
		
		//释放资源
		fileReader.close();
		fileWriter.close();

	}

}
