package practice;

import java.util.Scanner;

public class Free {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        
        String[] array = value.split(" ");
        int t1 = Integer.valueOf(array[0]);
        int t2 = Integer.valueOf(array[1]);
        
        int t = t2 - t1;
        
        if (t > 0) {
            System.out.println("+" + t);
        } else {
            System.out.println(t);
        }
	}
}
