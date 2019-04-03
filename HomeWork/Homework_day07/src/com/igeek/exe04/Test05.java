package com.igeek.exe04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author zx
 * @date 2019年4月3日
 * @version 1.0
 * @description:
 * 
 * 1.不要大王和小王 
 * 2.使52张牌打乱顺序 
 * 3.四个玩家,每个玩家随机获取2张牌,注意玩家抽走的牌不能再给其他玩家使用
 * 4.将2张牌相加比较点数大小.A=1,J=11,Q=12,K=13 
 * 5.打印玩家中2张牌加起来最大的点数
 * 
 */
public class Test05 {

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
	
	// 发牌
	public static void dealPokers(ArrayList<String> pokers) {
		// 为四位玩家分别设计手牌
		ArrayList<String> player1 = new ArrayList<>();
		ArrayList<String> player2 = new ArrayList<>();
		ArrayList<String> player3 = new ArrayList<>();
		ArrayList<String> player4 = new ArrayList<>();
		
		//四个玩家,每个玩家随机获取2张牌,注意玩家抽走的牌不能再给其他玩家使用
		ArrayList<Integer> removePoker = new ArrayList<>();
		
		getPoker(player1,pokers,removePoker);
		getPoker(player2,pokers,removePoker);
		getPoker(player3,pokers,removePoker);
		getPoker(player4,pokers,removePoker);

		// 发牌
		System.out.println("player1:" + player1);
		System.out.println("player2:" + player2);
		System.out.println("player3:" + player3);
		System.out.println("player4:" + player4);
		
		int[] numbers = new int[4];
		numbers[0] = getPoints(player1);
		numbers[1] = getPoints(player2);
		numbers[2] = getPoints(player3);
		numbers[3] = getPoints(player4);
		
		//最大点数
		int max = numbers[0];
		for(int score : numbers) {
			if(max < score) {
				max = score;
			}
		}
		
		//打印玩家中2张牌加起来最大的点数
		System.out.println("四位玩家中的最大点数："+max);
		

	}
	
	//根据玩家的手牌，计算点数
	public static int getPoints(ArrayList<String> player) {
		int score = 0;
		//遍历玩家的手牌
		for (String card : player) {
			if(card.contains("A")) {
				score += 1;
			} else if (card.contains("J")) {
				score += 11;
			} else if (card.contains("Q")) {
				score += 12;
			} else if (card.contains("K")) {
				score += 13;
			} else {
				score += Integer.valueOf(card.substring(1));
			}
		}
		return score;
	}
	
	
	
	//每个玩家随机获取2张牌,注意玩家抽走的牌不能再给其他玩家使用
	public static void getPoker(ArrayList<String> player,ArrayList<String> pokers,ArrayList<Integer> removePoker) {
		
		Random random = new Random();
		
		//如果玩家手牌小于2张，就拿一张牌
		while(player.size() <2) {
			//随机生成牌（pokers）中的下标（索引）
			int index = random.nextInt(52);
			//判断这张牌是否已经被玩家抽走
			if(!removePoker.contains(index)) {
				//这张牌没有被别人拿走，发牌给玩家
				player.add(pokers.get(index));
				//维护已经被玩家抽走的牌
				removePoker.add(index);
			}
		}
		
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

	}

	// 洗牌
	public static void washPokers(ArrayList<String> pokers) {
		Collections.shuffle(pokers);
	}

}
