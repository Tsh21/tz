package com.homwork01;

public class Test03 {

	public static void main(String[] args) {
		enter(new Sport() {
			
			@Override
			public void run() {
				System.out.println("参加运动会,奔跑吧");
			}
		});
		
		enter(new Running());
	}
	
	public static void enter(Sport s) {
		s.run();
	}

}
