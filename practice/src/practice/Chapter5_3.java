package practice;

public class Chapter5_3 {
	public static void main(String[] args) {
		//email("こんにちは。", "sample@email", "来週ご飯を食べに行こう！");
		email("sample@email", "来週ご飯を食べに行こう！");
	}

	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
}
