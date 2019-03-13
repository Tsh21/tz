package com.igeek.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zx
 * @date 2019年3月13日
 * @version 1.0
 * @description：
 * 如何实现数据的换行?
 * 		\n可以实现换行，但是windows系统自带的记事本打开并没有换行，这是为什么呢?
 * 		因为windows识别的换行不是\n，而是\r\n
 * 		windows:\r\n
 * 		linux:\n
 * 		mac:\r
 * 如何实现数据的追加写入?
 * 		FileWriter(String fileName, boolean append)

 */
public class FileWriterDemo04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("d:\\d.txt",true);
//		String os = System.getProperty("os.name");
//		System.out.println(os);
//		fw.write("hello");
//		fw.write("\r\n");
//		fw.write("java");
		for (int i = 0; i < 10; i++) {
			fw.write("hello"+i);
			fw.write("\r\n");
		}
		fw.close();
		System.out.println("资源关闭");
	}

}
