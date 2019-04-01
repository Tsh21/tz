package com.igeek.card;

import java.util.ArrayList;
import java.util.Collections;

public class CardDemo {

	public static void main(String[] args) {
		//准备牌,记录一副牌的集合
		ArrayList<String> poker = new ArrayList<String>();
		
		//定义花色的集合
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("♣");
		colors.add("♦");
		colors.add("♠");
		colors.add("♥");
		
		//定义数字的集合
		ArrayList<String> numbers = new ArrayList<String>();
		for(int i=2;i<=10;i++) {
			numbers.add(i+"");
		}
		numbers.add("J");
		numbers.add("Q");
		numbers.add("K");
		numbers.add("A");
		
		//嵌套迭代完成每张牌的组装
		for(String color : colors) {
			for(String number : numbers) {
				//通过花色与数字拼接成对应的每张牌
				String thisCard = color+number;
				poker.add(thisCard);
			}
		}
		
		//添加大小王
		poker.add("大☺");
		poker.add("小☺");
		
//		System.out.println(poker);
//		System.out.println("##########");
		//洗牌
		Collections.shuffle(poker);
//		System.out.println(poker);
		
		//为三位玩家分别设计手牌
		ArrayList<String> player1 = new ArrayList<>();
		ArrayList<String> player2 = new ArrayList<>();
		ArrayList<String> player3 = new ArrayList<>();
		//底牌
		ArrayList<String> dipai = new ArrayList<>();
		
		//发牌
		for(int i=0;i<poker.size()-3;i++) {
			//取出当前牌
			String thisCard = poker.get(i);
			
			//对3取模依次发牌
			if(i%3 == 0) {
				player1.add(thisCard);
			}else if(i%3 == 1) {
				player2.add(thisCard);
			}else {
				player3.add(thisCard);
			}
		}
		
		//最后的三张底牌
		for(int i = poker.size()-3;i<poker.size();i++) {
			String thisCard = poker.get(i);
			dipai.add(thisCard);
		}
		
		//看牌
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);
		System.out.println(dipai);

	}

}
