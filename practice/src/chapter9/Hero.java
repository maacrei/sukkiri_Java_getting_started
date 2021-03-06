package chapter9;

public class Hero {
	String name;
	int hp;
	Sword sword;
	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println(this.name + "は" + this.sword.name + "で攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}
	
	//「newされた直後に自動的に実行される処理」を書いたメソッド
	// コンストラクタという
	// メインクラスで勇者のHPを初期値としてセットする必要がなくなる(下記が自動で呼び出されるため)
	public Hero(String name) { //引数として文字列を1つ受け取る
		this.hp = 100; //hpフィールドを100で初期化
		this.name = name; //引数の値でnameフィールドを初期化
	}
	public Hero() {
		this("ダミー"); //上記のコンストラクタを呼び出すようJVMに依頼する
	}
}
