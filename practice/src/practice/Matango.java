package practice;

public class Matango {
	int hp; //フィールドを追加
	final int LEVEL = 10; //フィールド宣言と同時に初期値も設定（finalが付いているので定数）
	char suffix;
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}
}
