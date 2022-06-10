package practice;

public class Chapter4_3 {
	public static void main(String[] args) {
		int[] counts = null;
		float[] heights = {171.3F, 175.0F};
		System.out.println(counts[1]); //発生する例外の名前：NullPointerException
		System.out.println(heights[2]); //発生する例外の名前：ArrayIndexOutOfBoundsException
	}
}
