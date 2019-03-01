package javabase_day03;

/**
 * @author zx
 * @date 2019年3月1日
 * @version 1.0
 * @description：continue  结束本次循环，进入循环的 下一次
 */
public class TestContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=1; x<=10; x++) {
			if(x == 3) {
				continue;
			}
			System.out.println(x);
		}
	}

}
