package com.homwork01;

//修饰成员变量，需要在创建对象前赋值，否则报错。(当没有显式赋值时，多个构造方法的均需要为其赋值。
public class Final_5 {
	public final int a = 10;
	//The blank final field b may not have been initialized
	public final int b;
	
	public Final_5() {
		super();
		this.b = 20;
	}

	public Final_5(int b) {
		super();
		this.b = b;
	}
	
	
	
}
