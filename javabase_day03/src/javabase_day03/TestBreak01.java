package javabase_day03;

/**
 * @author zx
 * @date 2019��3��1��
 * @version 1.0
 * @description��break
 */
public class TestBreak01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(;;) {}
		while(true) {
			int i = (int)(100*Math.random());
			System.out.println(i);
			if(i == 88) {
				break;
			}
		}
		System.out.println("�ҵ���");
	}

}
