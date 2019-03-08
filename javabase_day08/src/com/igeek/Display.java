package com.igeek;

public class Display {

	private int value = 0;
	private int limit = 0;

	public void increase() {
		value++;
		if (value == limit) {
			value = 0;
		}
	}

	public Display(int limit) {
		this.limit = limit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public static void main(String[] args) {
		Display display = new Display(60);
		for(;;) {
			display.increase();
			System.out.println(display.getValue());
		}
	}

}
