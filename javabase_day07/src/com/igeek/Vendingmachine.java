package com.igeek;

/**
 * @author zx
 * @date 2019年3月7日
 * @version 1.0
 * @description：
 *   成员变量定义初始化：
 *   成员变量在定义初始化的地方就可以给出初始值
 *   没有初始值的成员变量会自动加上默认值
 *   定义初始化可以调用函数
 *   
 *   this 代表当前对象
 * 
 */
public class Vendingmachine {
	
	private int price=80;
	private int balance;
	private int total;
	
	public void setPrice(int price) {
		if(price<=0) {
			System.out.println("非法");
		}else {
			this.price = price;
		}
	}
	
	public int getPrice() {
		return this.price;
	}
	
	//构造函数   重载
	Vendingmachine(){
		total=0;
		System.out.println("调用无参的构造函数");
	}
	
	Vendingmachine(int money){
		this();
		this.balance = money;
		System.out.println("调用有一个参数的构造函数");
	}
	
	Vendingmachine(int balance, int total) {
		this.balance = balance;
		this.total = total;
		System.out.println("调用两个参数的构造函数");
	}
	
	//就近原则
	Vendingmachine(int price, int balance, int total) {
		this.price = price;
		this.balance = balance;
		this.total = total;
		System.out.println("调用三个参数的构造函数");
	}

	void insertMoney(int money){
		balance = balance + money;
	}

	void showprompt() {
		System.out.println("Welcome!");
	}
	
	private void showBalance() {
		System.out.println("balance:"+this.balance);
	}
	
	void getFood(){
		if(balance>=price) {
			System.out.println("Here you are!");
			balance = balance-price;
			total = total+price;
		}
	}
	
	public static void main(String[] args) {
		Vendingmachine vm = new Vendingmachine(100,0);
		vm.showprompt();
		vm.showBalance();
		vm.insertMoney(100);
		vm.showBalance();
		vm.getFood();
		Vendingmachine vm2= new Vendingmachine(75,200,10);
		vm2.showprompt();
		vm2.showBalance();
		vm2.insertMoney(300);
		vm2.showBalance();
		vm2.getFood();
		System.out.println("############################");
		Vendingmachine vm3 = new Vendingmachine(200, 100, 10);
		vm3.showBalance();
		System.out.println("############################");
		Vendingmachine vm4 = new Vendingmachine(999);
		vm4.showBalance();
		System.out.println(vm4.price);
	}
	
}
