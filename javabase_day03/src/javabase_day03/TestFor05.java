package javabase_day03;

/**
 * @author zx
 * @date 2019��3��1��
 * @version 1.0
 * @description��
 * ������forѭ�����1~1000֮���ܱ�5������������ÿ�����5����
 */
public class TestFor05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h=0;
		for(int i=1;i<=1000;i++) {
			//�ܱ�5����
			if(i%5 == 0) {
				System.out.print(i+"\t");
				h++;
			}
//			if(h==5) {
//				System.out.println();
//				h=0;
//			}
			if(i%25 == 0) {
				System.out.println();
			}
		}
	}

}
