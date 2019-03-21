package com.igeek.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingReceipt {
	/**  
	* @Fields data : 成员位置定义集合,存储所有的商品项对象 
	*/  
	static ArrayList<GoodsItem> data = new ArrayList<GoodsItem>();
	
	public static void main(String[] args) {
		//为集合准备数据
		initData();
		
		//打印欢迎语句
		System.out.println("欢迎使用超市管理系统!");
		
		//使用死循环完成反复操作的逻辑
		//for(;;) {}
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
				//System.out.println("给所有数据量赋值");
				//调用给所有数据的数量与金额赋值方法
				enterNumber();

				break;
			case 2:
				//System.out.println("打印购物小票");
				//调用打印购物小票的方法
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

	/**  
	* @Title: initData  
	* @Description: 定义方法,向成员位置的集合赋值      
	*/
	public static void initData() {
		//创建多个商品项对象
		GoodsItem sls = new GoodsItem("少林寺核桃", "090115", 15.5, 0, "个", 0);
		GoodsItem shk = new GoodsItem("尚康饼干", "090027", 14.5, 0, "个", 0);
		//将多个商品项对象放入集合中
		data.add(sls);
		data.add(shk);
	}
	
	
	/**  
	* @Title: enterNumber  
	* @Description: 为所有的数据赋值数量与金额      
	*/
	public static void enterNumber() {
		
		//集合的遍历
		for (int i = 0; i <data.size(); i++) {
			//依次获取到集合中每一个元素
			GoodsItem thisGoods = data.get(i);
			
			//提示用户,输入该商品项的数量
			//获取该商品项名称
			String thisGoodsName = thisGoods.getName();
			System.out.println("请输入"+thisGoodsName+"的购买数量");
			
			//键盘录入接受商品数量
			Scanner sc = new Scanner(System.in);
			int thisGoodsNumber = sc.nextInt();
			//根据数量计算金额金额 = 单价 * 数量
			double thisGoodsMoney = thisGoods.getPrice() * thisGoodsNumber;
			
			//为该商品的数量与金额赋值
			thisGoods.setNumber(thisGoodsNumber);
			thisGoods.setMoney(thisGoodsMoney);
		}
	}
	
	/**  
	* @Title: printReceipt  
	* @Description: 打印小票方法      
	*/
	private static void printReceipt() {
		//static ArrayList<GoodsItem> data = new ArrayList<GoodsItem>();
		//票头
		System.out.println("    欢迎光临");
		System.out.println("品名\t售价\t数量\t单位\t金额");
		System.out.println("-------------------------------------------");
		//票体
		//定义变量,记录所有的商品数量
		int totalNumber = 0;
		//定义变量,记录所有的商品金额
		double totalMoney = 0;
		//遍历集合
		for (int i = 0; i <data.size(); i++) {
			//依次获取每一个商品项
			GoodsItem g = data.get(i);
			//打印商品项
			System.out.println(g.getName()+g.getId()+"\t"+g.getPrice()+"\t"+g.getNumber()+" "+g.getUnit()+"\t"+g.getMoney());
			
			//累加数量与金额
			totalNumber += g.getNumber();
			totalMoney += g.getMoney();
		}
		System.out.println("-------------------------------------------");
		//票脚
		System.out.println("共"+data.size()+"项商品");
		System.out.println("共"+totalNumber+"件商品");
		System.out.println("共"+totalMoney+"元");
		System.out.println();
	}


}
