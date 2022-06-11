package practice;

public class Chapter5_1 {
	public static void main(String[] args) {
		introduceOneself();
	}

	public static void introduceOneself() {
		System.out.print("名前：");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.print("年齢：");
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.print("身長(cm)：");
		double height = new java.util.Scanner(System.in).nextDouble();
		System.out.print("十二支(一文字)：");
		String zodiac = new java.util.Scanner(System.in).nextLine();
//		char zodiac = new java.util.Scanner(System.in).next();
		System.out.println("私の名前は" + name + "です。年齢は" + age + "歳で、身長は"
		+ height + "cm、" + "十二支は" + zodiac + "です。");
	}
}
