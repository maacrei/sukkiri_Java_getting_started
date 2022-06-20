package practice;

public class Hero {
	String name; //フィールドを追加
	int hp; //フィールドを追加
	
	//オフジェクト指向に基づいて作るメソッドには普通はstaticは付けない（詳しくは14章で）
	public void sleep() {
		this.hp = 100; //this 自分自身のhpフィールド
		System.out.println((this.name) + "は、眠って回復した！"); //this 自分自身のnameフィールド
	}
	public void sit(int sec) { //座るメソッド、何秒座るか引数で受け取る
		this.hp += sec; //座る秒数だけHPを増やす
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	public void slip() { //転ぶメソッド
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
	public void run() { //逃げるメソッド
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
}
