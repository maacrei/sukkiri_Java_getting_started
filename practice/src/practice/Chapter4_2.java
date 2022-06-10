package practice;

public class Chapter4_2 {
	public static void main(String[] args) {
		int[] moneyList = {121902, 8302, 55100};
		//for文
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		//拡張for文
		for (int money : moneyList) {
			System.out.println(money);
		}
	}
}
