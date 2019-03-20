package com.igeek.homework03;

public abstract class Vehicle {
	
	private String color;
	private int wheel;
	
	//抽象方法
	public abstract void run();

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String color, int wheel) {
		super();
		this.color = color;
		this.wheel = wheel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

}
