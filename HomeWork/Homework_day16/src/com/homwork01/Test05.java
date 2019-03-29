package com.homwork01;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet pet = new Pet() {
			
			@Override
			public void eat() {
				System.out.println("宠物"+getName()+"吃鱼");
			}
		};
		pet.setName("Tom");
		pet.eat();
		
		new Pet("小黑") {
			
			@Override
			public void eat() {
				System.out.println("宠物"+getName()+"啃骨头");
			}
		}.eat();
		
	}

}
