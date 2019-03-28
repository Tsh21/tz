package com.itheima.level2;

public class Test16 {

	public static void main(String[] args) {
		String str = "  anglebaby  	女 	 18	  515151511  ";
		str = str.trim();
		String[] strs = str.split("\\s+");
		//把年龄字符串转换int类型,赋值给变量age
		int age = Integer.parseInt(strs[2]);
		//使用满参构造创建Student对象s,传入对应的数据
		Student s = new Student(strs[0], strs[1], age, strs[3]);
		System.out.println(s);
		
		//判断该学生的QQ号码是否合法,如果合法输出QQ号码合法,否则输出QQ号码不合法
		// 并判断QQ号是否合法,匹配规则,全部都是数字,第一位非0,长度为5到12位. 
		if(s.getQq().matches("[1-9][0-9]{4,11}")) {
			System.out.println("合法");
		}else {
			System.out.println("非法");
		}

	}

}
