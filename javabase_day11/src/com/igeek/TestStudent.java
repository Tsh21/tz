package com.igeek;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class TestStudent {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Student> aStudents = new ArrayList<Student>();
		
		addStudent(aStudents);
		addStudent(aStudents);
		addStudent(aStudents);
		
		//拿到缓冲的输出流
		BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\array.txt"));
		
		//遍历集合
		for (int i = 0; i < aStudents.size(); i++) {
			//取出学生
			Student student  =aStudents.get(i);
			//按需求拼接
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(student.getId()).append(",")
			.append(student.getName()).append(",")
			.append(student.getAge()).append(",")
			.append(student.getAddress());
			//写数据
			bw.write(stringBuilder.toString());
			bw.newLine();
			bw.flush();
		}
		//释放资源
		bw.close();
	}
	
	//添加学生
	public static void addStudent(ArrayList<Student> aStudents) {
		Scanner scanner = new Scanner(System.in);
		String id;
		
		while(true) {
			System.out.println("请输入学生的学号：");
			id = scanner.nextLine();
			
			boolean flag = false;//哨兵
			//判断学号有没有存在
			for (int i = 0; i < aStudents.size(); i++) {
				Student stu = aStudents.get(i);
				if(stu.getId().equals(id)) {
					flag = true;
					break;
				}
			}
			
			if(flag) {
				System.out.println("你的学号已经存在，请重新输入！");
			}else{
				break;
			}
		}
		
		System.out.println("请输入学生的姓名：");
		String name = scanner.nextLine();
		System.out.println("请输入学生的年龄：");
		String age = scanner.nextLine();
		System.out.println("请输入学生的地址：");
		String address = scanner.nextLine();
		
		//
		Student student = new Student(id, name, age, address);
		
		aStudents.add(student);
		System.out.println("添加成功！");
		
	}

}
