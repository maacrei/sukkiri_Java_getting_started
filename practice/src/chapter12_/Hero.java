package chapter12_;

public class Hero extends Character {
	String name = "湊";
	int hp;
//	12_9
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("的に10ポイントのダメージをあたえた！");
		m.hp -= 10;
	}
}
