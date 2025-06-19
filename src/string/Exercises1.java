package string;

public class Exercises1 {
	public static String reverseWithStringBuilder(String input) {
		return new StringBuilder(input).reverse().toString();
	}
	public static void main(String[] args) {
		System.out.println(reverseWithStringBuilder("Hello"));
	}
}
