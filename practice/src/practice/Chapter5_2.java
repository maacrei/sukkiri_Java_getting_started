package practice;

public class Chapter5_2 {
	public static void main(String[] args) {
		email("こんにちは。", "sample@email", "来週ご飯を食べに行こう！");
	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
}
