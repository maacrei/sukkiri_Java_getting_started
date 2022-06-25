package chapter10_3;

public class PoisonMatango extends Matango {
	int poisonCount = 5;
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	public void attack(Hero h) {
		super.attack(h);
		if (this.poisonCount > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int dmg = h.hp / 5;
			h.hp -= dmg;
			System.out.println(dmg + "ポイントのダメージ！");
			this.poisonCount--;
		}
	}

//	public PoisonMatango(char suffix) {
//		super(suffix);
//	}
//
//	public void attack(Hero h) {
//		int poisonAttack = 5;
//		System.out.println("キノコ" + this.suffix + "の攻撃");
//		System.out.println("10のダメージ");
//		h.hp -= 10;
//		if (poisonAttack != 0) {
//			System.out.println("さらに毒の胞子をばらまいた！");
//			int poisonDamage = h.hp / 5;
//			System.out.println(poisonDamage + "ポイントのダメージ！");
//			poisonAttack = poisonAttack - 1;
//		}
//	}
}
