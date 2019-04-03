package com.igeek.exe04;

/**
 *    1.增加需求:哪个玩家拿到大王,就需要拿底牌
 */
import java.util.ArrayList;
import java.util.Collections;

public class Test04 {
	public static void main(String[] args) {
		// 准备牌,记录一副牌的集合
		ArrayList<String> pokers = new ArrayList<String>();

		// 添加牌
		addPokers(pokers);
		// 洗牌
		washPokers(pokers);
		// 发牌
		dealPokers(pokers);

	}

	public static void dealPokers(ArrayList<String> pokers) {
		// 为三位玩家分别设计手牌
		ArrayList<String> player1 = new ArrayList<>();
		ArrayList<String> player2 = new ArrayList<>();
		ArrayList<String> player3 = new ArrayList<>();
		// 底牌
		ArrayList<String> dipai = new ArrayList<>();
		
		//发牌
		for(int i=0;i<pokers.size();i++) {
			//取出当前牌
			String thisCard = pokers.get(i);
			if(i>51) {
				dipai.add(thisCard);
			} else if (i%3 == 0) {
				player1.add(thisCard);
			} else if (i%3 == 1) {
				player2.add(thisCard);
			} else if (i%3 ==2) {
				player3.add(thisCard);
			}
		}
		
		System.out.println("底牌："+dipai);
		
		//哪个玩家拿到大王,就需要拿底牌
		if(player1.contains("大王")) {
			player1.addAll(dipai);
		}else if(player2.contains("大王")) {
			player2.addAll(dipai);
		}else if(player3.contains("大王")) {
			player3.addAll(dipai);
		}
		
		System.out.println("player1:"+player1);
		System.out.println("player2:"+player2);
		System.out.println("player3:"+player3);

	}

	// 添加牌
	public static void addPokers(ArrayList<String> pokers) {
		// 定义花色的集合
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("♣");
		colors.add("♦");
		colors.add("♠");
		colors.add("♥");

		// 定义数字的集合
		ArrayList<String> numbers = new ArrayList<String>();
		for (int i = 2; i <= 10; i++) {
			numbers.add(i + "");
		}
		numbers.add("J");
		numbers.add("Q");
		numbers.add("K");
		numbers.add("A");

		// 嵌套迭代完成每张牌的组装
		for (String color : colors) {
			for (String number : numbers) {
				// 通过花色与数字拼接成对应的每张牌
				String thisCard = color + number;
				pokers.add(thisCard);
			}
		}

		// 添加大小王
		pokers.add("大王");
		pokers.add("小王");

	}

	// 洗牌
	public static void washPokers(ArrayList<String> pokers) {
		Collections.shuffle(pokers);
	}
}
