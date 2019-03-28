package com.itheima.level3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test21 {

	public static void main(String[] args) throws IOException {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		//相对路径
		BufferedReader br = new BufferedReader(new FileReader("student.txt"));
		//读取数据
		String str ;
		while((str = br.readLine())!=null) {
			str = str.trim();
			//按规则分割字符串
			String[] strings = str.split("\\s+");
			//类型转换
			int age = Integer.parseInt(strings[3]);
			//封装学生信息
			Student s = new Student(strings[0], strings[1], strings[2], age);
			arrayList.add(s);
		}
		
		//遍历学生信息
		for (Student student : arrayList) {
			System.out.println(student);
		}
		
		int sum=0;
		for (int i = 0; i < arrayList.size(); i++) {
			sum+=arrayList.get(i).getAge();
		}
		
		//计算平均值
		System.out.println("平均年龄："+sum/arrayList.size());

	}

}
