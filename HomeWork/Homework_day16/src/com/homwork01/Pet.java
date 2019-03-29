package com.homwork01;

public abstract class Pet {
	
	private String name;
	
	public abstract void eat();

	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pet(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
