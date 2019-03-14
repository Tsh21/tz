package com.igeek.studentManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author zx
 * @date 2019年3月11日
 * @version 1.0 @description： * 这是我的学生管理系统IO版
 * 
 *          步骤如下：
 *          A:定义学生类 
 *          B:学生管理系统的主界面的代码编写 
 *          C:学生管理系统的查看所有学生的代码编写
 *          D:学生管理系统的添加学生的代码编写 
 *          E:学生管理系统的删除学生的代码编写 
 *          F:学生管理系统的修改学生的代码编写
 * 
 */
public class StudentManagerTest {

	public static void main(String[] args) throws IOException {

		String filename = "d:\\students.txt";

		// 为了让程序能够回到这里来，我们使用循环
		while (true) {
			// 这是学生管理系统的主界面
			System.out.println("--------欢迎来到学生管理系统--------");
			System.out.println("1 查看所有学生");
			System.out.println("2 添加学生");
			System.out.println("3 删除学生");
			System.out.println("4 修改学生");
			System.out.println("5 退出");
			System.out.println("请输入你的选择：");
			// 创建键盘录入对象
			Scanner sc = new Scanner(System.in);
			String choiceString = sc.nextLine();
			// 用switch语句实现选择
			switch (choiceString) {
			case "1":
				// 查看所有学生
				findAllStudent(filename);
				break;
			case "2":
				// 添加学生
				addStudent(filename);
				break;
			case "3":
				// 删除学生
				deleteStudent(filename);
				break;
			case "4":
				// 修改学生
				updateStudent(filename);
				break;
			case "5":
				// 退出
				// System.out.println("谢谢你的使用");
				// break;
			default:
				System.out.println("谢谢你的使用");
				System.exit(0); // JVM退出
				break;
			}
		}
	}

	// 从文件中读数据到集合
	public static void readData(String fileName, ArrayList<Student> array) throws IOException {
		// 创建输入缓冲流对象
		BufferedReader br = new BufferedReader(new FileReader(fileName));

		String line;
		while ((line = br.readLine()) != null) {
			String[] datas = line.split(",");
			Student s = new Student();
			s.setId(datas[0]);
			s.setName(datas[1]);
			s.setAge(datas[2]);
			s.setAddress(datas[3]);
			array.add(s);
		}

		br.close();

	}

	// 把集合中的数据写入文件
	public static void writeData(String fileName, ArrayList<Student> array) throws IOException {
		// 创建输出缓冲流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));

		// 遍历
		for (int x = 0; x < array.size(); x++) {
			Student s = array.get(x);
			// 拼接
			StringBuilder sb = new StringBuilder();
			sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",")
					.append(s.getAddress());
			// 写数据
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		// 释放资源
		bw.close();

	}

	// 修改学生
	public static void updateStudent(String filename) throws IOException {

		ArrayList<Student> aStudents = new ArrayList<Student>();

		// 从文件中数据读取出来
		readData(filename, aStudents);

		Scanner scanner = new Scanner(System.in);
		System.out.println("请用户输入要修改的学生的学号：");
		String id = scanner.nextLine();

		int index = -1;
		for (int i = 0; i < aStudents.size(); i++) {
			Student stu = aStudents.get(i);
			if (stu.getId().equals(id)) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			System.out.println("您要修改的学生不存在，请回去重新选择！");
		} else {

			System.out.println("请输入学生的姓名：");
			String name = scanner.nextLine();
			System.out.println("请输入学生的年龄：");
			String age = scanner.nextLine();
			System.out.println("请输入学生的地址：");
			String address = scanner.nextLine();

			Student student = new Student(id, name, age, address);
			aStudents.set(index, student);

			// 把数据再写到student.txt中去
			writeData(filename, aStudents);

			System.out.println("修改成功！");

		}

	}

	// 删除学生
	public static void deleteStudent(String fileName) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<Student> aStudents = new ArrayList<Student>();

		// 从文件中数据读取出来
		readData(fileName, aStudents);

		Scanner scanner = new Scanner(System.in);
		System.out.println("请用户输入要删除的学生的学号：");
		String id = scanner.nextLine();

		// 返回学生的索引号
		int index = -1;
		for (int i = 0; i < aStudents.size(); i++) {
			Student stu = aStudents.get(i);
			if (stu.getId().equals(id)) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			System.out.println("您要删除的学生不存在，请回去重新选择！");
		} else {
			aStudents.remove(index);

			writeData(fileName, aStudents);
			System.out.println("删除成功");
		}

	}

	// 添加学生
	public static void addStudent(String fileName) throws IOException {

		// TODO Auto-generated method stub
		ArrayList<Student> aStudents = new ArrayList<Student>();

		// 从文件中数据读取出来
		readData(fileName, aStudents);

		Scanner scanner = new Scanner(System.in);
		String id;

		while (true) {
			System.out.println("请输入学生的学号：");
			id = scanner.nextLine();

			boolean flag = false;// 哨兵
			// 判断学号有没有存在
			for (int i = 0; i < aStudents.size(); i++) {
				Student stu = aStudents.get(i);
				if (stu.getId().equals(id)) {
					flag = true;
					break;
				}
			}

			if (flag) {
				System.out.println("你的学号已经存在，请重新输入！");
			} else {
				break;
			}
		}

		System.out.println("请输入学生的姓名：");
		String name = scanner.nextLine();
		System.out.println("请输入学生的年龄：");
		String age = scanner.nextLine();
		System.out.println("请输入学生的地址：");
		String address = scanner.nextLine();

		//新建学生对象
		Student student = new Student(id, name, age, address);

		aStudents.add(student);
		//写入数据
		writeData(fileName, aStudents);
		System.out.println("添加成功！");

	}

	// 查看所有学生
	public static void findAllStudent(String fileName) throws IOException {
		ArrayList<Student> aStudents = new ArrayList<Student>();
		readData(fileName, aStudents);
		
		if (aStudents.size() == 0) {
			System.out.println("沒有学生,请重新选择");
			return;
		}

		for (int i = 0; i < aStudents.size(); i++) {
			Student s = aStudents.get(i);
			System.out.println(s.getId() + ";" + s.getName() + ";" + s.getAge() + ";" + s.getAddress());
		}
	}

}
