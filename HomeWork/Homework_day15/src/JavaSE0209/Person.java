package JavaSE0209;

public class Person {
	private String name;
	private int age;
	public void eat() {
		System.out.println(this.age+";"+this.name);
	}
	public Person() {
		this.name="";
		this.age=0;
	}
	public Person(String name,int age) {
		this.age=age;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
