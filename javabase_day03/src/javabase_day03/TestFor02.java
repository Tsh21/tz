package javabase_day03;

/**
 * @author zx
 * @date 2019年3月1日
 * @version 1.0
 * @description：
 */
public class TestFor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for (i = 1; i < 11; i++) {
			System.out.println(i +" ");
		}
		System.out.println(i);
		
		//死循环
		for(;;) {
			System.out.println("我爱编程");
		}
	}

}
