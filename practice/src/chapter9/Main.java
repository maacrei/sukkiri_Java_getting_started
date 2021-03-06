package chapter9;

public class Main {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h1 = new Hero("ミナト");
		h1.sword = s; //swordフィールドに生成済みの剣インスタンスを代入
		System.out.println("現在の武器は" + h1.sword.name); //h.sword.name → 勇者「の」剣「の」名前
		h1.attack();
		Hero h2 = new Hero("アサカ");
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		Hero h3 = new Hero();
		System.out.println(h1.hp);
		System.out.println(h1.name);
		System.out.println(h3.hp);
		System.out.println(h3.name);
	}
}
