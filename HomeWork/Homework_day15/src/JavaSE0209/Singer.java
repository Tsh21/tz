package JavaSE0209;

public class Singer extends Person{
	public Singer() {
		super();
	}
	public Singer(String name,int age) {
		super(name,age);
	}
	//30岁的歌手薛之谦在吃大闸蟹
	public void eat() {
		System.out.println(this.getAge()+"的歌手"+this.getName()+"吃大闸蟹");
	}
	public void dance() {
		System.out.println(this.getAge()+"的歌手"+this.getName()+"在演唱丑八怪");
	}
}
