package com.igeek;

/**
 * @author zx
 * @date 2019年3月29日
 * @version 1.0
 * @description:
 * Object是所有类的根类
 * Object里的方法所有类都可以使用
 */
public class Test {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	private int age;
	private String name;
	public static void main(String[] args) {
		Test test = new Test();
	}
	
	
}
