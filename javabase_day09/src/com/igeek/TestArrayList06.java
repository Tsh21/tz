package com.igeek;

import java.util.ArrayList;

/**
 * @author zx
 * @date 2019年3月11日
 * @version 1.0
 * @description：
 * A:自定义一个学生类,学生中有姓名和年龄属性,生成满参构造与空参构造
	生成属性对应的getter/setter方法
   B:在测试类中使用满参构造创建三个学生对象,然后将每个学生对象均添加到ArrayList集合中
   C:遍历这个ArrayList集合,依次打印出每个学生的姓名和年龄
 */
public class TestArrayList06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Student wangbo = new Student(1, "王博", 20);
		Student wancy = new Student(2, "万晨阳", 20);
		Student daizy = new Student(3, "戴宗一", 20);
		arrayList.add(daizy);
		arrayList.add(wancy);
		arrayList.add(wangbo);
		
		
		for (int i = 0; i < arrayList.size(); i++) {
			Student s = arrayList.get(i);
			System.out.println(s.getName()+";"+s.getAge()+";"+s.getId());
		}
//		System.out.println(arrayList);

	}

}
