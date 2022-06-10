package practice;

public class Chapter4_4 {
	public static void main(String[] args) {
		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		//for文
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == input) {
				System.out.println("アタリ！");
			}
		}
		//拡張for文
//		for (int n : numbers) {
//			if (n == input) {
//				System.out.println("アタリ！");
//			}
//		}
	}
}
