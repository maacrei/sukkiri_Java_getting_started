package practice;
//もっと簡潔に！
import java.util.Scanner;

public class Ans_event {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("イベントポイント報酬 〜目標ノルマざっくり計算プログラム〜");
		System.out.println(" (イベントの開始日と終了日は加味せず、７日間でおわらせる計算)");

		System.out.print("目標ポイント：");
		int point = scanner.nextInt();

		System.out.println(" １日目ノルマ " + firstDayPoints(point));
		System.out.println(" ２日目ノルマ " + secondDayPoints(point));
		System.out.println(" ３日目ノルマ " + thirdDayPoints(point));
		System.out.println(" ４日目ノルマ " + fourthDayPoints(point));
		System.out.println(" ５日目ノルマ " + fifthDayPoints(point));
		System.out.println(" ６日目ノルマ " + sixthDayPoints(point));
		if ((point % 7) != 0) {
			System.out.println(" ７日目ノルマ " + (seventhDayPoints(point) + (point % 7)));
		} else {
			System.out.println(" ７日目ノルマ " + seventhDayPoints(point));
		}
		System.out.print("ノルマ合計：");
		System.out.println(firstDayPoints(point) + secondDayPoints(point) + thirdDayPoints(point) + fourthDayPoints(point)
		                   + fifthDayPoints(point) + sixthDayPoints(point) + seventhDayPoints(point)+ (point % 7));

		scanner.close();
	}

	public static int firstDayPoints(int point) {
		int firstDay = point / 7;
		return firstDay;
	}

	public static int secondDayPoints(int point) {
		int secondDay = point / 7;
		return secondDay;
	}

	public static int thirdDayPoints(int point) {
		int thirdDay = point / 7;
		return thirdDay;
	}

	public static int  fourthDayPoints(int point) {
		int fourthDay = point / 7;
		return fourthDay;
	}

	public static int  fifthDayPoints(int point) {
		int fifthDay = point / 7;
		return fifthDay;
	}

	public static int  sixthDayPoints(int point) {
		int sixthDay = point / 7;
		return sixthDay;
	}

	public static int  seventhDayPoints(int point) {
		int seventhDay = point / 7;
		return seventhDay;
	}
}
