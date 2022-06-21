package chapter9_4;

public class Thief {
	String name;
	int hp;
	int mp;
	
	public Thief(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public Thief(String name, int hp) {
		this(name, hp, 5); //下記3行はこの1行で記述できる
		//this.name = name;
		//this.hp = hp;
		//this.mp = 5;
	}
	public Thief(String name) {
		this(name, 40); //下記3行はこの1行で記述できる
		//this.name = name;
		//this.hp = 40;
		//this.mp = 5;
	}
}
