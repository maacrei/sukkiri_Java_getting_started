package chapter10;

public class SuperHero extends Hero {
	boolean flying;
	//飛ぶ
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	//着地する
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	//逃げる　親クラスにも定義してあるが、子クラスで再定義(上書き)するメソッド
	public void run() {
		System.out.println(this.name + "は撤退した");
	}
	//オーバーライド
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
//		if (this.flying) {
//			System.out.println(this.name + "の攻撃");
//			m.hp -= 5;
//			System.out.println("5ポイントのダメージをあたえた！");
//		}
		super.attack(m);
		if (this.flying) {
			super.attack(m);
		}
	}
	public SuperHero() {
		super(); //記述しなくても自動的に挿入される「暗黙のsuper()」
		System.out.println("SuperHeroのコンストラクタが動作");
	}
}
