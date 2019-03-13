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
 * 缓冲流的特殊功能：
 * BufferedWriter
 * 		void newLine():写一个换行符，这个换行符由系统决定
 * BufferedReader
 * 		String readLine():一次读取一行数据，但是不读取换行符

 */
public class BufferedStreamDemo02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		BufferedWriter bw =new BufferedWriter(new FileWriter("d:\\g.txt"));
////		bufferedWriter.write("hello1");
////		bufferedWriter.newLine();
////		bufferedWriter.write("hello2");
////		bufferedWriter.newLine();
//		for(int x=0; x<10; x++) {
//			bw.write("hello"+x);
////			bw.write("\r\n");
//			bw.newLine();
//			bw.flush();
//		}
//		
//		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("d:\\g.txt"));
//		String line = br.readLine();
//		System.out.print(line);
//		
//		line = br.readLine();
//		System.out.print(line);
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
		
	}

}
