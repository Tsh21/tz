package javabase_day03;

/**
 * @author zx
 * @date 2019年3月1日
 * @version 1.0
 * @description：
 * break的作用：跳出单层循环
 * break的使用场景：
	在选择结构switch语句中
	在循环语句中
	离开使用场景的存在是没有意义的，不能单独使用
 */
public class TestBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=1; x<=10; x++) {
			if(x == 3) {
				break;
			}
			System.out.println(x);
		}

	}

}
