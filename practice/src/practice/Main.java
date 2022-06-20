package practice;

public class Main {
	public static void main(String[] args) {
		//勇者を生成
		Hero h = new Hero(); //Heroクラスからインスタンスを生成し、変数hに入れる
		//フィールドに初期値をセット
		h.name = "ミナト"; //変数hのnameに代入
		h.hp = 100; //変数hのhpに代入
		
		Matango m1 = new Matango(); //お化けキノコAを生成し初期化
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		//冒険のはじまり
		h.slip();
		m1.run();
		m2.run();
		h.run();
	}
}
