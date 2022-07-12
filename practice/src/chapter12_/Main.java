package chapter12_;

public class Main {
	public static void main(String[] args) {
//		12_6
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		Thief t1 = new Thief();
		Wizard w1 = new Wizard();
		Wizard w2 = new Wizard();
//		冒険開始
//		まず宿屋に泊まる
		h1.hp += 50;
		h2.hp += 50;
		t1.hp += 50;
		w1.hp += 50;
		w2.hp += 50;
		
//		12_7
		Character[] c = new Character[5];
		c[0] = new Hero();
		c[1] = new Hero();
		c[2] = new Thief();
		c[3] = new Wizard();
		c[4] = new Wizard();
//		宿屋に泊まる
		for (Character ch : c) { //1名ずつ順に取り出す
			ch.hp += 50;
		}
		
//		12_10 同じ指示で異なる動作をさせることができる
		Monster[] monsters = new Monster[3];
		monsters[0] = new Slime();
		monsters[1] = new Goblin();
		monsters[2] = new DeathBat();
		for (Monster m : monsters) {
			m.run();
		}
	}
}
