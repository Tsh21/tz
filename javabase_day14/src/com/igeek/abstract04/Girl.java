package com.igeek.abstract04;

public class Girl extends Person {
	
	private String face;

	@Override
	public void say(String content) {
		System.out.println(getName()+"微笑着用于甜美的声音对慕容紫英说:"+content);
	}
	
	public void wash(Clothes c){
		System.out.println(getName()+"在洗一件"+c.getColor()+"的"+c.getBrand()+"的衣服");
	}

	public Girl() {
		super();
	}

	public Girl(String name, int age, double height,String face) {
		super(name, age, height);
		this.face = face;
	}

	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}
	
	

}
