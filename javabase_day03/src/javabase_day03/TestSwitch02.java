package javabase_day03;

/**
 * @author zx
 * @date 2019��3��1��
 * @version 1.0
 * @description������ƴ��
 *  a e i o u ��Ԫ��
 *  y w ��Ԫ��
 *  ���� ����
 */
public class TestSwitch02 {

	public static void main(String[] args) {
		
		char a = 'a';
		int rand = (int) (26*(Math.random()));
//		System.out.println(rand);
		char b =(char) (a+rand);
		System.out.println("��ĸ"+b);
		switch (b) {
		case 'a':
		case 'e':
		case 'u':
		case 'i':
		case 'o':
			System.out.println("Ԫ��");
			break;
		case 'y':
		case 'w':
			System.out.println("��Ԫ��");
			break;
		default:
			System.out.println("����");
			break;
		}
		

	}

}
