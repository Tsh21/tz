package com.igeek;

import java.util.ArrayList;

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
