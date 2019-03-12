package com.igeek;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author zx
 * @date 2019年3月11日
 * @version 1.0
 * @description：
 * 创建一个集合，存储学生对象，学生对象的数据来自于键盘录入，最后，遍历集合
 * 
 * 注意：为了方便使用，我把学生类中的所有成员定义为String类型
 * 
 * 分析：
 * 		A:定义学生类
 * 		B:创建集合对象
 * 		C:键盘录入数据,创建学生对象,把键盘录入的数据赋值给学生对象的成员变量
 * 		D:把学生对象作为元素存储到集合中
 * 		E:遍历集合
 */
public class TestArrayList07 {

	public static void main(String[] args) {
		//创建ArrayList对象
		ArrayList<com.igeek.test.Student> arrayList = new ArrayList<com.igeek.test.Student>();
		
		//添加学生
		addStudent(arrayList);
		addStudent(arrayList);
		addStudent(arrayList);
		
		//遍历
		for (int i = 0; i < arrayList.size(); i++) {
			com.igeek.test.Student s = arrayList.get(i);
			System.out.println(s.getName()+";"+s.getAge());
		}

	}

	public static void addStudent(ArrayList<com.igeek.test.Student> arrayList) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("请输入学生的姓名：");
		String name = scanner.nextLine();
		System.out.println("请输入学生的年龄：");
		String age = scanner.nextLine();
		
		com.igeek.test.Student student = new com.igeek.test.Student();
		student.setName(name);
		student.setAge(age);
		
		//添加到集合中去
		arrayList.add(student);
		
		
	}

}
