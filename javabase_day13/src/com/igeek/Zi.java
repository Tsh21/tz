package com.igeek;

public class Zi extends Fu{

	public Zi() {
//		super();
		System.out.println("子类的构造方法被调用了");
	}

	public Zi(String name) {
//		super();
		// TODO Auto-generated constructor stub
	}

//	public Zi(String name) {
////		super(name);
//		super();
//		System.out.println("子类的带参的构造方法被调用了");
//	}
	
	public static void main(String[] args) {
		Zi zi = new Zi("zhangsan");
	}
	
	

}
