package javabase_day03;

/**
 * @author zx
 * @date 2019年3月1日
 * @version 1.0
 * @description：需求：求出1-100之间偶数和	
 */
public class TestFor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		//获取1-100之间的数据，用for循环实现
		for(int x=1; x<=100; x++) {
			//把获取到的数据进行判断，看是否是偶数
			if(x%2 ==0) {
				sum += x;
			}
		}
		
		//输出求和结果
		System.out.println("sum:"+sum);

		
	}

}
