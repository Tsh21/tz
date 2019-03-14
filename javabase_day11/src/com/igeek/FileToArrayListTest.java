package com.igeek;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToArrayListTest {

	public static void main(String[] args) throws IOException {
		//拿到缓冲输入流
		BufferedReader br = new BufferedReader(new FileReader("d:\\array.txt"));
		
		ArrayList<Student> aStudents  = new ArrayList<Student>();
		
		//读取数据
		String line;
		while((line =br.readLine()) != null) {
			String[] strings = line.split(",");
			Student student = new Student();
			student.setId(strings[0]);
			student.setName(strings[1]);
			student.setAge(strings[2]);
			student.setAddress(strings[3]);
			//添加到集合
			aStudents.add(student);
		}
		
		//释放资源
		br.close();
		
		//遍历
		for (int i = 0; i < aStudents.size(); i++) {
			//取出学生
			Student student  =aStudents.get(i);
			System.out.println(student.getId()+";"+student.getName()
			+";"+student.getAge()+";"+student.getAddress());
		}
		
	}

}
