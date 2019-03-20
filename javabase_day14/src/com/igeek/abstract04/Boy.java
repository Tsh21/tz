package com.igeek.abstract04;

public class Boy extends Person {
	
	private Girl girlFriend;

	@Override
	public void say(String content) {
		System.out.println(getName()+"用带有阳刚之气的声音对"+girlFriend.getName()+"说"+content);
	}
	
	public void walking() {
		System.out.println(getName()+"和"+girlFriend.getName()+"在河边的林荫小道上手牵着手散步");
	}

	public Boy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Boy(String name, int age, double height,Girl girlFriend) {
		super(name, age, height);
		this.girlFriend = girlFriend;
	}

	public Girl getGirlFriend() {
		return girlFriend;
	}

	public void setGirlFriend(Girl girlFriend) {
		this.girlFriend = girlFriend;
	}
	
}
