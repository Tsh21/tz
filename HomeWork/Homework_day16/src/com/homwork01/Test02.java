package com.homwork01;

public class Test02 {
	
	public static void main(String[] args) {
		Employee e = new Employee() {
			
			@Override
			public void work() {
				System.out.println("工号为"+getId()+"的员工"+getName()+"在努力的敲代码");
			}
		};
		e.setId("001");
		e.setName("范冰冰");
		e.work();
	}

}
