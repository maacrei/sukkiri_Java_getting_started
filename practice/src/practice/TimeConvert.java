package practice;

import java.util.Scanner;

public class TimeConvert {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What time is it in EDT?");
		String timeInput = in.nextLine();
		int edt = Integer.parseInt(timeInput);
		System.out.println("PDT: " + convert(edt, -3));
		System.out.println("GMT: " + convert(edt, 4));
		System.out.println("JST: " + convert(edt, 13));
	}
	
	public static int convert(int edt, int deff) {
		int returnValue = edt + deff;
		if(returnValue > 23) {
			returnValue = returnValue - 24;
		} else if(returnValue < 0) {
			returnValue = returnValue + 24;
		}
		return returnValue;
	}
}
	// EDT 米国東部標準時(夏時間)
	// PDT 米国太平洋標準時(夏時間)
	// GMT グリニッジ標準時
	// JST 日本標準時
