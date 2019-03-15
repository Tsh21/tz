package com.igeek;

public class TestObject {

	public static void main(String[] args) {
		TestObject tb = new TestObject();
		TestObject tb2 = new TestObject();
		System.out.println(tb.toString());
		System.out.println(tb);
		
		Person2 p2 = new Person2("fxd", 23);
		Person2 p3 = new Person2("fxd", 20);
		System.out.println(p2);
		
		System.out.println("#########");
		System.out.println(tb==tb2);
		System.out.println(1==2);
		System.out.println(2==2);
		System.out.println("#########");
		System.out.println(tb.equals(tb2));
		System.out.println("#########");
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		System.out.println("#########");
		System.out.println(p2==p3);
		System.out.println(p2.equals(p3));
	}

//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "测试Object对象";
//	}

}

class Person2{
	String name;
	int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person2 [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Person2 other = (Person2) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
//	public String toString() {
//		return "姓名:"+name+";年龄:"+age;
//	}
	
	
	
	
}