package com.homwork01;

public class Test04 {

	public static void main(String[] args) {
		join(new Player() {
			
			@Override
			public void playVolleyball() {
				System.out.println("在打篮球");
			}
			
			@Override
			public void playFootball() {
				System.out.println("在踢足球");
			}
			
			@Override
			public void playBasketball() {
				System.out.println("在打排球");
			}
		});

	}
	
	public static void join(Player p) {
		p.playBasketball();
		p.playFootball();
		p.playVolleyball();
	}

}
