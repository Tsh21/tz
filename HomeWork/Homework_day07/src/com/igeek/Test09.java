package com.igeek;

public class Test09 {

	public static void main(String[] args) {
		Imple01 imple01 = new Imple01();
		imple01.show("hello");
		
		Imple02<Integer> imple02 = new Imple02<>();
		imple02.show(888);
		
		Imple02<String> imple022 = new Imple02<>();
		imple022.show("java");

	}

}
