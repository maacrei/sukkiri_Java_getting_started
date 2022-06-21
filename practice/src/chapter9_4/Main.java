package chapter9_4;

public class Main {
	public static void heal(int hp) {
		hp += 10;
	}
	public static void heal(Thief thief) {
		thief.hp += 10;
	}
	public static void main(String[] args) {
		int baseHp = 25;
		Thief t = new Thief("アサカ", baseHp);
		heal(baseHp);
		System.out.println(baseHp + " : " + t.hp);
		heal(t);
		System.out.println(baseHp + " : " + t.hp);
	}
}

//実行結果
//25 : 25
//25 : 35

/*
このように表示される理由
healメソッドの呼び出しにint型のbaseHpを渡しても呼び出し元の値は変化しない。
一方、Thiefインスタンスを渡すと呼び出し元でもhpが変化する。
これは、引数がint型の場合、変数baseHpの値が引数hpにコピーされる値渡しにより、
メソッド内での代入は呼び出し元へ影響しないため。
引数がクラス型の場合、変数tが示すアドレスが引数thiefにコピーされる参照渡しにより、
t.hpとthief.hpはメモリの同じ場所を指すことになる。
そのため、thief.hpへの代入がt.hpにも反映しているように見える。
*/
