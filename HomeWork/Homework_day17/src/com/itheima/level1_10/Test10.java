package com.itheima.level1_10;

public class Test10 {
	
	public static void main(String[] args) throws Exception {
		testThrows();
	}
	
	public static char charAt(String str, int index) throws Exception {
		//a)当字符串为null抛出 Exception("字符串不能为null")异常,
		if(str == null) {
			throw new Exception("字符串不能为null");
		}
		//b)当字符串为"" 的时候抛出 Excetion("字符串不能为空") 异常;
		if(str.equals("")) {
			throw new Exception("字符串不能为空");
		}
		//c)当index不在 [0,str.length()-1] 之间的时,抛出Exception("索引越界") 异常. 
		if(index <0 || index >=str.length()) {
			throw new Exception("索引越界");
		}
		//否则返回str在index索引的字符
		return str.charAt(index);
	}
	
	public static void testThrows() throws Exception {
		
//		try {
			char c;
			charAt(null, 0);
//			charAt("", 0);
//			charAt("abc", 4);
//			c = charAt("abc", 1);
//			System.out.println(c);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
