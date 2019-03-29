package com.itheima.level2_04;

public class Test16 {

	public static void main(String[] args) {
		login("admin", "admin");
	}
	
	public static void login(String name,String pwd) {
		if(!name.equals("admin")) {
			throw new LoginException("用户名"+name+"不存在");
		}
		if(!pwd.equals("admin")) {
			throw new LoginException("密码错误");
		}
		
		System.out.println("欢迎："+name);
	}

}
