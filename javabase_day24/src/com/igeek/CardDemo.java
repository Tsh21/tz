package com.igeek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @author zx
 * @date 2019年4月9日
 * @version 1.0
 * @description: 
 * 1.组装54张扑克牌 
 * 2. 将54张牌顺序打乱 
 * 3. 三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌。
 * 4. 查看三人各自手中的牌（按照牌的大小排序）、底牌 手中扑克牌从大到小的摆放顺序：大王,小王,2,A,K,Q,J,10,9,8,7,6,5,4,3
 */
public class CardDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		// 准备牌

		// 定义花色的集合
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("♣");
		colors.add("♦");
		colors.add("♠");
		colors.add("♥");

		// 定义数字的集合
		ArrayList<String> numbers = new ArrayList<String>();
		for (int i = 3; i <= 10; i++) {
			numbers.add(i + "");
		}
		Collections.addAll(numbers, "J", "Q", "K", "A","2");

		// 定义数字，记录数字与字符串纸牌的对应关系
		int countNumber = 0;
		// 嵌套迭代完成每张牌的组装
		for (String number : numbers) {
			for (String color : colors) {
				// 通过花色与数字拼接成对应的每张牌
				String thisCard = color + number;
				map.put(countNumber, thisCard);
				countNumber++;
			}
		}

		map.put(countNumber++, "小王");
		map.put(countNumber, "大王");

		// 备牌
		ArrayList<Integer> pocker = new ArrayList<>();
		for (int i = 0; i < 54; i++) {
			pocker.add(i);
		}
		
		// 将54张牌顺序打乱
		Collections.shuffle(pocker);

		// 为三位玩家分别设计手牌
		ArrayList<Integer> player1 = new ArrayList<Integer>();
		ArrayList<Integer> player2 = new ArrayList<Integer>();
		ArrayList<Integer> player3 = new ArrayList<Integer>();
		// 底牌
		ArrayList<Integer> dipai = new ArrayList<Integer>();
		

		// 发牌
		for (int i = 0; i < pocker.size() - 3; i++) {
			// 取出当前牌
			Integer thisCard = pocker.get(i);

			// 对3取模依次发牌
			if (i % 3 == 0) {
				player1.add(thisCard);
			} else if (i % 3 == 1) {
				player2.add(thisCard);
			} else {
				player3.add(thisCard);
			}
		}

		// 最后的三张底牌
		for (int i = pocker.size() - 3; i < pocker.size(); i++) {
			Integer thisCard = pocker.get(i);
			dipai.add(thisCard);
		}
		
		//排序
		Collections.sort(player1);
		Collections.sort(player2);
		Collections.sort(player3);
		Collections.sort(dipai);
		
		//看牌
		System.out.print("player1:");
		for(int i=player1.size()-1;i>=0;i--) {
			Integer integer = player1.get(i);
			String card = map.get(integer);
			System.out.print(card+" ");
		}
		
		System.out.println();
		System.out.print("player2:");
		for(int i=player2.size()-1;i>=0;i--) {
			Integer integer = player2.get(i);
			String card = map.get(integer);
			System.out.print(card+" ");
		}
		
		System.out.println();
		System.out.print("player3:");
		for(int i=player3.size()-1;i>=0;i--) {
			Integer integer = player3.get(i);
			String card = map.get(integer);
			System.out.print(card+" ");
		}
		
		System.out.println();
		System.out.print("底牌:");
		for(int i=dipai.size()-1;i>=0;i--) {
			Integer integer = dipai.get(i);
			String card = map.get(integer);
			System.out.print(card+" ");
		}

	}

}
