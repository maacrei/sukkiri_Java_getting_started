package practice;

import java.util.Scanner;

public class Free {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (s1 != null) {
            System.out.println("DANGER");
        } else {
            System.out.println("OK");
        }
        sc.close();
	}
}
