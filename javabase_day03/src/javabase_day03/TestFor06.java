package javabase_day03;

/**
 * @author zx
 * @date 2019年3月1日
 * @version 1.0
 * @description：
 * 需求：在控制台输出所有的”水仙花数”
 * 
 * 分析：
 * 		什么是水仙花数呢?
 * 			所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
 *			举例：153就是一个水仙花数。
 *			153 = 1*1*1 + 5*5*5 + 3*3*3
 * 举例：我有一个数据153，请问如何获取到个位，十位，百位
 *			个位：153%10 = 3;
 *			十位：153/10%10 = 5;
 *			百位：153/10/10%10 = 1;
 *			千位：...
 *			万位：...
 *	C:让每个位上的立方和相加，并和该数据进行比较，如果相等，就说明该数据是水仙花数，在控制台输出

 */
public class TestFor06 {

	public static void main(String[] args) {
		//通过循环获取到每一个三位数
		for(int x=100; x<1000; x++) {
			//获取个位，十位，百位
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			//Math.pow();		
			//让每个位上的立方和相加，并和该数据进行比较，如果相等，就说明该数据是水仙花数，在控制台输出
			if((ge*ge*ge+shi*shi*shi+bai*bai*bai) == x) {
				System.out.println(x);
			}
		}
	}

}
