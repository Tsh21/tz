package javabase_day03;

/**
 * @author zx
 * @date 2019年3月1日
 * @version 1.0
 * @description：
 * 需求：用for循环输出1~1000之间能被5整除的数，且每行输出5个；
 */
public class TestFor05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h=0;
		for(int i=1;i<=1000;i++) {
			//能被5整除
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
