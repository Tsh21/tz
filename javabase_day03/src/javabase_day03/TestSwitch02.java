package javabase_day03;

/**
 * @author zx
 * @date 2019年3月1日
 * @version 1.0
 * @description：中文拼音
 *  a e i o u 是元音
 *  y w 半元音
 *  其他 辅音
 */
public class TestSwitch02 {

	public static void main(String[] args) {
		
		char a = 'a';
		int rand = (int) (26*(Math.random()));
//		System.out.println(rand);
		char b =(char) (a+rand);
		System.out.println("字母"+b);
		switch (b) {
		case 'a':
		case 'e':
		case 'u':
		case 'i':
		case 'o':
			System.out.println("元音");
			break;
		case 'y':
		case 'w':
			System.out.println("半元音");
			break;
		default:
			System.out.println("辅音");
			break;
		}
		

	}

}
