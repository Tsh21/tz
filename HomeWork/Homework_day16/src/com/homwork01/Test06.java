package com.homwork01;

public class Test06 {

	public static void main(String[] args) {
		join(new Swim() {
			
			@Override
			public void swimming() {
				System.out.println("游泳.....");
			}
		});

	}
	
	public static void join(Swim s) {
		s.swimming();
	}

}
