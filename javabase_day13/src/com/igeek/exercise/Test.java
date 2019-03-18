package com.igeek.exercise;

public class Test {

	public static void main(String[] args) {
		Manager manager = new Manager("zs",10000,5000);
		Waiter w1 = new Waiter("ls", 5000);
		Waiter w2 = new Waiter("wr", 5000);
		Cook cook = new Cook("mz", 10000);
		
		double sum = getSum(manager,w1,w2,cook);
		System.out.println(sum);
		employeeWork(manager);
		employeeWork(w1);
		employeeWork(w2);
		employeeWork(cook);
	}

	public static double getSum(Manager manager, Waiter w1, Waiter w2, Cook cook) {
		// TODO Auto-generated method stub
		return manager.getSalary()+manager.getBounds()+w1.getSalary()+w2.getSalary()+cook.getSalary();
	}
	
	public static void employeeWork(Employee employee) {
		employee.work();
	}

}
