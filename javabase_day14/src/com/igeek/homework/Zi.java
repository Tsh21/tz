package com.igeek.homework;

public class Zi extends Fu{
	
	String name;
	
	public Zi(String name) {
//		super();
		super("ls");
		this.name = name;
	}
	
	public void print() {
		System.out.println(this.name);
		System.out.println(super.name);
		say();
		super.say();
	}
	
	
	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("叫哥");
	}

	public static void main(String[] args) {
		Zi zi  = new Zi("ZS"); 
		zi.print();
	}
	
}
