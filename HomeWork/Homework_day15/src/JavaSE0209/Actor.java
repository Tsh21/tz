package JavaSE0209;

public class Actor extends Person{
	public Actor() {
		super();
	}
	public Actor(String name,int age) {
		super(name,age);
	}
	// 18岁的演员景甜在吃小龙虾
	public void eat() {
		System.out.println(this.getAge()+"的演员"+this.getName()+"在吃小龙虾");
	}
	//18岁的演员景甜在跳白天鹅.
	public void dance() {
		System.out.println(this.getAge()+"的演员"+this.getName()+"在跳白天鹅.");
	}
}
