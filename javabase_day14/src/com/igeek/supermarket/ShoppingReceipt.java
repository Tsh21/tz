package com.igeek.supermarket;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingReceipt {

	// 成员位置定义集合，定义方法向集合中存储所有GoodsItem数据
	static ArrayList<GoodsItem> data = new ArrayList<GoodsItem>();

	public static void main(String[] args) {
		//初始化数据
		initData();
		
		//打印欢迎语句
		System.out.println("欢迎使用超市管理系统!");

		while(true) {
			//使用switch给出操作选择：1输入购买数量2打印小票3退出
			//提示信息
			System.out.println("请输入您要进行的操作:1输入购买数量   2打印小票   3退出");
			
			//通过键盘录入得到数据
			Scanner sc = new Scanner(System.in);
			int optNumber = sc.nextInt();
			//完成switch中三个case的逻辑
			switch (optNumber) {
			case 1:
//				System.out.println("给所有数据量赋值");
				enterNumber();
				break;
			case 2:
				//调用打印购物小票的方法
//				System.out.println("打印购物小票");
				printReceipt();
				break;
			case 3:
				System.out.println("欢迎下次光临");
				//退出程序
				System.exit(0);
			default:
				System.out.println("请输入正确的数字!");
				break;
			}

		}
	}

	public static void printReceipt() {
		System.out.println("欢迎光临");
		System.out.println("品名\t售价\t数量\t金额");
		System.out.println("-------------------------------------------");
		
		double totalMoney=0;
		int totalNumber=0;
		//遍历
		for (int i = 0; i < data.size(); i++) {
			GoodsItem item = data.get(i);
			//打印
			System.out.println(item.getName()+"\t"+item.getPrice()
			+"\t"+item.getNumber()+"\t"+item.getMoney());
			//总金额
			totalMoney += item.getMoney();
			//总数量
			totalNumber += item.getNumber();
		}
		
		System.out.println("-------------------------------------------");
		System.out.println("共"+data.size()+"项商品");
		System.out.println("共"+totalNumber+"件商品");
		System.out.println("共"+totalMoney+"元");
		
	}

	public static void enterNumber() {
		//遍历集合
		for (int i = 0; i < data.size(); i++) {
			//拿到商品
			GoodsItem goodsItem  =data.get(i);
			
			System.out.println("请输入"+goodsItem.getName()+"的购买数量");
			Scanner scanner = new Scanner(System.in);
			int GoodsNumber = scanner.nextInt();
			
			//根据数量计算商品的金额
			double total = goodsItem.getPrice()*GoodsNumber;
			
			goodsItem.setNumber(GoodsNumber);
			goodsItem.setMoney(total);
			
		}
	}

	// 初始化数据
	public static void initData() {
		// 创建多个商品项对象
		GoodsItem sls = new GoodsItem("少林寺核桃", "090115", 15.5, 0, "个", 0);
		GoodsItem shk = new GoodsItem("尚康饼干", "090027", 14.5, 0, "个", 0);
		
		data.add(sls);
		data.add(shk);

	}

}
