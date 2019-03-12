package com.igeek;

/**
 * @author zx
 * @date 2019年3月11日
 * @version 1.0
 * @description：
 * Alt_shift+s
 */
public class Phone {
	
	private String color;
	private String brand;
	private double price;
	
	public Phone() {
	}
	
	public Phone(String color, String brand, double price) {
		this.color = color;
		this.brand = brand;
		this.price = price;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
