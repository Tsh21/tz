package com.igeek;

import java.util.ArrayList;

/**
 * @author zx
 * @date 2019年3月18日
 * @version 1.0
 * @description：
 * 
   *  子类和子类型
 * 1.类定义了类型
 * 2.子类定义了子类型
 * 3.子类的对象当做父类的对象来使用
 * 3.1 赋值给父类的对象
 * 3.2 传递给需要的父类对象的函数
 * 3.3 放进存放父类对象的容器中去
 * 
 */
public class Database {
	
//	private ArrayList<CD> cdList = new ArrayList<CD>();
//	private ArrayList<DVD> dvdList = new ArrayList<DVD>();
	private ArrayList<Item> itemList = new ArrayList<Item>();
	
	//添加CD
//	public void add(CD cd) {
//		cdList.add(cd);
//	}
//	
//	public void add(DVD dvd) {
//		dvdList.add(dvd);
//	}
	

	public void add(Item item) {
		itemList.add(item);
	}

	public void list() {
		//遍历
//		for (CD cd : cdList) {
//			cd.print();
//		}
//		for (DVD dvd : dvdList) {
//			dvd.print();
//		}
		for (Item item : itemList) {
			item.print();
		}
	}
	
	public static void main(String[] args) {
		//拿到资料库
//		CD cd = new CD("test", "", 0, "");
//		System.out.println(cd instanceof CD);
//		System.out.println(cd instanceof Item);
//		System.out.println(cd instanceof Object);
//		
		/*当拿一个子类的对象当父类的对象来用的时候
		 * 向上造型是默认的
		 *  向上造型总是安全的
		*/
//		Item item = new Item("item", 0, "");
//		item = (Item)cd;
		//父类的对象不能赋值给子类的变量
//		CD cc = item;
		
		
//		System.out.println(item instanceof CD);
//		System.out.println(item instanceof DVD);
//		System.out.println(item instanceof Games);
//		·
//		System.out.println();
		
		Database db = new Database();
		db.add(new CD("绿光", "孙燕姿", 3, "期待著一个幸运 和一个冲击"));
		db.add(new CD("卡路里", "杨超越", 4, "燃烧我的卡路里"));
		db.add(new DVD("惊奇队长", "漫威", 120, "........"));
		db.add(new DVD("绿皮书", "Peter", 120, "......"));
		db.add(new Games("王者荣耀", "腾讯", 0, "......", "手游", "手机"));
		db.add(new Games("刺激战场","腾讯", 0, "......", "手游", "手机"));
		db.list();
	}

}
