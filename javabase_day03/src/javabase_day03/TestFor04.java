package javabase_day03;

/**
 * @author zx
 * @date 2019年3月1日
 * @version 1.0
 * @description：嵌套循坏
 * 2.打印
 *    1	1 1 1 1
 *	  2	2 2 2 2
 *    3	3 3 3 3
 *    4	4 4 4 4
 *    5	5 5 5 5 
 */
public class TestFor04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5; i++) {
			
			for(int j=1;j<=5;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
