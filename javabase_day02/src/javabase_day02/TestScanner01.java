package javabase_day02;

import java.util.Scanner;

/**
 * @author zx
 * @date 2019��2��28��
 * @version 1.0
 * @description������¼���������ݲ����
 */
public class TestScanner01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�������һ������");
		int a = scanner.nextInt();
		System.out.println("������ڶ�������");
		int b = scanner.nextInt();
		
		System.out.println("sum="+(a+b));
		

	}

}
