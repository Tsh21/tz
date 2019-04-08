package com.igeek.part03;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author zx
 * @date 2019年4月8日
 * @version 1.0
 * @description:
 * 一个学科中有若干班级，每一个班级又有若干学生。整个学科一个大集合，若干个班级分为每一个小集合(集合嵌套之HashSet嵌套HashSet)。要求如下
	1、 学生类有两个属性，姓名和年龄，并定义有参构造、无参构造和getter/setter方法.姓名和年龄相同的视为同一学生
	2、向班级集合中添加若干个学生（至少两个学生）。
	2、向学科集合中添加所有班级(至少创建两个班级)。
	3、使用两种方法遍历学科集合，并打印出所有学生。

 */
public class Test02 {

	public static void main(String[] args) {
		
		HashSet<Student> class1 = new HashSet<>();
		class1.add(new Student("wb", 20));
		class1.add(new Student("cz", 21));
		class1.add(new Student("cz", 21));
		
		HashSet<Student> class2 = new HashSet<>();
		class2.add(new Student("lzx", 20));
		class2.add(new Student("zh", 21));
		
		//集合嵌套
		HashSet<HashSet<Student>> subject = new HashSet<>();
		subject.add(class1);
		subject.add(class2);
		
		for (HashSet<Student> clazz : subject) {
			for(Student student : clazz) {
				System.out.println(student.getName()+";"+student.getAge());
			}
		}
		
		System.out.println("#####Iterator遍历#######");
		Iterator<HashSet<Student>> iterator = subject.iterator();
		
		while(iterator.hasNext()) {
			HashSet<Student> clazz = iterator.next();
			Iterator<Student> iterator2 = clazz.iterator();
			
			while(iterator2.hasNext()) {
				Student stu = iterator2.next();
				System.out.println(stu.getName()+";"+stu.getAge());
				
			}
		}
		
		

	}

}
