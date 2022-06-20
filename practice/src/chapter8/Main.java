package chapter8;

public class Main {
	public static void main(String[] args) {
		Cleric c = new Cleric();
		c.name = "アサカ";
		c.hp = 50;
		c.mp = 10;
		
		c.selfAid();
		c.pray(2);
		
		System.out.println(c.name + "のHPは" + c.hp + "、MPは" + c.mp + "になった");
	}
}