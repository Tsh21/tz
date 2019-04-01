package com.igeek;

import java.util.ArrayList;

public class MyIntegerDemo3 {
	
	public static void main(String[] args) {
		//数据类型一直没有指定；直到创建对象的时候确定类型
		MyIntegerDemo<String> demo = new MyIntegerDemo<>();
		//The method method(String) in the type 
		//MyIntegerDemo<String> is not applicable for the arguments (int)
		demo.method("hello");
	}

}
