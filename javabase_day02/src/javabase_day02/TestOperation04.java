package javabase_day02;

/**
 * @author zx
 * @date 2019年2月28日
 * @version 1.0
 * @description：逻辑运算符  &,|,^,! &&,|| 
 *  &逻辑与:有false则false。
 	|逻辑或:有true则true。
 	^逻辑异或:相同为false，不同为true。
 	!逻辑非:非false则true，非true则false。
 */
public class TestOperation04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * boolean a = false; boolean b = false;
		 * 
		 * System.out.println(a&b); System.out.println(a|b); System.out.println(!a);
		 * //异或 System.out.println(a^b);
		 */
		
		//短路
//		int c = 3/0;
//		System.out.println(c);
		/*
		 * a:&&具有短路效果。左边是false，右边不执行。
		 * b:||具有短路效果。左边是true,右边不执行
		 */
		boolean b3 = 1>2 || 2<(3/0);
		System.out.println(b3);

	}

}
