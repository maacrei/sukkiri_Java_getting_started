package chapter9;

public class Wizard {
	String name;
	int hp;
	public void heal(Hero h) { //引数はHero型
		h.hp += 10; //勇者のHPに10を加える
		System.out.println(h.name + "のHPを10回復した！");
	}
}
