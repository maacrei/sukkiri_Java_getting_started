package review;

public class Main {
	public static void main(String[] args) {
		Thief t1 = new Thief("ミナト", 30, 3);
		System.out.println(t1.name + "のHPは" + t1.hp + "で、MPは" + t1.mp);
		
		Thief t2 = new Thief("アサカ", 20);
		System.out.println(t2.name + "のHPは" + t2.hp + "で、MPは" + t2.mp);
		
		Thief t3 = new Thief("スガワラ");
		System.out.println(t3.name + "のHPは" + t3.hp + "で、MPは" + t3.mp);
		
		Cleric c1 = new Cleric("クレア");
		System.out.println(c1.name + "のHPは" + c1.hp + "で、MPは" + c1.mp);
	}
}
